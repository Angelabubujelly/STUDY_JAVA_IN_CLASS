package inheritanceConstruc03;

public class Student extends People{
	int studentNo; //���� ��ü�� ����� �θ� ��ü�� �����ؾ���..�����ڿ� �ݵ�� ���� �Ѱ������....
	//������ �����ε�
	Student() {
		this("�浿ȫ", "123456-123456",60);
		
		
		
	}Student(int studentNo) {
		this("�浿ȫ", "123456-123456",studentNo);

		
		
	}
	Student(String name, String ssn, int studentNo) {
		super(name,ssn); // �ݵ�� �θ��� �����ڿ� ���ڰ��� �����ؾ߸�
		this.studentNo =studentNo;
	}
	

}
