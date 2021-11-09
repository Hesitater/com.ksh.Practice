package blogExample01.eg;

import java.util.Arrays;
import java.util.Scanner;

public class WhileEx03 {
	public static void main(String[] args) {
//		//입력받은 수가 소수인지 아닌지 검증
//		
//		Scanner scan = new Scanner(System.in);
//		
//		System.out.print("입력받은 값> ");
//		int num = scan.nextInt();
//		
//		int x = 2;
//		while(num % x != 0) {
//			x++;
//		}
//		System.out.println(num == x? num + "는 소수" : num + "는 소수가아니다");
//		
//		scan.close();
//		

		
//		//정수 하나씩 하다가 0은 입력했을시 위에 입력해놓은 정수들의 합이 나온다
//		Scanner scan = new Scanner(System.in);
//		
//		int sum = 0; //합계 변수
//		int x = 1;
//		
//		while(x != 0) {
//			System.out.print("정수입력> ");
//			x = scan.nextInt();
//			sum += x;
//			
//		}
//		
//		System.out.println("총합: " + sum);
//		
//		scan.close();
		
//		//10번 숫자를 입력받고 , 입력 받은 값들의합
//		Scanner scan = new Scanner(System.in);
//		int sum = 0; // 합계변수
//		
//		int x = 1;
//		while( x <= 10) {
//			System.out.print("정수입력>" );
//			int p = scan.nextInt();
//			
//			sum += p; // sum = sum + p
//			x++;
//			
//		}
//		System.out.println("입력받은수의합 : " + sum);
//		
//		scan.close();
//		
		
		//5.배열에 순차적인 접근은 0에서 길이 미만까지 반복문을 사용하여 배열 요소의합을 구해본다.
		
		int[] arr = {1,2,3,4,5,6,7,8,9,10}; //배열의생성,선언 초기화
		System.out.println(Arrays.toString(arr));
		System.out.println(arr.length);
		int sum = 0; // 합계변수
		
		int x = 0;     // 배열의 index번호가 0부터 시작하기떄문에 x에 0대입
		while( x < arr.length) { // (x <= arr.length) 도 가능
			
			sum += arr[x]; // 배열의 요소를 누적
			x++;
		}
		System.out.println("배열 요소의합 : " + sum);
		
	}
}
