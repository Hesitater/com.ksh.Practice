package blogExample01.eg;

public class quiz08Example {
	public static void main(String[] args) {

		/*
		 * 덤값을 이용하여 0~3까지 랜덤수를 발생시켜주세요 나오는 랜덤수를 배열의 index에 적용해서, 선택된 단어가 어느나라말인지 출력해주세요
		 * 
		 */

		String[] arr = { "안녕하세요", "hi", "니 취팔로마", "#$%" };

		int index = (int) (Math.random() * arr.length);
		System.out.println(arr[index]);

		System.out.println("선택된 단어: " + arr[index]);
		switch (arr[index]) {
		case "안녕하세요":
			System.out.println("한국어 입니다");
			break;
		case "hi":
			System.out.println("영어 입니당");
			break;
		case "니 취팔로마":
			System.out.println("중국어 랑께");
			break;
		case "#$%":
			System.out.println("shift 345");
			break;
		default:
			System.out.println("허허...이건 좀..");
			break;
		}

	}
}
