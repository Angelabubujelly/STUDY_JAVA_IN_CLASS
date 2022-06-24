package chap04_2;

public class SwitchCase01 {

	public static void main(String[] args) {
		int num = (int)(Math.random()*6);
		
		switch (num) { //반드시 괄호 써줘~~
		case 1: //:붙으면 뒤오ㅏ 상관없이 case 1은 1에서 끝.
		System.out.println("1입니다.");
		break;
		case 2:
			System.out.println("2입니다.");
			break;
		case 3:
			System.out.println("3입니다.");
			break;
		case 4:
			System.out.println("4입니다.");
		break;
		default:
			System.out.println("5입니다.");
		}

	}

}
