package afterClass;

import java.io.UnsupportedEncodingException;
import java.nio.charset.Charset;

public class StringEx {
	public static void main(String[] args) {
		System.out.println("----------1~5---------");
		//1. String(); 비어있는 String 객체를 생성한다.
		String s1 = new String();
		System.out.println(s1);
		
		//2. String(byte[] bytes)
		// byte배열을 입력받아 String 객체를 생성
		byte[] b2 = {104,101,108,108,111};
		String s2 = new String(b2);
		System.out.println(s2);
		
		//3. String(byte[] bytes, Charset charset)
		// byte 배열과 Character Set을 지정하여 String 객체를 생성한다.
		byte[] b3 = {104,101,108,108,111};
		String s3 = new String(b3,Charset.forName("AscII"));
		System.out.println(s3);
		
		//4. String (byte[] bytes, int offset, int length)
		//byte배열, 스트링시작위치(offset), 스트링길이(length)를 지정하여 String 객체를 생성한다
		byte[] b4 = {104,101,108,108,111};
		String s4 = new String(b4,1,3);
		System.out.println(s4);
		
		//5. String(byte[] bytes, int offset, int length, Charset charset)
		//byte배열, 스트링시작위치(offset), 스트링길이(length),Character Set 지정하여 String객체생성
		byte[] b5 = {104,101,108,108,111};
		String s5 = new String(b5, 1,3, Charset.forName("AsCII"));
		System.out.println(s5);
		
		System.out.println("----------6~10---------");
		//6. String(byte[] bytes, int offset, int length, String charsetName)
		//byte배열, 스트링시작위치(offset), 스트링길이(length), CHaracter Set이름을 String Type으로
		//지정하여 String 객체를 생성
		byte[] b6 = {104,101,108,108,111};
		try { 
			String s6 = new String(b6, 1,3, "ASCII");
			System.out.println(s6);
		} catch (UnsupportedEncodingException e) {
			e.printStackTrace();
		}
		
		//7. String(byte[] bytes, String charsetName)
		//byte 배열, Character Set이름을 String Type으로 지정하여 String 객체를 생성한다.
		byte[] b7 = {104,101,108,108,111};
		try {
			String s7 = new String(b7,"ASCII");
			System.out.println(s7);
		} catch (UnsupportedEncodingException e) {
			e.printStackTrace();
		}
		
		//8. String(char[] value)
		// argument로 char배열 객체를 전달 받아 String 객체를 생성한다.
		char[] c8 = {'h', 'e', 'l', 'l', 'o'};
		String s8 = new String(c8);
		System.out.println(s8);
		
		//9. String(char[] value, int offset, int count)
		//char배열, 스트링 시작위치(offset), 스트링길이(count)를 지정하여 String 객체를 생성한다.
		char[] c9 = {'h','e','l', 'l', 'o'};
		String s9 = new String(c9,1,3);
		System.out.println(s9);
		
		//10. String(int[] codePoints, int offset, int count)
		int[] i10 = {104,101,108,108,111};
		String s10 = new String(i10, 1, 3);
		System.out.println(s10);
		
		System.out.println("----------11~----------------");
		//11. String(String original)
        //rgument로 string객체를 전달받아 String 객체를 생성한다
		String s11 = new String("hello");
		System.out.println(s11);
		
		//12. String(StringBuffer buffer)
		//argument로 StringBuffer 객체를 전달받아 String 객체를 생성한다
		StringBuffer sb12 = new StringBuffer();
		sb12.append("hello");
		String s12 = new String(sb12);
		System.out.println(s12);
		
		//13. String(StringBuilders builder)
		//argument로 StringBUilder 객체를 전달 받아 String 객체를 생성한다.
		
		StringBuilder sb13 = new StringBuilder();
		sb13.append("hello");
		String s13 = new String(sb13);
		System.out.println(s13);
		
		
		
		
		
		
		
	
	}
}
