package blogExample01.eg;

import java.util.Scanner;

public class ArrayDelete2 {
	public static void main(String[] args) {

		String[] arr = { "강타", "토니안", "이재원", "장우혁", "문희준" };

		Scanner scan = new Scanner(System.in);

		System.out.print("삭제할 멤버> ");
		String name = scan.next(); // 삭제 받을 멤버 받고

		int count = arr.length; // 배열의 길이로사용, 접근할 index(사람수)
		boolean flag = false;

		// 배열의 길이만큼 반복, 찾기, 삭제여부

		for (int i = 0; i < count; i++) {

			if (name.equals(arr[i])) { // 입력받은문자열과 기존 배열의 문자열이 같으면
				// 현재위치에서 count-1 미만 인덱스까지 요소를 당겨온다.
				for (int j = i; j < count - 1; j++) {
					arr[j] = arr[j + 1];
				} // for j

				count--; // 접근할 index(사람수)
				flag = true; // 삭제가 되었음
				break; // 삭제가 1회 되면 반복문을 빠져나감
			} // if
		} // for i

		if (flag) { // if문을 통과한 증거 flag
			System.out.print("삭제후정보 : [");
			for (int i = 0; i < count; i++) {
				System.out.print(arr[i]);

				if (i == count - 1)
					break;
				System.out.print(", ");
			} // for 문
			System.out.print("]");
		} else { // 삭제가 일어나지 않은경우 flag = false 인경우겠죠?
			System.out.println("찾는 이름이 없습니다.");
		}

	}
}
