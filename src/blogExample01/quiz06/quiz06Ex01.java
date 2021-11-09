package blogExample01.quiz06;

public class quiz06Ex01 {
	public static void main(String[] args) {
		//Math.random() 을 사용해서 2 ~ 9 까지 랜덤변수를 만들고, 해당 구구단을 세로로 출력
		
		int dan = (int)(Math.random()*8 + 2);
		System.out.println("구구단 " + dan + "단이므니다");
		
		for (int i = 1; i <=9; i++) {
			System.out.println(dan + " x " + i + " = " +dan*i );
		}
		
	}
}
