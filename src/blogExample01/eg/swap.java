package blogExample01.eg;

public class swap {
	public static void main(String[] args) {
		
		int x = 1;
		int y = 5;
		
		System.out.println("x: " + x);
		System.out.println("y: " + y);
		
		int temp = x;
		x = y;
		y = temp;
		
		System.out.println("x: " + x + ", y : " + y);
		
	}
}
