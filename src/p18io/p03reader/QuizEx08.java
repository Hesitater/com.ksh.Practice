package p18io.p03reader;

import java.io.FileReader;
import java.io.IOException;

public class QuizEx08 {
	public String split(int num) throws Exception {
		//int num만큼 파일안에 있는 값을 끈어서 ,로 구분하기
		
		FileReader fr = new FileReader("C:\\Users\\user\\Desktop\\iot\\text4.txt");
		char[] datas = new char[num];
		
		String result = "";
		int cnt = 0;
		
		while ((cnt =fr.read(datas)) != -1) {
			result += new String(datas, 0, cnt) + ",";
			System.out.println(datas);
			System.out.println(cnt);
		}
		
		
		
		fr.close();
		return result.substring(0, result.length()-1);
	}
	public static void main(String[] args) throws Exception {
		//int num만큼 파일안에 있는 값을 끈어서 ,로 구분하기
		
				FileReader fr = new FileReader("C:\\Users\\user\\Desktop\\iot\\text4.txt");
				char[] datas = new char[2];
				
				String result = "";
				int cnt = 0;
				
				while ((cnt =fr.read(datas)) != -1) {
					result += new String(datas, 0, cnt) + ",";
					System.out.println(datas);
					System.out.println(cnt);
				}
				
				
				
				fr.close();
	}
}
