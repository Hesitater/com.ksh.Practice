package blogExample01.eg;

public class BreakEx01 {
	public static void main(String[] args) {
		
		// 무한반복문 - 정확히 반복 횟수를 모를때 사용하고
		// 특정 조건에서 반복문 종료시키는 형태로 사용합니다.
		
		
		int i = 1;
		while(true) {
			System.out.println(i);
			if( i == 15) break; 
		// 코드가 한줄 일 경우 {}   생략가능 같은 라인에 작성 가능	
		// break  위치에 따라 빠져 나오는 곳이 다르니 어디서 break를 사용할지 잘 생각해야합니다.
			i++;
		}
		
	}
}
