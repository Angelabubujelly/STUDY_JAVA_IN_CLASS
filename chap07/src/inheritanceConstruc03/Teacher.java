package inheritanceConstruc03;

public class Teacher extends People{
	int teacherNo;
	Teacher(){
		//부모생성자 호출
		super("홍길동","1234");//name과 ssn에 넣어줄 값을 넣어줭
	}
	
	void show() {
		System.out.println("Teacher 객체");
		
	}
}
