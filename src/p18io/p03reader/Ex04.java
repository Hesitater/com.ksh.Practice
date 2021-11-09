package p18io.p03reader;

import java.io.FileReader;
import java.io.IOException;
import java.io.Reader;
import java.util.Arrays;

public class Ex04 {
	public static void main(String[] args) throws Exception {
		String name = "C:\\Users\\user\\Desktop\\iot\\text4.txt";
		Reader fr = new FileReader(name);
		char[] datas = new char[3];
		
		int cnt = 0;
		
		while ( (cnt =fr.read(datas)) != -1) {
			for (int i = 0; i < cnt; i++) {
				System.out.print(datas[i] + ",");
			}
		}
		
		
		fr.close();
	}
}
