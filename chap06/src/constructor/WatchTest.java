package constructor;

public class WatchTest {

	public static void main(String[] args) {
		Watch w1 = new Watch(); //�ƹ��͵� �� ������ ��ü�� �����ϴ°ſ���. null null��
		System.out.println("w1");
		System.out.println("����: "+w1.kind + ", ��: "+ w1.model);
		
		Watch w2 = new Watch("���ð�");
		System.out.println("����: "+w2.kind + ", ��: "+ w2.model);
		
		Watch w3 = new Watch("Ź��ð�", "Ƽ��");
		System.out.println("����: "+ w3.kind + ", ��: "+ w3.model);

		Watch2 w2_1 = new Watch2("���ð�");
		System.out.println(w2_1.kind+ "," +                w2_1.model);
		
		Watch2 w2_2 = new Watch2("���νð�", "����");
		System.out.println(w2_2.kind + "," + w2_2.model);
	
	}

}
