package polymorphism2;

public class ChildTest {

	public static void main(String[] args) {
		Child child = new Child(); //메소드2는 오버라이딩해서 즈그것만 나왕용
		 child.method1();
		 child.method2();
		 child.method3();
		 
// 부모타입으로 변환했기 떄문에 부모의 메소드만 사용할 수 있음,
// 단, 오버라이딩 된 것은 자식것이 호출됨.
//즉 자식의 객체 생성 뒤 부모타입으로 형변환. 부모것만 사용 가능. 
//하지만 override한 것은 자식의 것을 사용
		 Parent parent = new Child(); 
		 parent.method1();
		 parent.method2();
//parent.metho3();이 안 뜨는 것은
//형변환을 부모타입으로 해서 자식에 있는거라....

	}

}
