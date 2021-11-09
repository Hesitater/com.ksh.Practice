package blogExample01.quiz05;

import java.util.Scanner;

public class quiz05Ex01_1 {
	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		System.out.print("정수첫번째입력> ");
		int x = scan.nextInt();
		System.out.print("[ +, -, *, / ] > ");
		String rules = scan.next();
		System.out.print("정수두번째 입력> ");
		int y = scan.nextInt();

		int result = 0;

		switch (rules) {
		case "+":
			result = x + y;
			System.out.println("네가 고른 사칙연산  + " + result);
			break;
		case "-":
			result = x - y;
			System.out.println("네가 고른 사칙연산 - " + result);
			break;
		case "*":
			result = x * y;
			System.out.println("네가 고른 사칙연산 * " + result);
			break;
		case "/":
			result = x / y;
			System.out.println("네가 고른 사칙연산 / " + result);
			break;

		default:
			System.out.println("잘못 입력한게 아닐까..?");
			break;
		}

		scan.close();
	}
}
