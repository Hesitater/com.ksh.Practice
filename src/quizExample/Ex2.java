package quizExample;

import java.util.Scanner;

public class Ex2 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		boolean run = true;
		while (run) {

			System.out.print("입력> ");
			String str = scan.next();
			System.out.println(str.length() + "글자입니다");
			
			int i = 0;
			if (i == 0) {
				run = false;
			}
		}
		scan.close();
	}
}
