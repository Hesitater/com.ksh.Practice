package quizExample;

import java.util.Scanner;

public class Ex08Split_hasnext {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		boolean run = true;
		
		while(run) {
			System.out.print("입력문자열:");
		
			if (scanner.hasNextInt()) {
				int i = scanner.nextInt();
				if (i == 0) {
					System.out.println("종료합니다.");
					break;
				}
			} else if(scanner.hasNext()) {
				String input = scanner.nextLine();
				System.out.print("구분자:");
				String dm = scanner.nextLine();
		
		
				String[] arr1 = input.split(dm);
		
				for (String str : arr1) {
					System.out.println(str);
				}
			}
		}	
	}		
  }
