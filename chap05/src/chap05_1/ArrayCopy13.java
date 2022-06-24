package chap05_1;

import java.util.Arrays;

public class ArrayCopy13 {

	public static void main(String[] args) {
		

		
		int oldNum[] =  {7,3,9,4,5};
		int newNum[] = new int[10];
		

		System.arraycopy(oldNum, 0, newNum, 0, oldNum.length);
		System.out.println(Arrays.toString(newNum));
		
		int newNum2[] =new int[10];
		System.arraycopy(oldNum, 0, newNum2, 2, oldNum.length);
		System.out.println(Arrays.toString(newNum2));
		
		int newNum3[] =new int[10];
		System.arraycopy(oldNum, 0, newNum3, 2, 3);
		System.out.println(Arrays.toString(newNum3));
		
		int newNum4[] =new int[10];
		System.arraycopy(oldNum, 1, newNum4, 4, 3);
		System.out.println(Arrays.toString(newNum4));
		
		String oldStr[]= {"java","html5","JSP"};
		String newStr[] = new String[5];
		System.arraycopy(oldStr, 0, newStr, 2, 3	);
		
		System.out.println(Arrays.toString(newStr));
	}

}
