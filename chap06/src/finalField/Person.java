package finalField;

public class Person {
	// �ν��Ͻ� ��� : ó���� ���� �ԷµǸ� ���̻� ������ �� ����
	final String NATION = "Korea";
	final String SSN;
	
	//�ν��Ͻ� ���� : �󸶵��� �� ���� possible
	String name;
	
	Person(String ssn, String name)/*�̶�� ������ ����*/ {
		SSN =ssn; //����ڰ� ���� ���� �����Ű�.. ssn��������...
		this.name = name; //���������� �����ž�..
		
	}
}
