package chap04_1;

public class ifElseEx {

	public static void main(String[] args) {
		int score = 77;
		
		if(score >= 80) {
			System.out.println("축하합니다.");
			System.out.println("합격입니다");
		} else {
			System.out.println("불합격입니다.");
			System.out.println("다음 기회에...");
		}

		// 한 줄일 때 중괄호를 해도 되고 안해도 됨
		if(score >= 80)
			System.out.println("보바입니다");
		else
			System.out.println("바보입니다.");
		
		if(score >= 90) 
		
			System.out.println("사람입니다");
		else {
			System.out.println("강아지입니다.");
			System.out.println("다음 기회에...");
		}
		
		
	}

}
