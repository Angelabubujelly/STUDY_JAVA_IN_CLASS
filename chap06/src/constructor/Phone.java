package constructor;

public class Phone {
	String company;
	String model;
	int money;
	double ver;
	
	//������= Ŭ�����̸�
	
	Phone (){ //�����ڿ��� �� ���� 4���� ȣ�� �� �� this()�ϴ°�.
 			  //������ ù�ٿ� �Է�.
		this("�Ｚ", "������s 22", 130, 22.02);
		// �ǹ��� �����ڸ� ȣ���� �� ó���� string~double�� ���� �־���??
	}
	Phone (String company){
		this(company, "������s 22", 130, 22.02);
		
	}
	Phone (int money){
		this("�Ｚ", "������s 22", money, 22.02);
	}
	Phone (double ver){
		this("�Ｚ", "������s 22", 130, ver);
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
		
	System.out.println("Phone (company, model, money, ver) ������ ȣ��");
	}
}
