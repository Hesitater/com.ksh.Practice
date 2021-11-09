package quiz02.sort;

import java.util.Arrays;
import java.util.Collections;

public class Sort1 {
	public static void main(String[] args) {
		Integer arr[] = {4,23,33,15,17,19};
		Arrays.sort(arr,Collections.reverseOrder());
		
		System.out.println(Arrays.toString(arr));
		
		for ( int i : arr) {
			System.out.print("[" + i + "]");
		}

		
	}
}
