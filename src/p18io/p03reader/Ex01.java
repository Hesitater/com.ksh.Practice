package p18io.p03reader;

import java.io.FileInputStream;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.Reader;

public class Ex01 {
	public static void main(String[] args) throws Exception {
		
		String fileName = "C:\\Users\\user\\Desktop\\iot\\test3.txt";
		Reader r = new FileReader(fileName);
		
		
		int c1 = r.read();
		int c2 = r.read();
		int c3 = r.read();
		int c4 = r.read();
		int c5 = r.read();
		int c6 = r.read();
		int c7 = r.read();
		int c8 = r.read();
		
		
		
		System.out.println((char) c1);
		System.out.println((char) c2);
		System.out.println((char) c3);
		System.out.println((char) c4);
		System.out.println((char) c5);
		System.out.println((char) c6);
		System.out.println((char) c7);
		System.out.println((char) c8);
		
		
		
		System.out.println("프쨩");
		r.close();
	}
}
