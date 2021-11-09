package quizExample;

import java.util.Scanner;

public class Ex04Substring01 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		boolean run = true;
		while (run) {

			System.out.print("입력:");
			String str = scan.next();
			int len1 = str.length();
			int c1 = len1 / 2;

			if (str.equals("stop")) {
				break;

			}

			if (c1 % 2 == 0) {
				System.out.println("앞절반:" + str.substring(0, c1));
				System.out.println("뒤절반:" + str.substring(c1, str.length()));
			} else {
				System.out.println("앞절반:" + str.substring(0, c1));
				System.out.println("뒤절반:" + str.substring(c1, str.length()));
			}

		}
	}
}
