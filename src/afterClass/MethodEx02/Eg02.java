package afterClass.MethodEx02;

import java.util.Arrays;
import java.util.List;

public class Eg02 {
	public static void main(String[] args) {
	
	String[] firstArray = {"참외", "사과", "바나나", "딸기"};
	String[] secArray = new String[7];
	
//	System.arraycopy(firstArray, 0, secArray, 0, firstArray.length);
	System.arraycopy(firstArray, 0, secArray, 3, firstArray.length);
	
	for (int i = 0; i <secArray.length; i++) {
		System.out.println(secArray[i]);
	}
	
	}
}
