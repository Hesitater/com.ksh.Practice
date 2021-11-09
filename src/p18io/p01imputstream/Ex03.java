package p18io.p01imputstream;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;

public class Ex03 {
	public static void main(String[] args) throws Exception {
		String file = "";
		InputStream is= new FileInputStream("C:\\Users\\user\\Desktop\\iot\\text2.txt");
	
		byte[] data = new byte[8];
		
		int datasize1 = is.read(data);
		int datasize2 = is.read(data);
		int datasize3 = is.read(data);
		int datasize4 = is.read(data);
		int datasize5 = is.read(data);
		int datasize6 = is.read(data);
		int datasize7 = is.read(data);
		int datasize8 = is.read(data);
		int datasize9 = is.read(data);
		int datasize10 = is.read(data);
		
		System.out.println(datasize1);
		System.out.println(datasize2);
		System.out.println(datasize3);
		System.out.println(datasize4);
		System.out.println(datasize5);
		System.out.println(datasize6);
		System.out.println(datasize7);
		System.out.println(datasize8);
		System.out.println(datasize9);
		System.out.println(datasize10);
		
		System.out.println("프짱");
		is.close();
	}
}
