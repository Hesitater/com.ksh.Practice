package p18io.p01imputstream;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStream;

public class Ex04 {
	public static void main(String[] args) throws Exception {
		String file = "C:\\Users\\user\\Desktop\\iot\\text2.txt";	//크기 68byte
		InputStream is = new FileInputStream(file);
		byte[] data = new byte[10];
		int cnt = 0;
		
		while ( (cnt =is.read(data)) != -1 ) {
			
			for ( int i = 0; i < cnt; i++) {
				
				System.out.print(data[i] + ", ");
			}
			System.out.println();
			
		}
		
		
		System.out.println("프짱");
		is.close();
		
		
		
		
	}
}
