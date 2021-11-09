package p14lamda;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;
import java.util.function.UnaryOperator;

public class quizEx09 {
	public static void main(String[] args) {
		ArrayList<Integer> list = new ArrayList<>(Arrays.asList(1,2,3,4));
		
		// 배열 복사
		List<Integer> CopyList = new ArrayList<>(list);
		List<Integer> CopyList2 = new ArrayList<>(list);
		ArrayList<Integer> CopyList3 = new ArrayList<>(list);
		
		System.out.println(list);
		System.out.println(CopyList);
		System.out.println(CopyList2);
		
		list.replaceAll(new UnaryOperator<Integer>() {
			@Override
			public Integer apply(Integer t) {
				return 2*t;
			}
		});
		System.out.println(list);
		
		list.replaceAll( (Integer e) -> 2*e);
				
	}
}
