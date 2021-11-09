package com.ksh.zero;

public class Practice {
	public static void main(String[] args) {
		
/*정수형 int
 * 실수형 double
 *  int보다 작으면 int로.. int보다 크면 더 큰걸로..
 *  
 * 
 * 
 */
		
		
//		byte b = 10;
//		short s = b;
//		int i = b;
//		long l = b;
//		
//		System.out.println(b);
//		System.out.println(s);
//		System.out.println(i);
//		System.out.println(l);
//		
		
//		

//		int i = 65;
//		char c = (char)i;
//		short s = (short)i;
//		System.out.println(c);
//		
//		float f = 3.14f;
//		int j = (int)f;
//		
//		System.out.println(f);
//		System.out.println(j);
//		
//		
//		int a = 1000;
//		byte b = (byte)a;
//		System.out.println(a);
//		System.out.println(b);
//		
//		char cc ='A';
//		short ss = (short)cc;
//		System.out.println(cc);
//		System.out.println(ss);
//		
		
	
// byte(1)< short(2) < int(4) < long(8) 여기까지 정수 그뒤로 실수 < float(4) < double(8_
		
		

		
//		char c = 'A';
//		int i = 2;
//		
//		char cc = (char) (c + i);
//		int ii = c + i;
//		System.out.println(cc);
//		System.out.println(ii);
//		
		
//		int j = 10;
//		double d = 3.14;
//		double dd = j + d;
//		
		
//		byte b = 34;
//		short s = 66;
//		
//		short ss = (short) (b + s);
//		int ii2 = b + s;
//		
//		System.out.println(ss);
//		System.out.println(ii2);
//		
//		
		
		
//		System.out.println(j);
//		System.out.println(d);
//		System.out.println(dd);
//		
//		
		
		
//		int i = +3;
//		int j = -i;
//		
//		System.out.println(i);
//		System.out.println(j);
		
		
//		증감 연산자 ++, --
		
//		int k = 1;
//		int h = k++; // 후위 연산자 -> 먼저 값을 대입하고, 그 다음에 1증가
//		
//		System.out.println("k의값 :" + k);
//		System.out.println("h의값 :" + h);
//		
//		int x = 1;
//		int y = ++x; // 전위 연산자 -> 먼저 값을 증가하고, 그 다음에 저장
//		
//		System.out.println(x);
//		System.out.println(y);

//		
//		byte b = 10;
//		System.out.println(~b);
//		
//		boolean bool1 = true;
//		System.out.println(bool1);
		
//		int x = 7 + 3;
//		int y = 7 - 5;
//		int i = 7 / 3;
//		int j = 7 % 3;
//		int k = 8 * 3;
//		
//		// i = 2  , j = 1  k = 24
//		System.out.println(x);
//		System.out.println(y);
//		System.out.println(i);
//		System.out.println(j);
//		System.out.println(k);
//		
//		System.out.println(i == j); //false 2 1 같지않다
//		System.out.println(i != j); //true 2 1 같지 않다 
//		System.out.println(i >= j); // true 2 > 1
//		System.out.println(k % 2 != 0); //false
//		System.out.println(k % 2 == 0); // true
//		System.out.println(k % 6 == 0); // true
				
		
		
		
// 3.비트 연산자 ( &,|,^)
		
//		int a = 5; // 0000 0101
//		int b = 3; // 0000 0011
//		
//		System.out.println(a & b); // 0000 0001 - 두 비트값이 1이면 1,  나머지는 0
//		System.out.println(a | b); // 0000 01111두 비트 중 하나만 1이어도 1을 반환
//		System.out.println(a ^ b); // 0000 0110 - 다르면1 ,  같으면 0
		
		
		
		// 4.비트 쉬프트 >> , <<
//		int h = 100; // 0110 0100
//		System.out.println(h >> 3); // 0000 1100

		// 5. 논리 연산자 ( &, |, &&, || )
		// & 그리고, | 또는,  
		// A && B A가 false일 경우 B를 수행하지 않고 무조건 false
		// A || B A가 true일 경우 B를 수행하지 않고 무조건  true
		
		
		
//		int x = 10, y = 20;
//		
//		//if 문장 뒤에 소괄호가 true라면 if 문을 실행, false 라면 else문을 실행
//		if(x != 10 && ++y ==21) {
//			System.out.println("참 입니다");
//		} else {
//			System.out.println("거짓 입니다");
//			
//			
//		}
//		
//		System.out.println("x는 :" + x + ", y는 :" + y);
//		
//		
//		if(x == 10 || ++y == 21) {
//			System.out.println("참 입니다");
//		} else {
//			System.out.println("거짓 입니다");
//			
//		}
//		
//		System.out.println("x는 :" + x + ", y는 :" + y);
//		
//		//if 문장 뒤에 소괄호가 true라면 if 문을 실행, false 라면 else문을 실행
//				if(x != 10 & ++y ==21) {
//					System.out.println("참 입니다");
//				} else {
//					System.out.println("거짓 입니다");
//					
//					
//				}
//				
//				System.out.println("x는 :" + x + ", y는 :" + y);
//				
//				
//				if(x == 10 | ++y == 21) {
//					System.out.println("참 입니다");
//				} else {
//					System.out.println("거짓 입니다");
//					
//				}
//				
//				System.out.println("x는 :" + x + ", y는 :" + y);
		
		
		
		/*
		 * 프로그램에서는, 어떤 수의 검증을 위해서 랜덤한 값
		 * 
		 * Math.random() - double 형태의 0.0이상 1.0미만의 랜덤수
		 * 
		 */
		
		//System.out.println(Math.random());
		
//		double d = Math.random() * 10; // 0.0이상~10미만
//		System.out.println(d);
//		int s = (int)d;
//				System.out.println(s);
//		int r = (int)d + 1;   // r 1이상~11미만 의 정수
//			System.out.println(r);
			
//		int r = (int)((Math.random()*10) + 1 );
//		System.out.println(r);
//		
//		
//		// 삼항 연산식 - ( 조건 ? 연산 1 : 연산 2)
//		
//		String result = r % 2 == 0 ? "짝수~" : "홀수~";
//		System.out.println(result);
//		
//		System.out.println(r % 2 == 0? "짝수입니다" : "홀수입니다");
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
}
