package chap10;

import java.util.Arrays;

public class ArrayIndexOutOfBoundsException07 {
	public static void main (String []args	 ) {
		String[] data1 = {"a","b","c"};
//		data1[3] = "d"; //index 3���� ���⶧���� ������...;;;;
		try { //try�� �����̾ �ݵ�� ��ȣ �Է�!!!!
		data1[3] ="d";
		System.out.println("data1 : " + Arrays.toString(data1)); //for�� �� ���� �迭�� �ִ� �� �� ������ִ� Arrays.toString()
		}		catch (Exception e){ 
			System.out.println("�迭�� ũ�⺸�� Ů�ϴ�.");
		}
		
	}
		

}
