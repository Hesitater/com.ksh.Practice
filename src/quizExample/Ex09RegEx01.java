package quizExample;

import java.util.Scanner;
import java.util.regex.Pattern;

public class Ex09RegEx01 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		boolean run = true;
		String pattern = "[a-zA-Z]\\w\\w";

		while (run) {
			System.out.print("입력>");
			String input = scanner.nextLine();
			
			
			if (Pattern.matches(pattern, input)) {
				System.out.println(input + "은 " + pattern + "패턴과 일치합니다.");
			} else {
				System.out.println(input + "은 " + pattern + "패턴과 일치하지 않습니다.");
			}
			if(input.equals("000")) {		//선생님꺼에 루프 탈출문 추가
				System.out.println("프로그램을 종료합니다.");
				run = false;
			}
		}

		scanner.close();
	}
}
