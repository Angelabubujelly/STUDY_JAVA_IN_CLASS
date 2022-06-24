package chap05_1;

import java.util.Arrays;

public class NewArray05 {

	public static void main(String[] args) {
		int[]	arr1 = new int[10];
		int[]	arr2 = new int[10];
		int[]	arr3 = new int[] {100, 87, 57, 35, 76};
		int[]	arr4 =  {100, 87, 57, 35, 76};	
		
		//1~10까지 랜덤으로 추출하여 arr1에 넣는다.
		
//		int random = (int)(Math.random()*10) +1 ;
//		
//		int[] arr1 = new int[9];
//		for(int i=0; i<=10; i++)		
//		arr1[0]	=(int)(Math.random()* 10) +1;
		
		for(int i=0; i<10; i++) {
		arr1[i] = (int)(Math.random()*10) +1;
		System.out.print(arr1[i] + " ");
		}
		System.out.print("\n");
		// arr2에 1~10까지 순서대로 넣으시오.
		

//				arr2[1]= 2
//				arr3[2] =3
//				arr2[i] = i+1
				for (int i = 0; i<=9;i++) {
					arr2[i] = i+1;
					System.out.print(arr2[i] + " ");
						
				}
				System.out.print("\n");
			System.out.println(Arrays.toString(arr4));
			
	//=====================================================================================================
			
			int len1 =arr1.length;
			System.out.println(len1);
			
			len1 = arr3.length;
			System.out.println(len1);
			
			System.out.println(arr4.length);
			
			for(int i=0; i<arr1.length; i++) {
				arr1[i] = (int)(Math.random()*10) +1;
				System.out.print(arr1[i] + " ");
			}
			
			for(int i=0; i<arr2.length;i++) {
				arr2[i] = i+1;
				System.out.println(arr2[i]+" ");
				
			}
}

}
