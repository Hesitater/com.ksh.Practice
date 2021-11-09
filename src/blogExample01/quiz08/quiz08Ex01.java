package blogExample01.quiz08;

import java.util.Scanner;

public class quiz08Ex01 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.print("금액을 넣어주세요> ");
		int money = scan.nextInt();
		
	es : while(true) {
			System.out.printf("남은금액 : %d원\n",money);
			System.out.println("[1]데미소다: 400원, [2]밀키스: 500원, [3]코크: 600원, [4]잔돈받기");
			System.out.print("음료수선택>");
			int select = scan.nextInt();
			
			switch(select) {
			case 1:
				if (money >= 400) {
					System.out.println("데미소다를 받았습니다.");
					money -= 400;
				} else {
					System.out.println("금액이 부족합니다 \"돈 줘\"");
				}
				break;
			case 2:
				if (money >= 500) {
					System.out.println("밀키스를 받았습니다");
					money -= 500;
				} else {
					System.out.println("금액이 부족합니다 \"돈 줘\"");
				}
				break;
			case 3:
				if(money >= 600) {
					System.out.println("코크를 받았습니다");
					money -= 600;
				} else {
					System.out.println("금액이 부족합니다 \"돈 줘\"");
				}
				break;
			case 4:
				System.out.printf("남은 금액 %d원을 가져가.\n",money);
				break es;	
			default:
				System.out.println("눈 안보이니.. 다시 골라줄래?");
				break;
			} // switch
			System.out.println();
			
		} // while(true)
		scan.close();
		
		
	}
}
