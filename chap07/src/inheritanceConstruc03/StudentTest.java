package inheritanceConstruc03;

public class StudentTest {

	public static void main(String[] args) {
		Student s1 = new Student();
		System.out.println("�̸�: " +s1.name);
		System.out.println("�ֹι�ȣ: "+s1.ssn);
		System.out.println("�й�: " +s1.studentNo+"\n");
		
		Student s2 = new Student("����","525252-525252", 12345);
		System.out.println("�̸�: " +s2.name);
		System.out.println("�ֹι�ȣ: "+s2.ssn);
		System.out.println("�й�: " +s2.studentNo);
	
	}

}
