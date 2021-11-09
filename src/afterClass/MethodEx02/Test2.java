package afterClass.MethodEx02;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Test2 {
	public static void main(String[] args) {
		
		String param = "1111|2222|3333|4444|5555|6666";
		String[] tempParam = param.split("\\|");
		
		List<String> arrstr = new ArrayList<String>();
		
		for (String str : tempParam) {
			arrstr.add(str);
		}
		
		System.out.println(arrstr);
		
		
		//답2
		String param2 = "1111|2222|3333|4444|5555|6666";
		List<String> arrstr2 = Arrays.asList(param.split("\\|"));
		System.out.println(arrstr);
	}
}
