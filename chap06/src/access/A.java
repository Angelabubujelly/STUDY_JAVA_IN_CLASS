package access;
//같은 패키지 안에서만 접근 가능
 class A {
	 
		A a1 = new A(true);
		 A a2 = new A(5);
		 A a3 = new A("문자열");
		 
	 public A(boolean b) {
		
	}
	public A(int i) {
		
	}
	public A(String string) {
	
	}
	public A() {	
	}

	
	 

}
