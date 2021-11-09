package blogExample01.eg;

import java.util.Scanner;

public class continueEx02 {
	public static void main(String[] args) {
		
		//  전에 정수를 입력받고, 해당 정수까지의 소수들의 합을 출력하는 코드 
		// 이것으로 continue 예시 비교
		
		Scanner scan = new Scanner(System.in);
		
		System.out.print("정수를 입력하세요>");
		
		int num = scan.nextInt();
		int sum = 0;
		
		
	ex:	for(int i = 1; i <= num; i++) {
			
			int count = 0;
			
			for( int j = 1; j <= i; j++) {
				
				if( i % j == 0) {
					count++;
				}
			}
			
			if ( count > 2 ) continue ex;
			
			if(count == 2) {
				System.out.print(i + " ");
				
				sum += i;
			}
			
		}
		System.out.println();
		System.out.println("소수들의합: " + sum);
		
		scan.close();
		
		
		
		
//		// while문에서 반복문 사용
//		
//		int i = 1;
//		while(i <= 10) {
//			
//			if(i % 2 == 0) {
//				i++;
//				continue;
//			}
//			System.out.print(i + " ");
//			i++;
//		}
//		
//		
		
		
		
		
		
		
		
	}
}
