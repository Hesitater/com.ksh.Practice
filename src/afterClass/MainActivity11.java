package afterClass;

public class MainActivity11 {
	public static void main(String[] args) {

		
		String data = "1 3";
		int s = data.indexOf(" ");
		
		int num1 = Integer.parseInt(data.substring(0,s));
		int num2 = Integer.parseInt(data.substring(s+1));
		
		System.out.println(num1 + num2);
		
		
		
		
		
		
		
		
		
		
		
		//		String str = "가/나/다/라/마/바/사";
//		
//		String[] str2 = str.split("/");
//		
//		for (int i = 0; i < str2.length; i++) {
//			System.out.println(str2[i]);
//		}
//		
//		String strNum = "1234";
//		int num = Integer.parseInt(strNum);
//		
//		System.out.println(num);
//		System.out.println(1 + num );
//		
		
	}

}
