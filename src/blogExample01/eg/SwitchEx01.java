package blogExample01.eg;

import java.util.Scanner;

public class SwitchEx01 {
	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		System.out.print("스캔으로 받아서 가능?>>");
		int a = scan.nextInt();

		// switch 구문의 소괄호에는 변수나, 변수에 대한 연산식이 들어감

		switch (a) {
		case 0:

		case 1:
			System.out.println("안녕하세요1");
			break;

		case 2:
			System.out.println("감사합니다2");
			break;
		case 3:
			System.out.println("좋아요3");
			break;

		default:
			System.out.println("안녕감사좋아 도아닌 나머지 숫자");
			break;
		}

		scan.close();

	}
}
