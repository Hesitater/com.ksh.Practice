package p18io.p01imputstream;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;

public class QuizEx02 {
	public static void main(String[] args) throws Exception {
		String name = "C:\\Users\\user\\Desktop\\iot\\images.jfif";	//6543byte
		InputStream is = new FileInputStream(name);
		
		byte[] data = new byte[100];
		int cnt = 0;
		int fileSize = 0;
		
		//while() InputStream.read(byte[]) 를 활용해서 file 크기 계산
		
		while((cnt = is.read(data)) != -1) {
			fileSize += cnt;
		}
		
		
		
		System.out.println("파일크기" +  fileSize + "bytes");
		System.out.println("프짱");
		is.close();
		
	}
}
