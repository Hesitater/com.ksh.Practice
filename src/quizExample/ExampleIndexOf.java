package quizExample;

public class ExampleIndexOf {
	public static void main(String[] args) {
		// "공장" 이 있는 index들을 출력

	//"공장" 이 있는 index들을 출력
		
		String str = "간장 공장 공장장은 강 공장장이고 된장 공장 공장장은 공 공장장이다";
		System.out.println(str.length());	//37
		int i = str.indexOf("공장") + 1;
		int sum = 0;
		for ( i = 0; i <= str.length()-1; i++) {
			
			if(i == str.indexOf("공장",i) -1) {
				System.out.println(str.indexOf("공장",i));

			}
		}
	}
}
