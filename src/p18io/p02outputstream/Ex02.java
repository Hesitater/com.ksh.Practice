package p18io.p02outputstream;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;

public class Ex02 {
	public static void main(String[] args) throws Exception {
		
		String str = "\nThe world will not change until we do.";
		OutputStream os = new FileOutputStream("C:\\Users\\user\\Desktop\\iot\\outtest2.txt");
		
		byte[] datas = str.getBytes();
		
		os.write(datas);
		os.write(datas);
		
		System.out.println("프짱");
		os.close();
		
	}
}
