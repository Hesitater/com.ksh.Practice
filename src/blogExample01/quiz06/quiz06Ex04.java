package blogExample01.quiz06;

public class quiz06Ex04 {
	public static void main(String[] args) {
		
		//1 ~ 200 까지 정수 중에 9의 배수의 개수
		int count = 0;
		
		for (int i = 1; i <=200; i++) {
			if(i % 9 == 0) {
				count ++;
				System.out.print(i + " ");
			}
		}
		System.out.println();
		System.out.println("1~200 정수 중 9의배수 " + count + "개");
		
	}
}
