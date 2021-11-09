package afterClass.MethodEx02;

public class MethodEx001 {
	public static void main(String[] args) {
		
		System.out.println("1~10까지의합 :" + calSum(10));
		System.out.println("1~20까지의합 : " + calSum(20));
		System.out.println("1~30까지의합 : " + calSum(21));
		
		
		int result = calSum2(1,10);
		int result2 = calSum2(10,20);
		int result3 = (calSum2(1,20) - calSum2(11,20) );
		
		System.out.println();
		
		System.out.println("1~10까지합 : " +result);
		System.out.println("10~20까지의합 : " + result2);
		System.out.println("1~20까지의합 - 11~20까지의합 : " +  result3);
		
		System.out.println();
		
		String result4 = calSum3(1,4,"기러기");
		System.out.println(result4);
		
		
	}
	
	
	
	static int calSum( int end) {
		
		int sum = 0;
		for(int i = 1; i <= end; i++) {
			sum += i;
		}
		
		return sum;
	}
	
	// parameter1 ~ parameter2 까지들의 합을 반환하는 메서드
	static int calSum2(int x , int y) {
		
		int sum = 0;
		for(int i = x; i <= y; i++) {
			sum += i;
		}
		return sum;
	}
	

	static String calSum3(int x, int y ,String z) {
		
		int max = 0; // 큰 값
		int min = 0; //작은 값
		
		if( x > y) {
			max = x;
			min = y;
		} else {
			max = y;
			min = x;
		}
		String str = "";
		for( int i = min; i <= max; i++) {
			str += z;
		}
		return str;
	}
	
	

}
