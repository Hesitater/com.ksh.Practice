package blogExample01.quiz04;

import java.util.Arrays;
import java.util.Scanner;

public class quiz04Example4 {
	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		int[] arr = new int[3];

		System.out.print("1번째 정수 입력 >");
		arr[0] = scan.nextInt();
		System.out.print("2번째 정수 입력 >");
		arr[1] = scan.nextInt();
		System.out.print("3번째 정수 입력 >");
		arr[2] = scan.nextInt();

		if (arr[0] > arr[1]) {

			if (arr[1] < arr[2]) {
				int temp = arr[1];
				arr[1] = arr[2];
				arr[2] = temp;
			}

			if (arr[0] < arr[1]) {
				int temp = arr[0];
				arr[0] = arr[1];
				arr[1] = temp;
			}
		} else {
			int temp = arr[0];
			arr[0] = arr[1];
			arr[1] = temp;

			if (arr[1] < arr[2]) {
				temp = arr[1];
				arr[1] = arr[2];
				arr[2] = temp;
			}

			if (arr[0] < arr[1]) {
				temp = arr[0];
				arr[0] = arr[1];
				arr[1] = temp;
			}

		}

		System.out.println(Arrays.toString(arr));
		System.out.println("이렇게 까지 해야되?...");
	
		scan.close();
		
	}
}
