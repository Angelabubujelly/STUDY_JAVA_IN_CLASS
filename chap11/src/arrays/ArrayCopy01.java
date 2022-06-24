package arrays;

import java.util.Arrays;

public class ArrayCopy01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		char[] arr1 = {'J','A','V','A'};
		//주소를 다른 변수 넣는거... 하나으ㅣ 객체를 둘 다 가리킨다.
		char[] arr2 =arr1;
		arr1[1] = 'y'; //☜ arr1[1]을 y로 고치시오~
		
		System.out.println(arr2[1]);
		
		arr1[1] = 'A';
		
		char[]	arr3 = Arrays.copyOf(arr1, arr1.length); //arr1의 4개를 복사해서 arr3에 넣으시오~
		System.out.println(Arrays.toString(arr3));
		System.out.println("♡♡♡♡♡♡♡♡♡♡♡♡♡♡");
		arr3[0] = 'n';

		System.out.println(Arrays.toString(arr1));
		System.out.println(Arrays.toString(arr3));
		System.out.println("♡♡♡♡♡♡♡♡♡♡♡♡♡♡");
		
		char[] arr4 = Arrays.copyOfRange(arr1, 1,2); //뒤의 숫자는 포함 안 해서 ...
//		System.out.println(Arrays.toString(arr4));
		System.out.println("♡♡♡♡♡♡♡♡♡♡♡♡♡♡");
		
	//arrays.copy는 system 안에 있어요옹 ..
		//카피 많이 사용한대!!!
		char []	arr5 = new char[arr1.length];
		System.arraycopy(arr1, 1, arr5, 0, 3);
		System.out.println(Arrays.toString(arr5));
	
	}

}
