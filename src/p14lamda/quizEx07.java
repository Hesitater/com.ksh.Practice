package p14lamda;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.function.Predicate;

public class quizEx07 {
	public static void main(String[] args) {
		ArrayList<Integer> arr1 = new ArrayList<>(Arrays.asList(3,4,5,6));
		
		System.out.println(arr1);
		
		arr1.removeIf(new Predicate<Integer>() {
			@Override
			public boolean test(Integer x) {
				return x % 2 == 0;
			}
		});
		System.out.println(arr1);
		
		//lambda
			arr1.removeIf( (Integer x) -> {
				return x % 2 == 0;
			});
			
			//lambda : 하나의 명령문 {} 중괄호 생략, 
			arr1.removeIf((Integer item) -> item %2 == 0);
			
			//lambda : 파라미터 type 생략
			arr1.removeIf((e) -> e % 2 == 0);
			
			//lambda : 파라미터 () 소괄호 생략
			arr1.removeIf(  e -> e % 2 == 0);
			
			System.out.println(arr1);
			
	}
}
