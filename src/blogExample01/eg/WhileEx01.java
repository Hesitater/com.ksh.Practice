package blogExample01.eg;

public class WhileEx01 {
	public static void main(String[] args) {
		
		int x = 1;  // 제어변수 : 반복문의 횟수를 제어할 변수
		int sum = 0;
		
		 while( x <= 10) {   
			 
			 sum += x; // sum = sum + x;
			 System.out.print(sum+ " ");
//			 System.out.print(x + " ");
			 x++;  //제어변수 조작을 통해서 조건 false가 되면 while문을 나올수 있도록
		 }
		System.out.println("\n1~10까지합  : " + sum);
		System.out.println(x);
		 
	}
}

