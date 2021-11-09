package blogExample01.eg;

public class EnhancedForEx01 {
	public static void main(String[] args) {
		
//		//기본 for문
//		
//		int[] arr = {1,2,3,4,5};
//		
//		for( int i = 0; i < arr.length; i++) {
//			System.out.print(arr[i] +", ");
//		}
		
		//항상된 for문
		int[] arr = {1,2,3,4,5,};
		for (int i :arr) {  // (값을 받을 변수 : 배열명)
			System.out.print(i + ", ");
		}
		
		
		String[] arr2 = { "월", "화", "수", "목", "금", "토", "일" };

		for (String str : arr2) {
			System.out.print(str + " ");
		}
		System.out.println();
		
		// arr3의 팽균을 구해보자
		int[] arr3 = { 40,20,50,30,50}; //
		
		int sum = 0;
		for(int i : arr3) {
			sum += i;
		}
		System.out.println("arr3평균: " + (sum / arr3.length) + ", 합계 : " + sum);
	}
}
