package blogExample01.quiz04;

import java.util.Scanner;

public class quiz04Example3 {
	public static void main(String[] args) {
		
		
		//나중엔 배열로 하겠지..? 배열이면 배열 각각의 번호로 할까?
		Scanner scan = new Scanner(System.in);
		
		System.out.println("구입할 메뉴는?");
		System.out.println("[ 수박, 사과, 멜론, 귤, 포도");
		System.out.print("> ");
		String str = scan.next(); // 문자열 String  입력값 scan.next();
		
		
		System.out.print(str);
		switch (str) {
		case "수박":
			System.out.println("은 0만원입니다");
			break;
		case "사과":
			System.out.println("은 1만원입니다");
			break;
		case "멜론":
			System.out.println("은 2만원입니다");
			break;
		case "귤":
			System.out.println("은 3만원입니다");
			break;
		case "포도":
			System.out.println("은 4만원입니다");
			break;
			
		default:
			 System.out.println("은(는) 출력문에 없는데 다시한번 볼까?");
			break;
		}
		scan.close();
	}
}
