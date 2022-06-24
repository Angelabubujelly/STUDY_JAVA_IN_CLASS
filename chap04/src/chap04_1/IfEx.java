package chap04_1;

public class IfEx {

	public static void main(String[] args) {
		int score = 50;
		
		if(score >= 60) 
			System.out.println("통과입니다.");
		System.out.println("어이어이"); //if문과 상관 없음.
			
		
		int score2 = 50;
			
		if(score2 >= 90) {
			System.out.println("참 잘했습니다.");
			System.out.println("장학금을 수여합니다");
		
		System.out.println("이야이야오"); //얜 if가 있으니까 조건에 안 맞으면 출력 X
		
		}
	
	
		
		System.out.println("프로그램 종료"); //얜 if가 없으니까 괄호 바깥의 이넘은 if문과 관련없이 나옴.
	
	
	
	
	
	if(score >= 80) {
		System.out.println("합격입니다.");
		System.out.println("축하합니다.");
	
	}
	
	if(score <80) {
		System.out.println("불합격입니다");
		System.out.println("다음 기회에...");
	}
	
	
	

}
}
