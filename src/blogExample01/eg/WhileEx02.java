package blogExample01.eg;

import java.util.Scanner;

public class WhileEx02 {
	public static void main(String[] args) {
		//입력받은 값 까지의 짝수 개수를 구하시오
		
		Scanner scan = new Scanner(System.in);
		
		System.out.print("입력받을수 >");
		int num = scan.nextInt();
		
		int count = 0; // 누적할 변수의 개수
		
		int x = 1;
		
		while( x <= num ) {
			
			if( x % 2 ==0) {
				count++;   //x가 짝수 일 경우  count +1
			}
			
			x++;
		}
		System.out.println("입력받은 값까지 짝수의 개수: " + count);
		
		scan.close();
		
		
	}
}
