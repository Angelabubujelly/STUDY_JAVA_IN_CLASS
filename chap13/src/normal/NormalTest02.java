package normal;

class Tv1 {
	
}

class Computer1{
	
}
class Audio1 {
	
}
class Product<T,M>{
	
	private T kind; //T,M�� ���� �� �� ������ setter getter ����ϱ� .. Sorce���� getter&stter...
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
		Product<Tv1,String> p1 = new Product<Tv1, String>(); //������ <>�� ����ֵ� �ǳ���
		p1.setKind(new Tv1()); //Tv1�� ��ü�����ؼ� �־��ֱ� = Tv1()
		p1.setModel("����Ʈ Tv1");

System.out.println(p1.getModel());
		
		Product<Computer1, String> p2 = new Product<>();
		p2.setKind(new Computer1());
		p2.setModel("��Ƽ�� 22");

		System.out.println(p2.getModel());
		
		Product<Audio1, String> p3 = new Product<>();
	

	}

}
