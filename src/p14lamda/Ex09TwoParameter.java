package p14lamda;

public class Ex09TwoParameter {
	public static void main(String[] args) {
		
		MyInterface9 o1 = (int a, int b) -> {System.out.println(a +":"+ b);};
		o1.method(3, 4);
		
		MyInterface9 o2 = (a, b) -> System.out.println(a + ", " + b);
		o2.method(-1, -2);
		
	}
}

interface MyInterface9 {
	void method(int a, int b);
}