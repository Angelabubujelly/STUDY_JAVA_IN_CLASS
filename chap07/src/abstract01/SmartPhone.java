package abstract01;

public class SmartPhone extends Phone {

//내가 상속받은 Phone에서의 constructor의 생성자가 무조건 필요!
// super(owner);코드로 Phone의 생성자를 호출해야 해~~!

	SmartPhone(String owner) {
		super(owner);
	}
	
//method
	void internetSearch() {
		System.out.println("인터넷 검색을 합니다.");
	}
	
	
}
