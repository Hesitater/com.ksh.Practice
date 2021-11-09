package blogExample01.eg;

import java.util.Scanner;

public class ArrayInsert {
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		String[] arr = new String[100]; // 넉넉히 크기가 100인 String배열을 선언
		int count = 0; // 그만 을 입력할때까지 몇개 입력했는지 알기위해 선언(음식의개수)
		
		
		System.out.println("먹고싶은 음식을 입력하세요");
		System.out.println("입력을 중지하려면 <그만>이라고 입력하세요");
		
		while(true) {
			System.out.print("> ");
			String menu = scan.nextLine();  // 음식(문자열) 입력받을꺼니깐 공백포함 받는다
			
			if( menu.equals("그만") ) break;   //그만을 입력하면 빠져나올수있게
			// 문자비교는 == 가 안되요  ->  문자.equals("문자") 로 비교함
			
			
			arr[count] = menu;   //arr[인텍스번호] = menu;
			count++;
			
		}
		
		
// 		밑에 문장들이 Arrays.toString() 만드는 방법이라고 합니다..		
			System.out.print("먹고싶은 음식: [");
			for (int i = 0; i <count; i++) {
				System.out.print(arr[i]);
				if(i == count -1)
					break;
				System.out.print(", ");
				
			}
			System.out.println("]");
			scan.close();
			
			
	}
}
