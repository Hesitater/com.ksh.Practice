package blogExample01.quiz07;

import java.util.Scanner;

public class quiz07Ex01 {
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.print("가로>");
		int x = scan.nextInt();
		System.out.print("세로>");
		int y = scan.nextInt();
		
		for (int i = 1; i <= y; i ++ ) {
			for (int j = 1; j <= x; j++) {
				
				if ( i  == 1 || j == 1 || j == x || i == y) {
					System.out.print("*");
				} else {
					System.out.print(" ");
				}
			}
		System.out.println();
		}
		
	}
}
