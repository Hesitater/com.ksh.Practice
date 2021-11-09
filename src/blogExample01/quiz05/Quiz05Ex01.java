package blogExample01.quiz05;

import java.util.Scanner;

public class Quiz05Ex01 {
	public static void main(String[] args) {
		// - 결과값을 보고 코드를 완성 시키시오

		Scanner scan = new Scanner(System.in);

		System.out.print("정수첫번째입력> ");
		int x = scan.nextInt();
		System.out.print("[ +, -, *, / ] > ");
		String rules = scan.next();
		System.out.print("정수두번째 입력> ");
		int y = scan.nextInt();

		switch (rules) {
		case "+":
			System.out.println("네가 고른 사칙연산  + : " + (x + y));
			break;
		case "-":
			System.out.println("네가 고른 사칙연산 - : " + (x - y));
			break;
		case "*":
			System.out.println("네가 고른 사칙연산 * : " + (x * y));
			break;
		case "/":
			System.out.println("네가 고른 사칙연산 / : " + (x / y));
			break;

		default:
			System.out.println("잘못 입력한게 아닐까..?");
			break;
		}

		scan.close();

	}
}
