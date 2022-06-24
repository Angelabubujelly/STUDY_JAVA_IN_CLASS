package inheritanceConstruc03;

public class StudentTest {

	public static void main(String[] args) {
		Student s1 = new Student();
		System.out.println("이름: " +s1.name);
		System.out.println("주민번호: "+s1.ssn);
		System.out.println("학번: " +s1.studentNo+"\n");
		
		Student s2 = new Student("이젠","525252-525252", 12345);
		System.out.println("이름: " +s2.name);
		System.out.println("주민번호: "+s2.ssn);
		System.out.println("학번: " +s2.studentNo);
	
	}

}
