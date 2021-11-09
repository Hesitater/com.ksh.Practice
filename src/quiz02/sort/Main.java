package quiz02.sort;

import java.util.Arrays;

public class Main {
	public static void main(String[] args) {
		int arr[] = {4,23,33,15,17,19};
		
		Arrays.sort(arr,0,4); //0,1,2,3, 요소만 정렬
		
		System.out.println(Arrays.toString(arr));
		
		for (int i : arr) {
			System.out.print("[" + i + "]");
		}
	}
}
