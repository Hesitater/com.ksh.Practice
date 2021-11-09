package blogExample01.quiz05;

import java.util.Scanner;

public class quiz05Ex02_1 {
	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		System.out.print("구구단수를 입력하세요 > ");
		int x = scan.nextInt();

		System.out.println("랜덤구구단 " + x + "단");
		System.out.println("---------결과값-------");

		int i = 1; // 제어변수 : 반복문의 횟수를 제어할 변수

		while (i <= 9) {
			System.out.printf("%d X %d = %d\n", x, i, x*i);
			i++;
		}
		scan.close();
		

	}
}
