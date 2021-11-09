package p18io.p04writer;

import java.io.FileWriter;
import java.io.IOException;
import java.io.Writer;

public class QuizEx09 {
	public static void main(String[] args) throws Exception {
		String fileName = "C:\\Users\\user\\Desktop\\iot\\outtest8.txt";
		Writer wr = new FileWriter(fileName);
		
		for (char c = 'A'; c < 'Z'+1; c++) {
			wr.write(c);
		}
		
		System.out.println("프짱");
		wr.close();
	}
}
