package p14lamda;

import java.util.Arrays;
import java.util.List;

public class Ex04 {
	public static void main(String[] args) {
		List<Integer> list = Arrays.asList(1,2,3,4,5);
		
		method(list, num -> System.out.println(num));
		System.out.println("=================");
		
		method(list, x -> System.out.println("arr[x] :" + x));
		method(list, num -> System.out.println("3*item :" + 3*num));
		
	}
	
	
	public static void method(List<Integer> list, MyInterface4 c) {
		for (int item : list) {
			c.method(item);
		}
	}
}



interface MyInterface4 {
	void method(int num);
}