package blogExample01.eg;

import java.util.Scanner;

public class SwitchEx02 {
	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		System.out.print("점수> ");
		int point = scan.nextInt();

		switch (point / 10) { // 앞자리로 구분하는거 좀 대단 근데 95점은?
		case 9:
			if (point > 100) { // 앞자리가 9인것들 중 if문을 사용하여 나눴음
				System.out.println("점수가 100초과로 등급안나옴");
			} else if (point >= 95) {
				System.out.println("너의 점수는 " + point + " 너의 등급은 A+ ㅊㅊ ");
			} else {
				System.out.println("너의 점수는 " + point + " 너의 등급은  A ");
			}
			break;
		case 8:
			System.out.println("너의 점수는 " + point + " 너의 등급은  B ");
			break;
		case 7:
			System.out.println("너의 점수는 " + point + " 너의 등급은  C  ");
			break;
		case 6:
			System.out.println("너의 점수는 " + point + " 너의 등급은  D ");
			break;
		default:
			System.out.println("FFFFFFFFFFFF");
			break;
		}

		scan.close();

	}
}
