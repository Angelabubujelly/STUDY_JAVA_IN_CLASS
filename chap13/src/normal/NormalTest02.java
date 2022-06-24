package normal;

class Tv1 {
	
}

class Computer1{
	
}
class Audio1 {
	
}
class Product<T,M>{
	
	private T kind; //T,M엔 접근 할 수 없으니 setter getter 사용하기 .. Sorce에서 getter&stter...
	private M model;
	
	public T getKind() {
		return kind;
	}
	public void setKind(T kind) {
		this.kind = kind;
	}
	public M getModel() {
		return model;
	}
	public void setModel(M model) {
		this.model = model;
	}
}

public class NormalTest02 {

	public static void main(String[] args) {
		Product<Tv1,String> p1 = new Product<Tv1, String>(); //후자의 <>는 비워둬도 되나봄
		p1.setKind(new Tv1()); //Tv1를 객체생성해서 넣어주기 = Tv1()
		p1.setModel("스마트 Tv1");

System.out.println(p1.getModel());
		
		Product<Computer1, String> p2 = new Product<>();
		p2.setKind(new Computer1());
		p2.setModel("펜티엄 22");

		System.out.println(p2.getModel());
		
		Product<Audio1, String> p3 = new Product<>();
	

	}

}
