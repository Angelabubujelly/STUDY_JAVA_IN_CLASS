package clone2;

import java.util.Arrays;

public class MemberTest {

	public static void main(String[] args) {
		int[] score = {87,68,98};
		Member oriMem = new Member ("ȫ�浿", 25 , score, new Car("����"));
		Member cloned = oriMem.getMember();
		
		System.out.println("[������ü �ʵ尪]");
		System.out.println("name = " + oriMem.name);
		System.out.println("age = " + oriMem.age);
		System.out.print("score = " );
		System.out.println(Arrays.toString(oriMem.scores));
		System.out.println("car = " + oriMem.car.model);
		System.out.println("����������������������������");
		
		System.out.println("[������ü �ʵ尪]");
		System.out.println("name = " + cloned.name);
		System.out.println("age = " + cloned.age);
		System.out.print("score = " );
		System.out.println(Arrays.toString(cloned.scores));
		System.out.println("car = " + cloned.car.model);
		System.out.println("����������������������������");
		
		cloned.name = "�ƹ���";
		cloned.scores[2] = 100;
		cloned.car.model = "�׷���";
		
		System.out.println("[������ü �ʵ尪]");
		System.out.println("name = " + oriMem.name);
		System.out.println("age = " + oriMem.age);
		System.out.print("score = " );
		System.out.println(Arrays.toString(oriMem.scores));
		System.out.println("car = " + oriMem.car.model);
		System.out.println("����������������������������");
		
		System.out.println("[������ü �ʵ尪]");
		System.out.println("name = " + cloned.name);
		System.out.println("age = " + cloned.age);
		System.out.print("score = " );
		System.out.println(Arrays.toString(cloned.scores));
		System.out.println("car = " + cloned.car.model);
		System.out.println("����������������������������");

		

	}

}
