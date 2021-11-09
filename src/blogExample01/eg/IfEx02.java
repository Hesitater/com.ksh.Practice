package blogExample01.eg;

import java.util.Scanner;

public class IfEx02 {
	public static void main(String[] args) {
		//입력 받은 점수를 A,B,C,D,F 등급으로 분리
		
		Scanner scan = new Scanner(System.in);
		
		System.out.print("점수> ");
		int point = scan.nextInt();
		
		if( point > 100) {
			System.out.println("점수가 100초과로 등급안나옴");
		}  else if ( point >= 95) {
			System.out.println("너의 점수는 " + point + " 너의 등급은 A+ " );
		} else if( point >= 90 ) {
			System.out.println("너의 점수는 " + point + " 너의 등급은  A " );
		} else if( point >= 80) {
			System.out.println("너의 점수는 " + point + " 너의 등급은  B " );
		} else if(point >= 70) {
			System.out.println("너의 점수는 " + point + " 너의 등급은  C " );
		} else if( point >= 60) {
			System.out.println("너의 점수는 " + point + " 너의 등급은  D " );
		} else {
			System.out.println("너의 점수는 " + point + " 재수강 해버렷!FFFFF" );
		}
		
		scan.close();
		
		
	}
}
