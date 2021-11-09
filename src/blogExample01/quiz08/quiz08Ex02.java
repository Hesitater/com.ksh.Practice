package blogExample01.quiz08;

import java.util.Scanner;

public class quiz08Ex02 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.print("배정할 좌석의 크기를 지정하세요>");
		int seatNum = scan.nextInt();
		
		int[] arr = new int[seatNum];
		
		
	ct:	for (int i = 0; i < arr.length; i++) {
		arr[i] = (int)(Math.random()*arr.length) +1;
			
			for( int j = 0; i < j; j++) {
				if(arr[i] == arr[j]) {
					
				i--;
				continue ct;
				} // if
			} //for j
		}   // for i
		
	es:   while(true) {
			int count = 0;    // 이미 선택된 자리으 ㅣ개수
			
			System.out.println("--------------좌석 선택 프로그램 ----------");
			for( int i = 1; i <= arr.length; i++) {
				System.out.printf("%-3d", i);
			}
			System.out.println();
			
			for( int i = 0; i < arr.length; i++) {
				if(arr[i] != 0) {
					System.out.printf("%-3s","o");
				} else {
					System.out.printf("%-3s","●");
				}
			}
			
			if( arr[seatNum -1] == 0) {
				System.out.println("이미 선택된 좌석이네요");
				continue;
			} 
			System.out.printf("자리번호를 공개합니다 : %d", arr[seatNum-1]);
			System.out.println();
			
			arr[seatNum - 1] = 0;
			
			for(int i = 0; i < arr.length; i++) {
				if( arr[i] == 0) count++;
			}
			if(count >= arr.length) break es;
	}
		
	}
}
