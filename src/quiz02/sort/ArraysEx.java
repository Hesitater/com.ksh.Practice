package quiz02.sort;

import java.util.Arrays;

public class ArraysEx {
	public static void main(String[] args) {
		String arr[] = {"apple", "orange", "banana", "pear", "peach", "melon" };
		Arrays.sort(arr);
		
		for (String i : arr) {
			System.out.print("[" + i + "]");
		}

	}
}
