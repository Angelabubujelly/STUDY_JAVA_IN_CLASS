package inheritanceConstruc03;

public class Student extends People{
	int studentNo; //내가 객체가 생기면 부모도 객체를 생성해야함..생성자에 반드시 값을 넘겨줘야함....
	//생성자 오버로딩
	Student() {
		this("길동홍", "123456-123456",60);
		
		
		
	}Student(int studentNo) {
		this("길동홍", "123456-123456",studentNo);

		
		
	}
	Student(String name, String ssn, int studentNo) {
		super(name,ssn); // 반드시 부모의 생성자에 인자값을 전달해야만
		this.studentNo =studentNo;
	}
	

}
