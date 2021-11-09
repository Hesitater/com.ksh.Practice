package blogExample01.eg;

import java.util.Scanner;

public class ForEx02 {
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		System.out.println("이수는 소수일까 아닐까? > ");
		int x = scan.nextInt();
		
		int count =0; // 약수의 개수 
		
		for(int y = 1; y <= x; y++ ) {
			if ( x % y ==0 ) { // x에대한 약수
				System.out.print(y + " ");
				count++;
			}
		}
		
		System.out.println();
		System.out.println(x + "에 약수의 개수 :" + count);
		System.out.println(count == 2? x + "은소수 " : x + "는 소수가아님");
		
		scan.close();
		
		
		
		
		
		
	}
}
