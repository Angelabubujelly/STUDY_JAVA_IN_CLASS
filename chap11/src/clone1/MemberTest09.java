package clone1;

public class MemberTest09 {

	public static void main(String[] args) {
		Member oriMem = new Member("hong12", "ȫ�浿", "1234", 28, true);
		Member cloned = oriMem.getMember();
		
		System.out.println("[������ü �ʵ尪]");
		System.out.println("id = " + oriMem.id);
		System.out.println("name = " + oriMem.name);
		System.out.println("password = " + oriMem.password);
		System.out.println("age = " + oriMem.age);
		System.out.println("adult = " + oriMem.adult);
		System.out.println("����������������������������");
		System.out.println("[������ü �ʵ尪]");
		System.out.println("id = " + cloned.id);
		System.out.println("name = " + cloned.name);
		System.out.println("password = " + cloned.password);
		System.out.println("age = " + cloned.age);
		System.out.println("adult = " + cloned.adult);
		System.out.println("\n"+"��������������");
		
		cloned.age = 35;
		cloned.name = "����";
		
		System.out.println("\n"+"[������ü �ʵ尪]");
		System.out.println("id = " + oriMem.id);
		System.out.println("name = " + oriMem.name);
		
		System.out.println("password = " + oriMem.password);
		System.out.println("age = " + oriMem.age);
		System.out.println("adult = " + oriMem.adult);
		System.out.println("����������������������������");
		System.out.println("[������ü �ʵ尪]");
		System.out.println("id = " + cloned.id);
		System.out.println("name = " + cloned.name);
		System.out.println("password = " + cloned.password);
		System.out.println("age = " + cloned.age);
		System.out.println("adult = " + cloned.adult);
		
	
	}

}
