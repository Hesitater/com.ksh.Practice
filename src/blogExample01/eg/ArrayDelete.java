package blogExample01.eg;

import java.util.Arrays;

public class ArrayDelete {
	public static void main(String[] args) {
		

		// 배열의특징 중 하나 크기가 고정이다. 지운다는 개념은 없다 덮어준다..?
		// 배열의 중간에 비우고(?) , 뒤에껄 하나씩 끌고오고 , 마지막배열을 막음으로써 지운 것 처럼 보이게
		// 배열에서 삭제는 없고 삭제 된것처럼 보여준다.

//		단면적으로

		int[] arr = {1,2,3,4,5,6,7,8,9,10};
		//4번째 인덱스의 삭제를 표현
		//마지막 인 10(인덱스11)에서 하나를 끌어올 그 뒤가 없다
		System.out.println(Arrays.toString(arr));
		
		for(int i = 4; i < arr.length -1; i++ ) { //arr.length - 1 ; 대표적인 표현임
			arr[i] = arr[i+1];
			
		}
			
		System.out.println(Arrays.toString(arr));
		
	}
}
