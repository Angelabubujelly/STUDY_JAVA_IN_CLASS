package chap06_1;

public class MainClassTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 
		int value = 52;
		String name = "밤블비쿤";
		System.out.println(value);
		System.out.println(name);
//밑의 클래스와 변수 이름이 같아도 문제 없는 것은 각 각의 클래스로 존재하기 때문.
		
		naemaumdaero aa = new naemaumdaero(); //변수 aa는 스택에 생성 됨. 객체를 생성하고 aa에  naemaumdaero의 저장공간이 생김. ??
		System.out.println("\n" + "naemaumdaero클래스 value의 변수 : " + aa.value); //aa의 value값을 찾아서 출력하라는 것
		System.out.println("naemaumdaero클래스 name의 변수 : " + aa.name + "\n");

		B1 bb = new B1();
		int bValue = bb.value; // ㅂㅂ의 밸류값을 가져와서 bVlaue변수에 넣어줍니당.
		String bName = bb.name;
		
		    System.out.println("b1클래스의 value의변수 : " +bValue);
			System.out.println("b1클래스의 name의변수 : " + bName);
			
	
			
	}

}

//ㅁㅔ인 메소드가 없는 것 = 라이브러리 = API = 나 혼자선 실행 할 수 없는 것.
//이 클래스 친구는 보조용입니다.
//메인 메소드가 없어서 출력문 사용도 못 해 요 옹 옹 . 왜냐면 얘 혼자는 run할 수 가 없기 ㄸㅐ문에..

class naemaumdaero {
	int value = 5252;
	String name = "사랑한다제";
	
}