package quizExample;

public class Practice {
	public static void main(String[] args) {
		
		int num1 = 10, num2 = 20;
		
		String strNum = "100";
		
		Integer n1 = new Integer(strNum);
		Integer n2 = Integer.valueOf(strNum);
		
		System.out.println(n1 + 10);
		System.out.println(n2 + 20);
		Integer n3 = 10;
		
		String strNum2 = Integer.toString(n3);
		String strNum3 = n2 + "";
		String strNum4 = n2.toString();
		
		
		
		System.out.println(strNum2);
		System.out.println(strNum3);
		System.out.println(strNum4);
		
	}
}
