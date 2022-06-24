package arrays;

import java.util.Arrays;

public class Equals02 {

	public static void main(String[] args) {
		int[][] ori = {{1,2,3}, //배열에 [2][3] 넣지마잍~~
			         	{4,5,6}};
		
		System.out.println("[얕은 복사후 비교]");
          int[][] cloned = Arrays.copyOf(ori, ori.length);
          System.out.println("배열의 번지 비교 : " + ori.equals(cloned)); //overriding 한게 아니라 번지 달라유
          System.out.println("1차 배열 항목값 비교: " + Arrays.equals(ori, cloned)); //안의 값을 비교해보면 같져
          System.out.println("중첩 배열 항목값 비교: " + Arrays.deepEquals(ori, cloned));
          
          ori[0]	[0] = 9;
          
         for(int i=0; i<ori.length; i++) {
        	 for (int j=0; j<ori[i].length; j++) {
        		 System.out.print(cloned[i][j]+", ");
        	 }
        	 System.out.println();
         }
         System.out.println("♡♡♡♡♡♡♡♡♡♡♡♡");
          
         ori[0][0] = 1;
         System.out.println("[깊은 복사후 비교]");
         int[][] cloned2 =Arrays.copyOf(ori, ori.length);
         cloned2[0]  = Arrays.copyOf(ori[0], ori[0].length);
         cloned2[1] =Arrays.copyOf(ori[1], ori[1].length);
         System.out.println("배열의 번지 비교 : " + ori.equals(cloned2)); 				//주소비교
         System.out.println("1차 배열 번지 비교: " + Arrays.equals(ori, cloned2)); //주소비교
         System.out.println("중첩 배열 항목값 비교: " + Arrays.deepEquals(ori, cloned2)); //값 비교
         System.out.println("♡♡♡♡♡♡♡♡♡♡♡♡");
         
         ori[0][0] = 9;
         
         for(int i=0; i<cloned2.length; i++) {
        	 for (int j=0; j<cloned2[i].length; j++) {
        		 System.out.print(cloned2[i][j]+", ");
        	 }
        	 System.out.println();
         
         }
	}

}
