package p18io.p03reader;

import java.io.FileReader;
import java.io.IOException;
import java.io.Reader;
import java.util.Arrays;

public class Ex03 {
	public static void main(String[] args) throws Exception {
		String name = "C:\\Users\\user\\Desktop\\iot\\text4.txt";
		Reader fr = new FileReader(name);
		char[] datas = new char[3];
		
		//캐릭터배열을 받는 read메소드
		int cnt1 = fr.read(datas);
		System.out.println(Arrays.toString(datas));;
		System.out.println(cnt1 +"개 읽음");
		
		int cnt2 = fr.read(datas);
		System.out.println(Arrays.toString(datas));;
		System.out.println(cnt2 +"개 읽음");
		
		int cnt3 = fr.read(datas);
		System.out.println(Arrays.toString(datas));;
		System.out.println(cnt3 +"개 읽음");
		
		int cnt4 = fr.read(datas);
		System.out.println(Arrays.toString(datas));;
		System.out.println(cnt4 +"개 읽음");
		
		int cnt5 = fr.read(datas);
		System.out.println(cnt5 +"개 읽음");
		
		
		fr.close();
		
	}
}
