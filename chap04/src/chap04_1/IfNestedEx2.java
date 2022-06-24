package chap04_1;

import java.util.Scanner;

public class IfNestedEx2 {

	public static void main(String[] args) {
		
		Scanner scan1 = new Scanner(System.in);
		System.out.println("점수를 입력하세요."); //사용자한테 일단 알려줘야합뉘돵돵돵~ 지금은 점수 입력해도 출력문 하나 없어서 머 안 떠용
		
		int score = scan1.nextInt(); 
		String grade;
		//문자열 저장공간안에 점수가 들어가??? if문 grade에 들어있는 문자열이 출력되는거?????? 나중에 한번만 출력하려궁 저장공간만든겨
		//만약 마지막 else가 없으면 공백 추출하라구 =""; 적는거얌...
		
		
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
		
		

	


