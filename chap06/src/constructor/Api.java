package constructor;

public class Api {

	String name;
	String num;
	int age;
	
	Api () {
		//반드시 첫줄!
		this ("김연경","010-9999-9999",35);
	}
	
	Api (int age){
		this("김연경","010-9999-9999",age);
	}
	
	Api(String name, int age) {
		this(name,"010-9999-9999", age);
	}
	
	Api(String name, String num, int age) {
		//사용자가 값을 넣었다는 말이에용
		this.name=name;
		this.num=num;
		this.age=age;
	}
}
