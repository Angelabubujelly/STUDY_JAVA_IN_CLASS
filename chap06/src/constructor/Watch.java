package constructor;

public class Watch {
	String kind;
	String model;
	
	Watch(){
		kind="�ո�ð�";
		model="ī�ÿ�";
	}
	Watch(String kind) {
		this.kind =kind;
		model = "ī�ÿ�";
	}
	
	Watch(String kind, String model) {
		this.kind = kind;
		this.model = model;
	}
	
}
