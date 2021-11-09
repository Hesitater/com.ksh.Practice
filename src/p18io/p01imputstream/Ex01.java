package p18io.p01imputstream;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;

public class Ex01 {
	public static void main(String[] args) throws Exception {
		String fileName = "src/p18io/p01imputstream/Ex01.java";
		File file = new File(fileName);
		System.out.println(file.exists());
		
		String fileName2 = "C:\\Users\\user\\Desktop\\iot\\holy.txt";
		File file2 = new File(fileName2);	// love u 있음 띄어쓰기포함 7부터 없어서 -1 리턴
		System.out.println(file2.exists());
		
		InputStream is = new FileInputStream(file2);
		int byte1 = is.read();
		int byte2 = is.read();
		int byte3 = is.read();
		int byte4 = is.read();
		int byte5 = is.read();
		int byte6 = is.read();
		int byte7 = is.read();
				
		System.out.println(byte1);
		System.out.println(byte2);
		System.out.println(byte3);
		System.out.println(byte4);	
		System.out.println(byte5);
		System.out.println(byte6);
		System.out.println(byte7);
	}
}
