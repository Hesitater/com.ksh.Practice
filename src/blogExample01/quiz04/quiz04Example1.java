package blogExample01.quiz04;

import java.util.Scanner;

public class quiz04Example1 {
	public static void main(String[] args) {
//		 키가 140 이상이고 , 나이가 8세 이상이여야 놀이기구 탑승이 가능합니다.
		
		Scanner scan = new Scanner(System.in);
		
		System.out.print("키입력> ");
		double cm = scan.nextDouble(); // 실수 double 은 nextDouble 로 받는다
		
		System.out.print("몇살이니? >");
		int age = scan.nextInt();
		
		if( cm >= 140 && age >= 8) { //A && B A와B
			 System.out.println("놀이기구 가능 ㅅㄱ");
		} else {
			System.out.println("못탐 ㅅㄱ");
		} 
		 scan.close();
		 
		
	}
}
