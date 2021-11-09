package blogExample01.quiz07;

import java.util.Scanner;

public class quiz07Ex05_1 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		int oCount = 0;
		int xCount = 0;
		
		while(true) {
			int x = (int)(Math.random()*100) +1;
			int y = (int)(Math.random()*100) +1;
			int r = (int)(Math.random()*2) ;
			
			if ( r == 1) {
				System.out.printf("%d + %d =?\n",x,y);
			} else {
				System.out.printf("%d - %d =?\n",x,y);
			}
			
			System.out.println("[문제를 그만 푸시려면 0을 입력하세요]");
			System.out.print(">");
			int answer = scan.nextInt();
			
			if( answer == 0) {
				System.out.println("프로그램을 종료합니다");
				break;
			}
			
			if( x + y == answer && r ==1) {
				System.out.println("정답 입니다");
				oCount++;
			} else if( x - y == answer && r == 0) {
				System.out.println("정답입니다");
				oCount++;
			} else {
				System.out.println("틀렷습니다");
				xCount++;
			}
			System.out.println("---------------------------");
		}
		
		System.out.println("------------------------");
		System.out.println("정답횟수:" +oCount);
		System.out.println("틀린횟수:" +xCount);
		
	}
}
