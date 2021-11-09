package p14lamda;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

public class quizEx08 {
	public static void main(String[] args) {
		List<String> list = new ArrayList<>(Arrays.asList("apple", "java", "abc", "amond","spring"));
		
		List<String> newList = new ArrayList<>(list);
		
		System.out.println(list);
		
		list.removeIf(new Predicate<String>() {
			@Override
			public boolean test(String t) {
				return t.charAt(0) != 'a';
			}
		});
		
		//lambda
		list.removeIf( (String t) -> {
			return t.charAt(0) != 'a';
		});
		
		// lambda : 하나의 명령문 {} ,return생략
		list.removeIf( (String t) ->  t.charAt(0) != 'a');
		
		// lambda : 파라미터 type
		list.removeIf( (t) -> t.charAt(0) != 'a');
		
		
		
	}
}
