package quizExample;

import java.util.Arrays;
import java.util.Scanner;

public class quiz06 {
	public static void main(String[] args) {
		
//		// Math.random() 을 사용해서 2~9까지 랜덤변수를 만들고, 구구단을 세로로 출력
//		int dan =(int)(Math.random()*8) +2 ;
//		
//		System.out.println("구구단 " + dan + "단");
//		
//		for(int i = 1; i <= 9; i++) {
//			System.out.println( dan + " X " + i + " = " + dan*i);
//		}

		
		
//		// 7~100까지 정수중에 7의 배수를 가로로 출력
//		
//		for(int i =7; i  <=100; i+=7) {
//			System.out.print(i + " ");
//			
//		}
//				
		
//		// 1~100까지 중에 12의 배수를 가로로 출력
//		
//		for (int i = 1; i <=100; i++) {
//			System.out.print( i % 12 == 0 ? i + " " : "");
//		}
//		

		// 1 ~ 200 까지 정수 중에 9의 배수의 개수
		
//		int count = 0;
//		
//		for( int i = 1; i <= 200; i ++) {
//			if( i % 9 == 0) {
//				count++;
//				System.out.print(i + " ");
//			}
//			
//		}
//		
//		System.out.println();
//		System.out.println("1~200까지 9의 배수의 개수: " +  count );
//		
		
//		// - 50 ~ 100 까지 두 수의 합
//		
//		int sum = 0;
//		for(int i = 50; i <= 100; i++) {
//			
//			sum += i;
//			
//		}
//		System.out.println();
//		System.out.println("50~100까지의 합 : " + sum);
		
//		
//		// - A ~ Z 까지 가로로 출력 ( A의 유니코드 65, Z의 유니코드 90 )
//		
//		for(char x = 'A'; x <= 'Z'; x++) {
//			
//			System.out.print(x + " ");
//			
//		}
		
		
		
		//- 두 정수를 입력받고, 두 수 사이의 합을 구하시오. ( 두 수의 크기는 정해지지 않음 )
		
//		Scanner scan = new Scanner(System.in);
//		
//		System.out.print("첫번째 정수 > ");
//		int x = scan.nextInt();
//		System.out.print("두번째 정수 > ");
//		int y = scan.nextInt();
		
//		int sum = 0;
//		if ( x == y ) {  //x = y
//			sum = 0;			
//		} else if( x > y) {  // x > y
//			for( int i = y; i <= x; i++) {
//				sum += i;
//			} 
//			
//		} else { //x < y 
//			for ( int i = x; i <= y; i++ ) {
//				sum += i;
//			}
//			
//		}
//		System.out.println( "출력받은 두수 " + x + ", " + y +"의  사이의 합: " + sum);

		
		// 삼항연산자 중첩 으로
//		Scanner scan = new Scanner(System.in);
//		
//		System.out.print("첫번째 정수 > ");
//		int x = scan.nextInt();
//		System.out.print("두번째 정수 > ");
//		int y = scan.nextInt();
//		
//		int sum2 = 0;
//		for(int i = (x == y ? 0 : (x > y? y : x)) ; i <= (x == y? 0 : (x > y? x : y)); i++) {
//			sum2 += i;
//		}
//		System.out.println( "출력받은 두수 " + x + ", " + y +"의  사이의 합: " + sum2);
//		
//		
//		scan.close();
//		
//		
		
		/*- 배열이 들어있는 값 중에서, 절대 중복되지 않는 숫자 3개를 랜덤으로 추출하려 합니다.
		 * arr에서 절대 값이 중복되지 않게 추출된 3개의 값을 새로운 배열을 옮겯 담으면 됩니다.
		 * 배열의 길이만큼 회전하고 랜덤요소를 0,1,2, index로 옮깁니다 
		 */
		
//		int[] arr = {1,2,3,4,5,6,7,8,9};
//		
//		for(int i = 0; i < arr.length ; i++) {
//			int ran = (int)(Math.random()* arr.length );
//			System.out.println(Arrays.toString(arr));
//			
//			int temp = arr[i];
//			arr[i] = arr[ran];
//			arr[ran] = temp;
//		System.out.println(ran);
//		}
//		
//		int[] rArr = new int[3];
//		
//		for( int i = 0; i <rArr.length; i++) {
//			rArr[i] = arr[i];
//		}
//		System.out.println(Arrays.toString(rArr) );
		
		
		// - 구구단 2단 ~9단까지 세로로 출력 ( 중첩 반복문 )
		
//		for(int x = 1; x <= 9; x++) {
//			for(int y = 2; y <= 9; y++ ) {
//				System.out.print(x + " X " + y + " = " + x*y + "\t");
//			}
//			System.out.println();
//		}
		
		
		//- 구구단 2단 ~9단까지 출력 ( 중첩 반복문 ) 결과를 보고
		
		for(int x = 1; x <= 9; x+=3) {
			for(int y = 1; y<=9; y++) {
				System.out.print( x + " X " + y + " = " + x*y + "");
				System.out.print("\t" + (x+1) + " X " + y + " = " + (x+1) * y );
				System.out.println("\t" + (x+2) + " X " + y + " = " + (x+2) * y);
			}
			
			System.out.println();
		}
		
		
		
		
	}
}
