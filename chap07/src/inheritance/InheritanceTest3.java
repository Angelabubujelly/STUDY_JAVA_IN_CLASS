package inheritance;
//아 너무 재밌다 ^^*
//필드의 상속...
class E {
	int e;
}

class F extends E {
	String e;
}

public class InheritanceTest3 {

public static void main(String[] args) { 
		F f1 = new F();
		f1.e ="밤뿔비";
		System.out.println(f1.e);
//		f1.e  = 10; 우선순위는 객체를 생성한 필드가 더 높아용
//      e변수의 타입은 문자열이기 때문에 에러발생
		System.out.println(f1.e);
		
		E e1 = new E();
		e1.e = 10;
	}

}
