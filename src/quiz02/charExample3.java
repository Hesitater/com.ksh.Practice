package quiz02;

import java.util.Scanner;

public class charExample3 {
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		char x = ' ';
		char y = ' ';
		
		System.out.print("입력하는곳 > ");
		x = scan.next().charAt(0);
		System.out.print("입력하는곳2 >");
		y = scan.next().charAt(3);
		
		System.out.println("첫번째에서 인덱스0값: " + x);
		System.out.println("두번째에서 인덱스3값: " + y);
		
		scan.close();
		
	}
}
