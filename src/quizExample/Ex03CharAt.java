package quizExample;

import java.util.Scanner;

public class Ex03CharAt {
	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		String str = new String();
		char x = ' ';
		int i = 0;
		
		boolean run = true;

		while (run) {

			System.out.print("입력: ");
			str = scan.next();
			i = (str.length() / 2);
			
			
			if (str.equals("stop")) {
				run = false;
				break;
			}
			
			
			if (x % 2 == 0) {
				System.out.println("가운데 글자는 " + str.charAt(i));
			} else {
				System.out.println("가운데 글자는 " +str.charAt(i+1));
			}
			
		}
	}
}
