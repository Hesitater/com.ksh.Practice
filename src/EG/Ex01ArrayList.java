package EG;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Ex01ArrayList {
	public static void main(String[] args) {
		List<String> list = new ArrayList<>();
		
		Scanner scan = new Scanner(System.in);
		
		boolean run = true;
		
		
		while (run) {
			System.out.print("l:list, e:exit 입력>");
			String s = scan.next();
			
			if(s.equals("l") ) {
				for (int i = 0; i < list.size(); i++) {
					System.out.println(list.get(i));
				}
			} else if (s.equals("e")) {
				run = false;
			} else 
				list.add(s);
		
		}
		
	}
}
