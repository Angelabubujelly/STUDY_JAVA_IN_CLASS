package inheritanceConstruc03;

public class Teacher extends People{
	int teacherNo;
	Teacher(){
		//�θ������ ȣ��
		super("ȫ�浿","1234");//name�� ssn�� �־��� ���� �־�a
	}
	
	void show() {
		System.out.println("Teacher ��ü");
		
	}
}
