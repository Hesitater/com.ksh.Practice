package afterClass;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Test3 {
	public static void main(String[] args) {
		System.out.println("[Program Start]");
		System.out.println("");
		
		/**
		 * [배열 형태 String 문자열 데이터를 list 리스트 배열로 변경 실시 - Arrays asList , split]
		 * 1. list 형식 문자열 : [1, 2, 3 ..] 식으로 대괄호를 포함한 문자열 데이터입니다
		 * 2. Arrays.asList 사용해 문자열 데이터를 리스트로 변경할 수 있습니다
		 * */
		
		// 초기 리스트 형식 문자열 데이터 선언 실시
		String strData = "[1, 2, 3]";
		System.out.println("String 문자열 : " + strData);
		System.out.println("");
		
		// 리스트 형식 문자열을 받아서 파싱 실시
		String parseData = strData;
		parseData = parseData.replaceAll("\\[", ""); // 대괄호 지움
		parseData = parseData.replaceAll("\\]", ""); // 대괄호 지움
		parseData = parseData.replaceAll(" ", ""); // 공백 지움
		parseData = parseData.replaceAll("\\\"", ""); // 쌍따옴표 지움
		
		// Arrays.asList 사용해 콤마 기준으로 문자열 잘라서 데이터를 삽입합니다
		List<String> dataList = new ArrayList(Arrays.asList(parseData.split(",")));
		System.out.println("리스트 : " + dataList.toString());

	}
}
