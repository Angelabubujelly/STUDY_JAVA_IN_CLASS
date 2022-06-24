package accessModifier;

public class A {
	A a1 = new A(true);
	A a2 = new A(5	);
	A a3 = new A("¹®ÀÚ¿­");
	 
	public A(boolean b) {}
	A(int b) { }
	private A (String s) { }
}
