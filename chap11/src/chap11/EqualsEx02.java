package chap11;
class Person {
	int id;
	Person (int id) {
		this.id = id;
	}
	@Override
	public boolean equals(Object obj) {
		if(obj != null && obj instanceof Person) {
			Person person =(Person)obj; //�ڵ� ����ȯ �� �ż� (Person)�ٿ��ذ�...
			return id == person.id; //int�� equals ȣ�� ���� ...
		} 
			return false;
		
	}
}
public class EqualsEx02 {

	public static void main(String[] args) {
	

		Person p1 = new Person (20220509);
		Person p2 = new Person (20220509);
		
		if (p1 ==p2)
			System.out.println("p1�� p2�� ���� ���");
		else 
			System.out.println("p1�� p2�� �ٸ� ���");
		
		if (p1.equals(p2))
			System.out.println("��\n"+"p1�� p2�� ���� ���"); //override�ϸ鼭 ..����..��...��...����
		else 
			System.out.println("��\n"+"p1�� p2�� �ٸ� ���");
	}

}
