package abstract03;

public class FolderPhone extends Phone {

//내가 상속받은 Phone에서의 constructor의 생성자가 무조건 필요!
// super(owner);코드로 Phone의 생성자를 호출해야 해~~!

	FolderPhone(String owner) {
		super(owner);
	}
	
//method
	void internetSearch() {
		System.out.println("인터넷 검색을 합니다.");
	}
	
	void camera() {
		System.out.println("밤블비의 사진을 찍는다.");
	}

	@Override
	void turnOn() {
		System.out.println(owner +"의 핸드폰을 열어서 켬");
		
	}

	@Override
	void turnOff() {
		System.out.println(owner +"의 핸드폰을 닫아서 끔");
			
	}
	
	
	
}
