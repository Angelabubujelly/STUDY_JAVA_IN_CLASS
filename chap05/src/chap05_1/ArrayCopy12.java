package chap05_1;

import java.util.Arrays;

public class ArrayCopy12 {

	public static void main(String[] args) {
		int[] score = {37, 87, 58, 36, 98};
		int[] sc2 =new int[10]; //�ϴ� �迭 ���� �صα�...
		

		
		for(int i=0; i<score.length;i++) {
			sc2[i]=score[i];
		}
		System.out.println(Arrays.toString(sc2));

		


		int[] sc3 = new int[10];
		for (int i = 0; i<score.length; i++) {
			sc3[9-i] = score[i]; //sc3[sc3.length-(i+1)] = score[i];
		}
		
		System.out.println(Arrays.toString(sc3));
		
	}

}
