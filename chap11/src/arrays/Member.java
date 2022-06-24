package arrays;

public class Member implements Comparable<Member>{
	String name;
	Member(String name) {
		this.name = name; 
	}
	@Override 
	public int compareTo(Member o) { //구현하지 않은 메소드  추가해놔야함.,.. Member 객체 주소가 o로 들어감...
		
		return name.compareTo(o.name); //객체의 이름과 같은지 비교한 뒤 리턴 해줌.....
	}
	
}
