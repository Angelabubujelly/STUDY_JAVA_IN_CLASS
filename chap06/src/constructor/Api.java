package constructor;

public class Api {

	String name;
	String num;
	int age;
	
	Api () {
		//�ݵ�� ù��!
		this ("�迬��","010-9999-9999",35);
	}
	
	Api (int age){
		this("�迬��","010-9999-9999",age);
	}
	
	Api(String name, int age) {
		this(name,"010-9999-9999", age);
	}
	
	Api(String name, String num, int age) {
		//����ڰ� ���� �־��ٴ� ���̿���
		this.name=name;
		this.num=num;
		this.age=age;
	}
}
