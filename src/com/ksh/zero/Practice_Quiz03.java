package com.ksh.zero;

public class Practice_Quiz03 {
	public static void main(String[] args) {

		// 이거 보면서 연습해야할듯.
//	int x = 2;
//	int y = 5;
//	char c = 'A'; // 'A'의 문자코드는 65 
//	
//	System.out.println(y += 10 - x++); // 7
//	//y += 10 을 하면 y = y + 10 -> y = 5 + 10 , x++ -> 2++ / 여기서 x는 2이고 , 
//	// 다음에 나오는 x부터는 3이 되죠
//	// 그리고 연산 우선순위에 의해서 대입보다는 연산이 먼저 됩니다.
//	//y = 5 + 10 - 2 -> y = 15 - 2 -> y = 13 이 됩니다. 그래서 결과값은 13
//	System.out.println(x+=2); // x+=2 -> x = x + 2 근데 이전에  x++ 로 인하여 x값이 증가하여 3이되어서 x = 3 + 2
//	System.out.println( !('A' <= c && c <= 'Z') ); // false
//	System.out.println('C'- c); // 2
//	System.out.println(c+1); // 66
//	System.out.println(++c); // B
//	System.out.println(c++); // B
//	System.out.println(c); // C

// 1. 1~100까지 랜덤한 정수를 생성하고, 3의 배수 인지 아닌지  3항 연산식으로 판별
// 2. -5 ~ 5까지 랜덤한 정수를 생성하고, 무조건 절대값만 출력하는 3항 연산식을 만드세요
// 3. 1~200까지 의 랜덤한 수를 만드는데 이것을 사과의 개수라고 가정.
//		bucket은 사과를 담는 바구니입니다. (최대 10개까지 들어갑니다)
//    어떤 사과가 나오던, 필요한 바구니의 개수를 구하는 3항연상식을 만드세요

////	1. 1~100까지 랜덤한 정수를 생성하고, 3의 배수 인지 아닌지 3항 연산식으로 판별
//		
		int r = (int) (Math.random() * 100 + 1);
//	int r = (int)(Math.random()*101);	

		System.out.println(r);
		System.out.println(r + "는 " + (r % 3 == 0 ? "는 3의배수입니다" : "는 3의배수가아냐"));

		// 2. -5 ~ 5까지 랜덤한 정수를 생성하고, 무조건 절대값만 출력하는 3항 연산식을 만드세요

		int r2 = (int) ((Math.random() * 11) - 5);
		System.out.println(r2 + "의 절대값은 : " + (r2 >= 0 ? r2 : -r2));

		// 3. 1~200까지 의 랜덤한 수를 만드는데 이것을 사과의 개수라고 가정.
		// bucket은 사과를 담는 바구니입니다. (최대 10개까지 들어갑니다)
		// 어떤 사과가 나오던, 필요한 바구니의 개수를 구하는 3항연상식을 만드세요

		int apple = (int) (Math.random() * 200) + 1;
		int bucket = 10;
		int needBucket = 0;

		needBucket = apple % bucket == 0 ? apple / bucket : apple / bucket + 1;

//	바구니 구하기 삼항연산자를 if else 구문으로 바꿀걸 주석처리
//	if(apple % bucket == 0) {
//		needBucket = apple / bucket;
//	} else {
//		needBucket = (apple / bucket) +1; 
//	}

		System.out.println("사과의 개수 : " + apple);
		System.out.println("바구니의 개수 : " + needBucket);
		
		System.out.println("----------------숙제----------------");
		
//   숙제  -10~ 10까지의 랜덤수를 만들고,  이 랜덤한 값이 0인지 , 양수, 음수 판별
		// 조건 - if else 쓰지 않습니다. (3항 연산식 중첩으로)
		
		int x = (int)(Math.random()*21) - 10 ;
		System.out.println("x의 값: " + x );
		System.out.println( x > 0 ? "양수 " : (x < 0? "음수" : 0) );
		System.out.println(x > 0 ? "양수" : ( x == 0 ? 0 : "음수"));
	}

}
