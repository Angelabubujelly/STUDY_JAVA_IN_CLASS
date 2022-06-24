package chap11;
class Person {
	int id;
	Person (int id) {
		this.id = id;
	}
	@Override
	public boolean equals(Object obj) {
		if(obj != null && obj instanceof Person) {
			Person person =(Person)obj; //자동 형변환 안 돼서 (Person)붙여준겨...
			return id == person.id; //int는 equals 호출 ㄴㄴ ...
		} 
			return false;
		
	}
}
public class EqualsEx02 {

	public static void main(String[] args) {
	

		Person p1 = new Person (20220509);
		Person p2 = new Person (20220509);
		
		if (p1 ==p2)
			System.out.println("p1과 p2는 같은 사람");
		else 
			System.out.println("p1과 p2는 다른 사람");
		
		if (p1.equals(p2))
			System.out.println("♥\n"+"p1과 p2는 같은 사람"); //override하면서 ..같은..ㄱ...ㅇ...뫄뫄
		else 
			System.out.println("♥\n"+"p1과 p2는 다른 사람");
	}

}
