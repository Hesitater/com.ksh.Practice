package quizExample;

import java.util.Scanner;

public class Ex04CharAt {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		while (true) {
			System.out.print("입력 : ");
			String input = scanner.next();
			
			
			if (input.equals("q")) {
				break;
			}

			int len = input.length();
			int center = len / 2;

			System.out.println("가운데 문자는:" + input.charAt(center));
			System.out.println("가운데 문자는:" + input.charAt(input.length() / 2));
		}

	}
}
