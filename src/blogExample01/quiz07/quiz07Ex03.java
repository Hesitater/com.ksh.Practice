package blogExample01.quiz07;

import java.util.Arrays;

public class quiz07Ex03 {
	public static void main(String[] args) {
		// - 배열의 오름차순 정렬을 하시오. ( Arrays.toString() 을 이용할 것 ) -> 선택정렬

		int arr[] = { 1, 5, 23, 40, 43, 100, 200 };

		for (int i = 0; i < arr.length - 1; i++) {
			for (int j = i + 1; j < arr.length; j++) {
				if (arr[i] > arr[j]) {
					int temp = arr[i];
					arr[i] = arr[j];
					arr[j] = temp;
				}

			}
		}
		System.out.println(Arrays.toString(arr));
		System.out.println(arr.length);
	}
}
