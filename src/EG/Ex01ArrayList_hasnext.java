package EG;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Ex01ArrayList_hasnext {
	public static void main(String[] args) {
		List<String> list = new ArrayList<>();
		Scanner scanner = new Scanner(System.in);

		boolean run = true;

		while (run) {
			System.out.print("l:list, e:exit 입력>");
			String s = scanner.next();
			list.add(s);

			if (scanner.hasNext()) {
				if(s.equals("l") ) {
					for (int i = 0; i < list.size()-1; i++) {
						System.out.println(list.get(i));
					}
					break;
				} else if (s.equals("e")) {
					break;
				} else if(scanner.hasNext()) {
					list.add(s);
				}
			}
		}

	}
}
