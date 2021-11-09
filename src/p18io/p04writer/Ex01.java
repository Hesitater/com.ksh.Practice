package p18io.p04writer;

import java.io.FileWriter;
import java.io.IOException;
import java.io.Writer;

public class Ex01 {
	public static void main(String[] args) throws Exception {
		String fileName = "C:\\Users\\user\\Desktop\\iot\\outtest7.txt";
		Writer wr = new FileWriter(fileName);
		
		wr.write('a');
		wr.write('b');
		wr.write(65);
		wr.write('가');
		wr.write(4355);
		
		
		System.out.println("프짱");
		wr.close();
	}
}
