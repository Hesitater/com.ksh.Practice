package blogExample01.eg;

import java.util.Scanner;

public class IfEx01 {
	public static void main(String[] args) {
		
	// 문제 : 정수 2개를 입력 받아서 어떤 값이 큰수인지 출력, 만약 같은수라면 "같은 수입니다"
	
	
		 Scanner scan = new Scanner(System.in);
		 
		 System.out.println("숫자비교할끄야");
		 System.out.print("> ");
		 int num1 = scan.nextInt();
		 System.out.print("> " );
		 int num2 = scan.nextInt();
		 
		 if( num1 > num2 ) {
			 System.out.println(num1 + " 와 " + num2 + " 중 더 큰수는 " + num1 +" 입니다");
		 } else if (num1 < num2) {
			 System.out.println(num1 + " 와 " + num2 + " 중 더 큰수는 " + num2 +" 입니다");
		 } else {
			 System.out.println(num1 + " 와 " + num2 +" 는 같은 수 입니다");
		 }
		 scan.close();

     }
}
