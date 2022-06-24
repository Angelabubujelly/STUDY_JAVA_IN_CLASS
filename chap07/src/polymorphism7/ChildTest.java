package polymorphism7;

 class Parent {
	String field1;
	
	void method1() {
		System.out.println("Parent-method1()");
	}
	void method2() {
		System.out.println("Parent-method2()");
	}
}

class Child extends Parent{
	String field2;
	
	void method3() {
		System.out.println("Parent-method2()");
	}
	
}

public class ChildTest {
	public static void main (String []	args	) {
		Child child = new Child();
		//자식객체를 만들면 부모 객체도같이 만들어짐. 만들어만 놓고 부모타입만 사용하도록~!
		Parent parent = new Child();
		// 부모타입으로 형변환 했기 때문에 부모에 있는 필드와 메소드만 사용가능
		parent.field1 = "부모";
		parent.method1(); 
		child.method3();
		
		//처음부터 부모로 객체를 생성했기 때문에 자식객체는 아예 만들어지지도 않 았 읍 니 다 만? 에러 납니다만.
//		Child child3 = new Parent(); ☜ 부모를 자식으로 바로 변환 할 수 없당
		
//		Parent p = new Parent();
//		Child child3 = (Child)p;
		
		//처음 객체를 자식개체로 만들어서 부모객체만 사용하다가 자식 객체도 사용하도록 변경
		Child child2 = (Child)parent;
		child2.field1 = "부모필드";
		child2.field2 = "자식필드";
		child2.method1(); // "부모 메소드"  ☜ 이거이 바루 강제 형변환 "Casting"
		child2.method3();//  "자식메소드"
		
		Parent parentA = new Child();
		if(parentA instanceof Child) {
			Child child4 = (Child)parentA;
			System.out.println("casting 변환 성공 ㄱ-");
		} else {
			System.out.println("casting 할 수 없음ㅎ0ㅎ");
		}
		
		Parent parentB = new Parent();
//		Child child4 = (Child)parentB;
		if (parentB instanceof Child) {
			Child child5 = (Child)parentB;
			System.out.println("casting 변환 성공 -.,-");
		}else {
			System.out.println("casting 할 수 없음 >ㅁ<~♥");
		}
	}
	
}