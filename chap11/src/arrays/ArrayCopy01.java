package arrays;

import java.util.Arrays;

public class ArrayCopy01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		char[] arr1 = {'J','A','V','A'};
		//�ּҸ� �ٸ� ���� �ִ°�... �ϳ����� ��ü�� �� �� ����Ų��.
		char[] arr2 =arr1;
		arr1[1] = 'y'; //�� arr1[1]�� y�� ��ġ�ÿ�~
		
		System.out.println(arr2[1]);
		
		arr1[1] = 'A';
		
		char[]	arr3 = Arrays.copyOf(arr1, arr1.length); //arr1�� 4���� �����ؼ� arr3�� �����ÿ�~
		System.out.println(Arrays.toString(arr3));
		System.out.println("����������������������������");
		arr3[0] = 'n';

		System.out.println(Arrays.toString(arr1));
		System.out.println(Arrays.toString(arr3));
		System.out.println("����������������������������");
		
		char[] arr4 = Arrays.copyOfRange(arr1, 1,2); //���� ���ڴ� ���� �� �ؼ� ...
//		System.out.println(Arrays.toString(arr4));
		System.out.println("����������������������������");
		
	//arrays.copy�� system �ȿ� �־��� ..
		//ī�� ���� ����Ѵ�!!!
		char []	arr5 = new char[arr1.length];
		System.arraycopy(arr1, 1, arr5, 0, 3);
		System.out.println(Arrays.toString(arr5));
	
	}

}
