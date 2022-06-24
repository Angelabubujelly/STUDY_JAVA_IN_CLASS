package clone2;

public class Member  implements Cloneable {
	String name;
	int age;
	int[]scores; //참조형
	Car car;  	//참조형
	
	public Member (String name, int age, int[] scores, Car car) {
		this.age = age;
		this.scores =scores;
		this.car =car;
	}
	Member getMember() {
		Member cloned = null;
		try {
		cloned = (Member) clone();
	} catch (CloneNotSupportedException e) {
		e.printStackTrace();
	}
return cloned;
	}
}
