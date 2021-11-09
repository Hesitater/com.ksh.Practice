package p14lamda;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class Ex11Comparator {
	public static void main(String[] args) {
		
		List<Integer> list = Arrays.asList(5,7,2,4,1);
		
		list.sort(new Comparator<Integer>() {
			public int compare(Integer o1, Integer o2) {
				return Integer.compare(o1, o2);
			}
		});	
		
		System.out.println(list);
		
		list.sort(new Comparator<Integer>() {
			@Override
			public int compare(Integer o1, Integer o2) {
				
				return Integer.compare(o2, o1);
			}
		});
		
		System.out.println(list);
		
		System.out.println("================");
		
		list.sort( (x1 , x2) -> x1 - x2);
		System.out.println(list);
		list.sort( (x1 , x2) -> x2 - x1);
		System.out.println(list);
		
		list.sort( (x1,x2) -> x1.compareTo(x2));
		System.out.println(list);
		
		List<String> arr = Arrays.asList("java", "apple", "spring", "jsp");
		
		arr.sort( (a,b) -> a.compareTo(b));
		System.out.println(arr);
		arr.sort( Comparator.reverseOrder());
		System.out.println(arr);
		
			
	}
}
