package p18io.p04writer;

import java.io.FileWriter;
import java.io.IOException;
import java.io.Writer;

public class Ex02 {
	public static void main(String[] args) throws Exception {
		String fileName = "C:\\Users\\user\\Desktop\\iot\\outtest9.txt";

		Writer wr = new FileWriter(fileName);
		char[] datas = {'s', 'p', 'r', 'i', 'n', 'g'};
		char[] data2 = {'j', 'a', 'v', 'a'};
		char[] data3 = {'l', 'o', 'v', 'e'};
		wr.write(datas);
		wr.write(data2);
		wr.write(datas);
		wr.write(data3);
		wr.write(datas, 3, 3);;
		
		
		System.out.println("프짱");
		wr.close();
	}
}
