package p18io.p04writer;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.Reader;
import java.io.Writer;
import java.io.Writer;

public class QuizEx10Reverse {
	public static void main(String[] args) throws Exception {
		//원본내용 springjavaspringring

		//대상파일 내용
		//4개씩 끈어서 거꾸로 들어가도록
		// irps ajgn psav ginr ginr
		
		
		
		String name = "C:\\Users\\user\\Desktop\\iot\\outtest10.txt";
		String des = "C:\\Users\\user\\Desktop\\iot\\outtestB.txt";
		Reader rd = new FileReader(name);
		Writer wr = new FileWriter(des);
		char[] datas = new char[4];
		int cnt = 0;
		char[] ch = null;
		
		
		while (rd.read(datas) != -1) {
			reverse(datas);
			wr.write(datas);
		}
		
		
		System.out.println("프짱");
		rd.close();
		wr.close();
		
	}

	private static void reverse(char[] datas) {
		int left = 0;
		int right = datas.length-1;
		
		while (left < right) {
			char c = datas[left];
			datas[left] = datas[right];
			datas[right] = c;
			
			left++;
			right--;
			
		}
		
	}
}
