package afterClass.chap02.exam3;

import java.io.IOException;

public class CountinueKeyCodeExample {
	public static void main(String[] args) throws Exception {
		
		int keyCode;
		
		while (true) {
			keyCode = System.in.read();
			System.out.println("keyCode: " + keyCode);
		}
		
	}
}
