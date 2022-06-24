package chap10;

import java.util.Arrays;

public class ArrayIndexOutOfBoundsException07 {
	public static void main (String []args	 ) {
		String[] data1 = {"a","b","c"};
//		data1[3] = "d"; //index 3번은 없기때문에 에러남...;;;;
		try { //try는 한줄이어도 반드시 괄호 입력!!!!
		data1[3] ="d";
		System.out.println("data1 : " + Arrays.toString(data1)); //for문 안 들어가도 배열에 있는 값 다 출력해주는 Arrays.toString()
		}		catch (Exception e){ 
			System.out.println("배열의 크기보다 큽니다.");
		}
		
	}
		

}
