package p18io.p02outputstream;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.io.OutputStream;

public class Ex04 {
	public static void main(String[] args) throws Exception {
		InputStream is = new FileInputStream("C:\\Users\\user\\Desktop\\iot\\images.jfif");
		OutputStream os = new FileOutputStream("C:\\Users\\user\\Desktop\\iot\\outtest7.jfif");
		
		
		byte[] datas = new byte[120];
		int len = 0;
		while ( (len = is.read(datas)) != -1 ) {
			os.write(datas, 0, len);
		}
		
		
		
		System.out.println("프짱");
		is.close();
		os.close();
	}
}
