package blogExample01.quiz06;

public class quiz06Ex02 {
	public static void main(String[] args) {
		//-7 ~ 100 까지 정수 중에 7의 배수를 가로로 출력 (증감식을 7씩 증가)
		
		for ( int i = 7; i <= 100; i++) {
			
			if(i % 7 == 0) {
				System.out.print(i + ", ");
			}
			
		}
		
	}
}
