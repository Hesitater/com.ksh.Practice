package p14lamda;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.UnaryOperator;

public class quizEx10 {
	public static void main(String[] args) {
		List<String> list = new ArrayList<>(Arrays.asList("java", "spring", "html", "a", "","ss"));
		
		list.replaceAll(new UnaryOperator<String>() {
			@Override
			public String apply(String t) {
				if(t.length() >= 2) {
					return t.substring(t.length()-2, t.length());
				} else {
					
					return t;
				}
			}
		});
		
		System.out.println(list);
		
		list.replaceAll( t -> {
			if(t.length() >=2) {
				return t.substring(t.length()-2, t.length());
			} else {
				return t;
			}
		});
		
		System.out.println(list);
		
		list.replaceAll( t -> t.length() >= 2 ? t.substring(t.length()-2,t.length()) : t );
		
		System.out.println(list);
		
		list.replaceAll(e -> e.replaceAll("(?<=.{2}).", ""));
		System.out.println(list);
		
	
	}
		
}
