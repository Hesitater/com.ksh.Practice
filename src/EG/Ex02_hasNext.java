package EG;

import java.util.ArrayList;
import java.util.Scanner;

public class Ex02_hasNext {
	public static void main(String[] args) {
		ArrayList<Integer> list = new ArrayList<>();
		Scanner scanner = new Scanner(System.in);
		
		boolean run = true;

		while (run) {
			System.out.print("0:종료, 1:출력, 2:삭제, 3:합계 4:통계 점수(50이상)>");

			if (scanner.hasNextInt()) {
				int i = scanner.nextInt();
				int x = i;
				System.out.println("i" + i);
				if (x == 0) {
					System.out.println("if x = 0");					//도달 확인
					System.out.println("종료합니다.");				
					break;
				} else if (i == 1) {
					System.out.println("else if i == 1");			//도달 확인
					for (int j = 0; j < list.size(); j++) {
						System.out.println(list.get(j));
					}
					list.add(i);
				} else if (scanner.hasNext()) {
					System.out.println("else if hasnext");			// 도달 확인
					String s = scanner.next();
					if (s.equals("r")) {
						if (list.size() > 0) {
							list.remove(list.size() - 1);
						} else if (s.equals("통계")) {
							int sum = 0;
							double avg = 0.0;
							for (int j = 0; j < list.size(); j++) {
							sum += list.get(j);
						}
							for (int j = 0; j < list.size(); j++) {
								avg += (double) (list.get(j)) / list.size();
							}
							System.out.println("합: " + sum);
							System.out.println("평균: " + avg);
						}
					}
					System.out.println("for문 통과함");			// 도달확인
				}
				System.out.println("scanner.hasNext()를 통과함");		//도달확인
			}
		}
	}
}
