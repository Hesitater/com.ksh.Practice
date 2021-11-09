package quizExample;

import java.util.Scanner;

public class Ex3 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		boolean run = true;
		while (run) {

			System.out.print("입력> ");
			String str = scan.next();
			System.out.println(str.length() + "글자입니다");
			
			String i = "1";
			if (str.equals(i)) {
				run = false;
			}
		}
		scan.close();
		
	}
}
