package arrays;

import java.util.Arrays;

public class Equals02 {

	public static void main(String[] args) {
		int[][] ori = {{1,2,3}, //�迭�� [2][3] ��������~~
			         	{4,5,6}};
		
		System.out.println("[���� ������ ��]");
          int[][] cloned = Arrays.copyOf(ori, ori.length);
          System.out.println("�迭�� ���� �� : " + ori.equals(cloned)); //overriding �Ѱ� �ƴ϶� ���� �޶���
          System.out.println("1�� �迭 �׸� ��: " + Arrays.equals(ori, cloned)); //���� ���� ���غ��� ����
          System.out.println("��ø �迭 �׸� ��: " + Arrays.deepEquals(ori, cloned));
          
          ori[0]	[0] = 9;
          
         for(int i=0; i<ori.length; i++) {
        	 for (int j=0; j<ori[i].length; j++) {
        		 System.out.print(cloned[i][j]+", ");
        	 }
        	 System.out.println();
         }
         System.out.println("������������������������");
          
         ori[0][0] = 1;
         System.out.println("[���� ������ ��]");
         int[][] cloned2 =Arrays.copyOf(ori, ori.length);
         cloned2[0]  = Arrays.copyOf(ori[0], ori[0].length);
         cloned2[1] =Arrays.copyOf(ori[1], ori[1].length);
         System.out.println("�迭�� ���� �� : " + ori.equals(cloned2)); 				//�ּҺ�
         System.out.println("1�� �迭 ���� ��: " + Arrays.equals(ori, cloned2)); //�ּҺ�
         System.out.println("��ø �迭 �׸� ��: " + Arrays.deepEquals(ori, cloned2)); //�� ��
         System.out.println("������������������������");
         
         ori[0][0] = 9;
         
         for(int i=0; i<cloned2.length; i++) {
        	 for (int j=0; j<cloned2[i].length; j++) {
        		 System.out.print(cloned2[i][j]+", ");
        	 }
        	 System.out.println();
         
         }
	}

}
