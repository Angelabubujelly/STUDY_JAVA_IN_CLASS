package test;

public class LI {

	public static void main(String[] args) {
		int day[] = new int[31];
		System.out.println(":-----");
		
		for(int i=0; i<31;i++	 ) {
			day[i]	= i+1;
			System.out.printf("%2d\t", day[i]);
			if(day[i]%7 ==0)
				System.out.println();
			
		}
	}

}
