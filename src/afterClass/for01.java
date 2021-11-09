package afterClass;

import java.util.ArrayList;
import java.util.List;

public class for01 {
	public static void main(String[] args) {
		List<String> testList = new ArrayList<>();
		
		testList.add("1");
		testList.add("2");
		testList.add("3");
		
		for (int i = 0; i < testList.size(); i ++) {
			System.out.println("기본 for문:" +testList.get(i));
		}
		
		for (String result : testList) {
			System.out.println("항상된for:" + result);
			
		}
		
	}
}
