package chap05_1;

import java.util.Arrays;

public class ArrayFor14 {

	public static void main(String[] args) { 
		//향상된 for문은 '배열'에서만 사용한다...
		
		int [] score = {56, 98, 67 , 97, 26};
		
		int sum = 0;
		for (int i=0; i<score.length; i++) {
			sum += score[i];
		}
		System.out.println("합계 = " + sum);
		sum = 0;
		for (int sc2: score) {
			sum += sc2;
		}
		System.out.println(Arrays.toString(score));
		System.out.println("합계 = " + sum);
	
		String[] names = {"kim", "jung", "kyeong"};
		for(int i=0; i<names.length; i++) {
			System.out.println(names[i] + " ");
		}
		System.out.println();
		
		for(String name : names) {
			System.out.print(name + " ");
		}
	}

}
