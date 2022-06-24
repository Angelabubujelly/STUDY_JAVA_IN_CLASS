package inheritanceSuper05;

class Parent {
	int x =10; //field 하나 줘써용

}


class Child extends Parent {
	int x = 200;
	
	void method() {
		int x = 3000;  //암것도 안 붙으면 지역변수
		System.out.println("x=" + x);
	System.out.println("this.x="+this.x); //내 인스턴스 변수를 출력하시오
	System.out.println("super.x="+super.x);//부모의 인스턴스변수 ???? x를 출력하시오?
	}
}



public class SuperTest {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Child child = new Child();
		child.method();

	}

}
