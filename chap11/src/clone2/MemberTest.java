package clone2;

import java.util.Arrays;

public class MemberTest {

	public static void main(String[] args) {
		int[] score = {87,68,98};
		Member oriMem = new Member ("홍길동", 25 , score, new Car("벤츠"));
		Member cloned = oriMem.getMember();
		
		System.out.println("[원본객체 필드값]");
		System.out.println("name = " + oriMem.name);
		System.out.println("age = " + oriMem.age);
		System.out.print("score = " );
		System.out.println(Arrays.toString(oriMem.scores));
		System.out.println("car = " + oriMem.car.model);
		System.out.println("♡♡♡♡♡♡♡♡♡♡♡♡♡♡");
		
		System.out.println("[복제객체 필드값]");
		System.out.println("name = " + cloned.name);
		System.out.println("age = " + cloned.age);
		System.out.print("score = " );
		System.out.println(Arrays.toString(cloned.scores));
		System.out.println("car = " + cloned.car.model);
		System.out.println("♡♡♡♡♡♡♡♡♡♡♡♡♡♡");
		
		cloned.name = "아무개";
		cloned.scores[2] = 100;
		cloned.car.model = "그랜저";
		
		System.out.println("[원본객체 필드값]");
		System.out.println("name = " + oriMem.name);
		System.out.println("age = " + oriMem.age);
		System.out.print("score = " );
		System.out.println(Arrays.toString(oriMem.scores));
		System.out.println("car = " + oriMem.car.model);
		System.out.println("♡♡♡♡♡♡♡♡♡♡♡♡♡♡");
		
		System.out.println("[복제객체 필드값]");
		System.out.println("name = " + cloned.name);
		System.out.println("age = " + cloned.age);
		System.out.print("score = " );
		System.out.println(Arrays.toString(cloned.scores));
		System.out.println("car = " + cloned.car.model);
		System.out.println("♡♡♡♡♡♡♡♡♡♡♡♡♡♡");

		

	}

}
