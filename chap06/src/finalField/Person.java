package finalField;

public class Person {
	// 인스턴스 상수 : 처음에 값이 입력되면 더이상 변경할 수 없음
	final String NATION = "Korea";
	final String SSN;
	
	//인스턴스 변수 : 얼마든지 값 변경 possible
	String name;
	
	Person(String ssn, String name)/*이라는 생성자 만듦*/ {
		SSN =ssn; //사용자가 넣은 값을 넣을거고.. ssn지역변수...
		this.name = name; //지역변수를 넣을거야..
		
	}
}
