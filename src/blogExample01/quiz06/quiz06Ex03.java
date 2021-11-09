package blogExample01.quiz06;

public class quiz06Ex03 {
	public static void main(String[] args) {
		//1 ~ 100 까지 중에 12의 배수를 가로로 출력
		
		for (int i = 1; i <= 100; i++) {
			System.out.print(i % 12 == 0? i + " " : "" );
			
//			if( i % 12 == 0) {
//				System.out.print(i + " ");
//			}
		}
	}
}
