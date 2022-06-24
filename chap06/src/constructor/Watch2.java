package constructor;

public class Watch2 {
	String kind;
	String model;
	
	Watch2(){
	//this가 붙으면 다른 생성자 호출이여, 매개변수가 1개짜리 호출,매개변수의 자료형은 String 문자열
	// 하나짜리가 한개밖에업으니까 바로 String kind 조것이 오는겨.,..
	//다른생성자 호출, 매개변수가 2개짜리 호출, 매개변수의 자료형은 둘 다 문자열	
		this("손목시계", "카시오");
	}
	Watch2(String kind) { //8의 kind값이 들어가유;
	this(kind,"카시오");
	}
	
	Watch2(String kind, String model) {
		this.kind = kind;
		this.model = model;
	}
	
}
