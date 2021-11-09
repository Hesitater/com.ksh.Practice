package p18io.p04writer;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.Reader;
import java.io.Writer;
import java.io.Writer;

public class Ex03 {
	public static void main(String[] args) throws Exception {
		String name ="C:\\Users\\user\\Desktop\\iot\\outtest9.txt";
		String des = "C:\\Users\\user\\Desktop\\iot\\outtest11.txt";
		
		Reader rd = new FileReader(name);
		Writer wr = new FileWriter(des);
		char[] datas = new char[3];
		int cnt = 0;
		
		while ( (cnt = rd.read(datas)) != -1) {
			wr.write(datas, 0, cnt);
		}
		
		System.out.println("프짱");
		rd.close();
		wr.close();
		
	}
}
