package chap03_3;

public class AssignmoentOp {

	public static void main(String[] args) {
		int num1 = 10;
//		num1 = num1 + 1; //길죠?
		num1 += 1; //기존의 num1에다 1을 더해 num1값을 덮어씌우쇼랑 같은 말
		System.out.println(num1);
		
		//to be ^^
		//1. 변수명, 상수명 등 이름을 붙일 때 이름만 보고도 무엇을 하는지 알 수 있을 정도로 이름을 잘 붙이는 사람.
		//ex) age, name 등등 웅 이거 나이얘기, 웅 이거 이름얘기..등
		//2. 주석 잘 다는 사람... 프로젝트 진행 할 때 
		//ex)페이지 보여주는 부분, 패스워드 잘못됐을 떄 보여주는 페이지 등 말해주는... 프로그램 사용 중 에러가 나고
		//    업데이트 할 때 에러가 난 부분을 적절한 주석을 통해 바로 찾을 수 있다.
		//3. 똑같은 결과를 낼 때 줄이 짧은 사람... 또 를 르
		
		num1 -= 5;
		System.out.println(num1);
		
		num1 *= 4;
		System.out.println(num1);
		
		num1 /= 5;
		System.out.println(num1);
		
		num1 %= 3;
		System.out.println(num1); //요 다섯가지 많이 씀
		

		
	}

}
