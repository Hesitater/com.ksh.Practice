package quiz02;

public class Ex {
	public static void main(String[] args) {
		// Wrapper 클래스에서 제공하는 상수
		
		System.out.println("byte 타입 최소값: " +Byte.MIN_VALUE);
		System.out.println("byte 타입 최대값: " +Byte.MAX_VALUE);
		System.out.println("short 타입 최소값: " + Short.MIN_VALUE);
		System.out.println("shotr 타입 최대값: " + Short.MAX_VALUE);
		System.out.println("int 타입 최소값: " + Integer.MIN_VALUE);
		System.out.println("int 타입 최대값: " + Integer.MAX_VALUE);
		System.out.println("long 타입 최소값: " + Long.MIN_VALUE);
		System.out.println("long 타입 최대값: " + Long.MAX_VALUE);
		
		System.out.println("float 타입 최소값: " + Float.MIN_VALUE);
		System.out.println("float 타입 최대값: " + Float.MAX_VALUE);
		System.out.println("double 타입 최소값: " + Double.MIN_VALUE);
		System.out.println("double 타입 최대값: " + Double.MAX_VALUE);
		
		System.out.println("char 타입 최소값: " + (int)Character.MIN_VALUE);
		System.out.println("char 타입 최대값: " + (int)Character.MAX_VALUE);	
		
		System.out.println("------------------------------------------");
		
		int num1 = 10, num2 = 20;
		
		
		// ================ 기본데이터타입 -> 참조데이터타입으로 변환하는 방법(박싱) ====================
		// 1. 정석적인 방법(Wrapper 클래스 타입 인스턴스 생성하여 파라미터로 전달)
//		Integer n1 = new Integer(num1); // int(기본형) -> Integer(참조형) 로 변환됨 (= 박싱)
//		// Stack에 있떤 int num = 10 이라는 숫자를 Box로 포장하여서 Heap이라는 공간에 어떤 위치(ex.0x100)에 넣음 그리고 그 객체를 n1에 넣음
//		System.out.println("참조형 데이터 n1 = " + n1.toString()); // Integer 객체의 정수 값 출력 
//		System.out.println("참조형 데이터 n1 = " + n1); // toString() 생략 가능
		
		// 2. 오토 박싱(Auti Boxing)을 활용한 자동 변환
		Integer n1 = num1;
		System.out.println("참조형 데이터 n1 =" + n1);
		
		Integer n2 = num2;
		System.out.println("참조형 데이터 n2 =" + n2);
		
		// 문자열 형태의 수치데이터를 전달할 수 있음
//		Integer n3 = "20";  // 문자열을 Integer 타입 변수에 전달이 안됨
		Integer n3 = new Integer("20"); //Integer 인스턴스 생성 시 파라미터로 전달
		System.out.println(n3);
	
		
		// ================ 참조데이터타입 -> 기본데이터타입으로 변환하는 방법(언박싱) ====================
		// 1. 정석적인 방법
		int num3 = n1.intValue(); // Wrapper 클래스 타입 객체의 XXXValue() 메서드 호출
		System.out.println("기본형 데이터 num3 : " + num3);
		
		// 2. 오토 언박싱(Auto unBoxing)을 활용한 자동 변환
		int num4 = n1;
		System.out.println("기본형 데이터 num4 : " + num4 );
		
		// double 타입 <-> Double 클래스타입 상호 변환
		double d1 = 3.14;
//		Double double1 = new Double(d1); // 박싱
		Double double1 = d1; // 오토박싱
		System.out.println("d1 = " + d1 + ", double1 = " + double1);
		
//		double d2 = double1.doubleValue(); // 언박싱
		double d2 = double1; // 오토 언박싱
		System.out.println("d2 = " + d2 + ", double1 = " + double1);
		


		
		
		

		


		
		
		


		

	}
}
