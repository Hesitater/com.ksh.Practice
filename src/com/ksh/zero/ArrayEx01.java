package com.ksh.zero;

import java.util.Arrays;

public class ArrayEx01 {
	public static void main(String[] args) {

		// 1.배열의 선언
		int[] arr;

		// 2. 배열의 생성 - 생성시에 크기를 지정
		arr = new int[5];
		System.out.println(arr);

		// 3. 배열의 초기화 ( 값을 지정하는 과정)
		arr[0] = 10;
		arr[1] = 20;
		arr[2] = 30;
		arr[3] = 40;
		arr[4] = 50;

		// 4.배열의사용
		System.out.println("배열의 3번째 값 : " + arr[2]);
		arr[2] = 1000;
		System.out.println("배열의 3번째 값은 :" + arr[2]);

		// 5. 배열의 저장된 값을 한눈에 확인하는 명령
		System.out.println(Arrays.toString(arr));

		// 6. 배열의 길이를 확인하는 명령
		System.out.println("배열의 길이 :" + arr.length);

		// 7. 배열의 선언과 생성을 동시에
		byte[] arr2 = new byte[7];
		System.out.println(Arrays.toString(arr2));

		// 8. 배열의 선언과 생성과 초기화를 동시에
		short[] arr3 = { 1, 2, 3, 4, 5, 6 };
		System.out.println(Arrays.toString(arr3));
		System.out.println(arr3.length);

		short[] arr4 = new short[] { 1, 2, 3, 4, 5, 6 };

		System.out.println(Arrays.toString(arr4));
		String[] arr9 = new String[] { "월요일", "화요일", "수요일" };

		System.out.println(Arrays.toString(arr9));

		System.out.println("----------------------------------");

// Day04 - 배열(Array)부터

	}

}
