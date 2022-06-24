package chap03_3;

public class ConditionalOp {

	public static void main(String[] args) {
		int score = 65;
		int score2 = 02;
		char grade = score >= 60 ? 'A' : '#';
		char grade2 = score2 >= 90 ? 'A' : '#';
		System.out.println(grade);
		System.out.println(grade2);

		grade = score >= 90 ? 'A' :	(score >= 80 ? 'B' : (score >= 70 ? 'C' : (score>= 60 ? 'D' : 'F')));
		System.out.println(grade);
		
	}

}
