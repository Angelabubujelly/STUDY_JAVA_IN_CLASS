package constructor;

public class Watch {
	String kind;
	String model;
	
	Watch(){
		kind="손목시계";
		model="카시오";
	}
	Watch(String kind) {
		this.kind =kind;
		model = "카시오";
	}
	
	Watch(String kind, String model) {
		this.kind = kind;
		this.model = model;
	}
	
}
