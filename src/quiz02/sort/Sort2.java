package quiz02.sort;

import java.util.Arrays;
import java.util.Collections;

public class Sort2 {
	public static void main(String[] args) {
		String arr[] = { "apple", "orange", "banana", "pear", "peach", "melon"};
		Arrays.sort(arr,Collections.reverseOrder());
		
		System.out.println(Arrays.toString(arr));
		
		for ( String i : arr) {
			System.out.print("[" + i + "]")
			;
		}
		
	}
}
