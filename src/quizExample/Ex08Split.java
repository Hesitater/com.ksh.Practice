package quizExample;

import java.util.Scanner;

public class Ex08Split {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		boolean run = true;
		
		while(run) {
		System.out.print("입력문자열:");
		String input = scanner.nextLine();
		if(input.equals("s")) {
			System.out.println("s를 눌렀으니 끌꺼야");
			break;
		}
		
		System.out.print("구분자:");
		String dm = scanner.nextLine();
		
		
		String[] arr1 = input.split(dm);
		
		for (String str : arr1) {
			System.out.println(str);
		}
		
		}
		
	}
}
