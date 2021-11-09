package quiz02;

public class AboutStaticWrapping {
	public static void main(String[] args) {
		
		
		// String(문자열) 타입 정수 -> 수치데이터로 변환
		String strNum = "100";
		
		// 1. Integer 타입으로 변환하는 방법
//		Integer n1 = Integer.valueOf(strNum); //메서드 활용 방법
		
		Integer n1 = new Integer(strNum);  // 생성자 활용 방법
		System.out.println(n1 + 99);
		
		//2. int 타입으로 변환하는 방법
		// => Integer.parseInt() 메서드를 호출하여 파라미터로 문자열 전달
		int num3 = Integer.parseInt(strNum);
		System.out.println(num3 + 99);
		
		// 정수 -> String(문자열) 타입 변환
		// 1. Integer -> String
		Integer n2 = 10;		// int n2 = 10;
		String strNum2 = Integer.toString(n2);
		String strNum3 = n2 + "";
		String strNum4 = n2.toString();

//		System.out.println("----------");
//		System.out.println(strNum2);
//		System.out.println(strNum3);
//		System.out.println(strNum4);
		
		
		// 2. int -> String
		String strNum5 = Integer.toString(num3);
		System.out.println(strNum2);
		System.out.println(strNum3);
		
		
		char c = 'A';
		Integer a = new Integer(c);
		System.out.println(a);
	
	}
}
