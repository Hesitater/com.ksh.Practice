package p18io.p02outputstream;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

public class Ex03 {
	public static void main(String[] args) throws Exception {
		
		InputStream is = new FileInputStream("C:\\Users\\user\\Desktop\\iot\\images.jfif");
		OutputStream os = new FileOutputStream("C:\\Users\\user\\Desktop\\iot\\outtest5.jfif");
		
		byte[] datas = new byte[100];
		
		for (int i = 0; i < 66; i++) {
			if( i == 65) {
				is.read(datas);
				os.write(datas,0,43);
			} else {
				is.read(datas);
				os.write(datas);
			}
		}
		
		System.out.println("프짱");
		is.close();
		os.close();
	}
}
