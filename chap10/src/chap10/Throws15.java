package chap10;

public class Throws15 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
		findClass();
	}catch (ClassNotFoundException e) {
//		e.printStackTrace();
		System.out.println("Ŭ������ �������� �ʽ��ϴ�.");
	}
	}
public static void findClass() throws ClassNotFoundException{

			Class clazz = Class.forName("chap10.TryCatch04");
			System.out.println(clazz);
		} 
		
		
			

}
