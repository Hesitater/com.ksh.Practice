package blogExample01.quiz05;

import java.util.Scanner;

public class quiz05Ex02 {
	public static void main(String[] args) {
		// 구구단수를 입력 받아서, 입력받은 단수의 구구단을 출력 하시오.
		
		Scanner scan = new Scanner(System.in);
		System.out.print("구구단 단수를 입력하세요 > ");
		int dan = scan.nextInt();
		
		System.out.println("구구단 : " + dan + "단");
		System.out.println("---------결과---------");
		
		int a = 1;  //제어변수 : 반복문의 횟수를 제어할 변수
		while(a <= 9 ) {  
			
			System.out.println( dan + " X " + a + " = " + (dan * a) );
			a++;
		}
		scan.close();
		
	}
}
