package p18io.p04writer;

import java.io.FileWriter;
import java.io.IOException;
import java.io.Writer;
import java.util.Scanner;

public class Ex11 {
	public static void main(String[] args) throws Exception {
		String name = "C:\\Users\\user\\Desktop\\iotest\\outtestP.txt";

		// 사용자로 입력 받은 내용을
		// 파일에 작성하기 Scanner랑 Write 적절히
		// exit라고 입력 받으면 종료

		Scanner scanner = new Scanner(System.in);
		Writer writer = new FileWriter(name);
		
		String input = null;
		boolean run = true;
		while (run) {
			System.out.print("입력:");
			input = scanner.nextLine();

			if (input.equals("exit")) {
				break;
			}
			
			writer.write(input);
			writer.write("\n");
		}
		
		System.out.println("프로그램 종료");
		writer.close();
		scanner.close();
	}
}
