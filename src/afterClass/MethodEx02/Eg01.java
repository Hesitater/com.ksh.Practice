package afterClass.MethodEx02;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Eg01 {
	public static void main(String[] args) {
		Integer[] ia = {1,2,3,4};
		System.out.println("Array: " + Arrays.toString(ia));
		List<Integer> list1 = new ArrayList<Integer>(Arrays.asList(ia));
		list1.add(5);
		list1.add(6);
		list1.add(7);
		list1.remove(0);
		list1.remove(1);
		System.out.println("list1:" + list1);
		System.out.println("Array: " +Arrays.toString(ia));
		
	}
}
