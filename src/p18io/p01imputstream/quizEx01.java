package p18io.p01imputstream;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStream;

public class quizEx01 {
	public static void main(String[] args) throws Exception {
		String file = "C:\\Users\\user\\Desktop\\iot\\images.jfif";
		InputStream is = new FileInputStream(file);
		int size = 0;
		
		//while () // InputStream.read() 를 사용해서 loop가 몇 번 실행 되었는지 size에 저장
		while( (is.read()) != -1 ) { 
			size++;
		}
		System.out.println("파일크기:" + size);
		System.out.println("프짱");
		is.close();
	}
}
