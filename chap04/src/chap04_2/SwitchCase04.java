package chap04_2;

public class SwitchCase04 {

	public static void main(String[] args) {
		int month =7;
		
		switch(month) {
		case 1:
		case 2:
			System.out.println("겨울");
			break;
		case 3:
		case 4:
		case 5:
			 System.out.println("봄");
			 break;
		case 6: case 7: case 8:
			System.out.println("여름");
			break;
		case 9: case 10: case 11:
			System.out.println("가을");
			
		default:
			System.out.println("겨울");
		}

	}

}
