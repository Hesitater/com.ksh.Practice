package blogExample01.quiz05;

import java.util.Scanner;

public class quiz05Ex03 {
	public static void main(String[] args) {

		// 1. 1~100까지 정수중에 3의배수이거나, 4의배수일경우 가로로 출력
		// 2. 1~200까지 정수중 5의배수의 합.
		// 3. 1~200까지 정수중에 4의 배수이면서 8의 배수가 아닌 수의 개수
		// 4. 두 정수를 입력 받아서 두 정수 사이의 합을 구하자(같은 경우는 없다고 가정, 앞에 큰수 or 뒤에 큰수 상관없게)
		
		System.out.println("------------------문제 1--------------");
		int x = 1; // 제어변수 설정

		while (x <= 100) {

			if (x % 3 == 0) {
				System.out.println(x);
			} else if (x % 4 == 0) {
				System.out.println(x);
			}
			x++;
		}

		System.out.println("------------------문제 2--------------");
		int sum = 0;
		int y = 1;
		while (y <= 200) {
			if (y % 5 == 0) {
				sum += y;
			}
			y++;

		}

		System.out.println("5의배수의합의 개수 : " + sum);
		
		System.out.println("----------------문제3 -------------");
		int z = 1;
		int count = 0;
		
		while(z <= 200) {
			if( z % 4 == 0 && z % 8 !=0) {
				 count++;
			} 
			z++;
		}
		System.out.println("200까지 4의배수이고 8의배수아닌 수 몇개? " + count);
		
		//- 1000의 약수의 개수
		
		int p= 0;    //약수의개수
		int q = 1;	 // 나눌 숫자
		
		while( q <= 1000) {
			if(1000 % q == 0) {
				p++;         // 1000을 q로 나눠서 0이면 약수라서 p값증가
			}
			q++;          //
		}
		
		System.out.println("1000의 약수의 개수 :" + p);
		
		// 4. 두 정수를 입력받아서 두 정수 사이의 합(같은 경우는 없다고 가정)
				// 입력값: 5, 1 -> 출력값: 1+2+3+4+5 = 15
				// 큰수, 작은수를 먼저 구별 -> 반복문

			Scanner scan = new Scanner(System.in);
			
			System.out.print("첫번쨰정수 > ");
			int a = scan.nextInt();
			System.out.print("두번째 정수 > ");
			int b = scan.nextInt();
			
			
			int max = a > b ? a : b;
			int min = a < b ? a : b;
			
			int result = 0;
			while( min <= max) {
				result += min;
				min++;		
			}
			System.out.println("두수의합 : " + result);
			
			scan.close();
			
			
			
		
	}
}
