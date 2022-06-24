package staticField;

public class StaticFieldTest {

	public static void main(String[] args) {
		StaticField.age = 25;
		StaticField.name = "젠이";
		System.out.println(StaticField.age);
		System.out.println(StaticField.name);
        System.out.println("~~~~~~~~~~~~~~~~~~");
	
		StaticField sf1 = new StaticField();
		StaticField sf2 = new StaticField();
		System.out.println(sf1.age);
		System.out.println(sf2.age);
        System.out.println("~~~~~~~~~~~~~~~~~~");
		
		sf1.age = 30; //sf1.age 라는 객체로 찾아가서 값을 30으로 바꾸시오... 
					  //근데 얘들은 하나의 클래스를 공동 사용해 sf2.age도 30으로 바뀜
		System.out.println(sf1.age);
		System.out.println(sf2.age);
        System.out.println("~~~~~~~~~~~~~~~~~~");
        
		sf1.month = 4;
		System.out.println(sf1.month);
		System.out.println(sf2.month);
	}

}
