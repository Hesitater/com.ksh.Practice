package quizExample;

import java.util.Scanner;

public class ExSubstringhasnext {
	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		boolean run = true;
		while (run) {

			System.out.print("입력:");

			if (scan.hasNextInt()) {
				int i = scan.nextInt();
				if (i == 0) {
					System.out.println("종료합니다.");
					break;
				}
			} else if (scan.hasNext()) {
				String str = scan.next();
				int len1 = str.length();
				int c1 = len1 / 2;
				int a = 0;
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
}
