package staticField;

public class StaticFieldTest {

	public static void main(String[] args) {
		StaticField.age = 25;
		StaticField.name = "����";
		System.out.println(StaticField.age);
		System.out.println(StaticField.name);
        System.out.println("~~~~~~~~~~~~~~~~~~");
	
		StaticField sf1 = new StaticField();
		StaticField sf2 = new StaticField();
		System.out.println(sf1.age);
		System.out.println(sf2.age);
        System.out.println("~~~~~~~~~~~~~~~~~~");
		
		sf1.age = 30; //sf1.age ��� ��ü�� ã�ư��� ���� 30���� �ٲٽÿ�... 
					  //�ٵ� ����� �ϳ��� Ŭ������ ���� ����� sf2.age�� 30���� �ٲ�
		System.out.println(sf1.age);
		System.out.println(sf2.age);
        System.out.println("~~~~~~~~~~~~~~~~~~");
        
		sf1.month = 4;
		System.out.println(sf1.month);
		System.out.println(sf2.month);
	}

}
