package blogExample01.quiz07;

import java.util.Scanner;

public class quiz07Ex02 {
	public static void main(String[] args) {
		//정수를 입력 받아서,, 입력 받은 정수까지 수 중에 소수들의 합계
		
		Scanner scan = new Scanner(System.in);
		
		System.out.print("정수 입력>");
		int x = scan.nextInt();
		int sum = 0;
		
		for(int i = 1; i <= x; i++) {
			int count = 0;
			
			for(int j = 1; j <= i; j++) {
				
				if( i % j == 0) {
					count++;
				}
			}
			if( count == 2) {
				System.out.printf("%d ", i);
				sum += i;
			}
			
		}
		System.out.println();
		System.out.printf("소수들의합 : %d ", sum);
		
	}
}
