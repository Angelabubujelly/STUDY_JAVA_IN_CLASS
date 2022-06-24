package chap04_05;

public class Exercise04_Ans {

	public static void main(String[] args) {
		
		while(true) {
	
			int num1 = (int)(Math.random() *6)+1;
			int num2 = (int)(Math.random()*6)+1;
			System.out.println("(" + num1 + "), ("  + num2 + ")");

			if (num1+num2 == 5)
				break;

}
		System.out.println("------------------");
		//ex2)
		int num1 =0, num2=0;
		while(num1 + num2 != 5) {
			
			num1 = (int)(Math.random() *6)+1;
			num2 = (int)(Math.random()*6)+1;
			System.out.println("(" + num1 + "), ("  + num2 + ")");
			
		}

	}

}
