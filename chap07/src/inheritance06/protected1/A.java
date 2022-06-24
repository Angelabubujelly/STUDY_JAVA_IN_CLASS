package inheritance06.protected1;

public class A {
protected String a	;  //필드 하나

protected A() { //생성자 하나
	a="java";
}
protected void methodA () { //메소드 하나
	System.out.println("A클래스 methodA()," + a);
	
}

}