package com.ksh.zero;

import java.util.Arrays;
import java.util.Scanner;

public class practice07 {
	public static void main(String[] args) {
		
		//- 입력한 수 까지의 크기를 갖는 배열을 생성, 1부터 입력받은 수까지 순서대로 배열에 저장
		//ex ) 입력수 : 10
		// [1,2,3,4,5,6,7,8,9,10]
		
//		Scanner scan = new Scanner(System.in);
//	
//		System.out.print("정수를 1개 입력하세요 -> ");
//		int x = scan.nextInt();
//		int[] arr = new int[x];
//		
//		int i = 0;
//		while( i < x ) {
//			arr[i] = i +1;
//			
//			i++;
//			
//		}
//		
//		System.out.println(Arrays.toString(arr));
//		
//		scan.close();
//		
		
		
		
		//- 동전 , 금액 을 큰 금액부터 거슬러서 몇개가 나오는지 출력.
		
		int[] arr = {1000, 500, 100, 50, 10};
		
		int money = 16690; //금액
		
		System.out.println("금액 : " + money + "원");
		
		int i = 0;
		while( i < arr.length ) {
			System.out.println(arr[i] + "원 : " + money / arr[i] );
			money %= arr[i];  
			i++;
			
			
		}
		
		System.out.println(money);
		
		
		
		
		
		
		
	}
}
