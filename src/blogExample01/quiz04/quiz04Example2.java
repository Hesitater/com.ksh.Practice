package blogExample01.quiz04;

import java.util.Scanner;

public class quiz04Example2 {
	public static void main(String[] args) {

		// 스캐너를 이용해서 정수를 1개 입력받고 , 0 인지 음수인지 양수라면 홀수인지 짝수인지 구분하기
		// 양수 0 음수 는 부호를 생각 해야 겠죠?
		Scanner scan = new Scanner(System.in);

		System.out.print("정수입력> ");
		int num = scan.nextInt();

		System.out.print(num + "--->");

		if (num < 0) {
			System.out.println("음수 입니다");
		} else if (num == 0) {
			System.out.println("영은 0");
		} else {
			if (num % 2 == 0) {
				System.out.println("양수 이면서 짝수이네용?");
			} else {
				System.out.println("양수 이면서 홀수");
			}
		}

		scan.close();
		
	}
}
