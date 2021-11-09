package afterClass;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Test {
	public static void main(String[] args) {
		
		String[] array = new String[3];
		
		array[0] = "a";
		array[1] = "b";
		array[2] = "c";
		
		List<?> arrayList = Arrays.asList(array);
		List<?> arrayList2 = Arrays.asList("a", "b", "c");
		
		for (Object object : arrayList) {
			System.out.println(object);
		}
		
		System.out.println();
		
		for (Object e : arrayList2) {
			System.out.println(e);
		}
		
		System.out.println();
		
		String[] array3 = new String[3];
		array3[0] = "a";
		array3[1] = "b";
		array3[2] = "c";
		
		
		List<String> arrayList3 = new ArrayList<>();
		
		for (String str : array3) {
			arrayList3.add(str);
		}
		
		System.out.println(arrayList3);
	}
}
