package constructor;

public class Phone {
	String company;
	String model;
	int money;
	double ver;
	
	//생성자= 클래스이름
	
	Phone (){ //생성자에서 맨 밑의 4개를 호출 할 때 this()하는겨.
 			  //무조건 첫줄에 입력.
		this("삼성", "갤럭시s 22", 130, 22.02);
		// 맨밑의 생성자를 호출한 뒤 처음의 string~double에 값을 넣어줌??
	}
	Phone (String company){
		this(company, "갤럭시s 22", 130, 22.02);
		
	}
	Phone (int money){
		this("삼성", "갤럭시s 22", money, 22.02);
	}
	Phone (double ver){
		this("삼성", "갤럭시s 22", 130, ver);
	}
	Phone (String company, String model){
		
		this(company, model, 130, 22.02);
	}
	Phone (String company, String model, int money){
		this(company, model, money, 22.02);
	}
	Phone (String company, String model, int money, double ver){
		this.company =company;
		this.model = model;
		this.money = money;
		this.ver = ver;
		
	System.out.println("Phone (company, model, money, ver) 생성자 호출");
	}
}
