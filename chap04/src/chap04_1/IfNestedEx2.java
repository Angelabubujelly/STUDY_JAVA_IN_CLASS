package chap04_1;

import java.util.Scanner;

public class IfNestedEx2 {

	public static void main(String[] args) {
		
		Scanner scan1 = new Scanner(System.in);
		System.out.println("������ �Է��ϼ���."); //��������� �ϴ� �˷�����մ�������~ ������ ���� �Է��ص� ��¹� �ϳ� ��� �� �� ����
		
		int score = scan1.nextInt(); 
		String grade;
		//���ڿ� ��������ȿ� ������ ��??? if�� grade�� ����ִ� ���ڿ��� ��µǴ°�?????? ���߿� �ѹ��� ����Ϸ��� ������������
		//���� ������ else�� ������ ���� �����϶� =""; ���°ž�...
		
		
		if(score >= 90) { 			// 90 ~
		if(score >= 95) { 		// 95 ~
		   grade = "A+";
		  } else {	           // 90~ 94
			grade = "A";}
		
		
	     }  else if (score >= 80) { //80~ 89
			      if(score >= 5) {
				     grade="B+";
	      } else {
				     grade = "B";}
			      
			      
	      } else if (score >= 70) { //70~ 79
	     		 if (score >= 75) {
	     			 grade = "C+";
	      } else {
	     			 grade = "C";}
	 		
	     		 
	     		 
	     } else if(score >=60){
		    	if(score>=65) {
		    	   grade = "D+";
		 } else {
		    	   grade = "D";}

		    	
		 } else {
		    	  grade = "F";}
				System.out.println(grade);
			}
}
		
		

	


