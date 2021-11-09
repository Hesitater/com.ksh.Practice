package blogExample01.eg;

import java.util.Arrays;
import java.util.Scanner;

public class ArrayUpdate {
	public static void main(String[] args) {
		
		// 배열의 변경
		// 입력 -> 있는지 없지 탐색 -> 변경

		
		String[] arr = {"강타", "토니안", "문희준",  "장우혁", "이재원"}; //배열 설정
		
		Scanner scan = new Scanner(System.in);
		System.out.print("찾을이름> ");
		String name = scan.next();
		
		boolean flag = false; // 수정까지 성공 or 실패 출력해서 확인
		
		for( int i = 0; i < arr.length; i++) {
			if(name.equals(arr[i])) { // i <배열의길이 보면서 수정할 학생이 있는경우
				
				System.out.print("변경할 이름을 작성하세요> ");
				String s = scan.next();   // 변경할 이름 입력
				arr[i] = s; 
				flag = true; // flag = true 이면 if문을 실행했다는 증거가 됩니다.
				
				
			}
			
		}
		// 확인
		if(flag) {	//flag = true가 되면 if문지나면서 이름을 바꿨다는게 되기때문에
			System.out.println("이름이 정상 수정되었습니다!");
			System.out.println(Arrays.toString(arr));
		} else {
			System.out.println("찾는 이름이 없습니다");
		}
		
		scan.close();
		
		
		
	}
}
