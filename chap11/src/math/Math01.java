package math;

public class Math01 {

	public static void main(String[] args) {
		int v1 = Math.abs(-10);
		double v2 = Math.abs(-3.1415);
		System.out.println("v1 = " + v1 +"\n");
		System.out.println("v2 = "+ v2+"\n");
		
		double v3 = Math.ceil(4.213);
		double v4 = Math.floor(4.67);
		System.out.println("v3 = " + v3+"\n" );
		System.out.println("v4 = "+ v4+"\n");

		int v5 = Math.max(5,8); //배열은 비교 불가
		int v6 = Math.min(4, 8);
		System.out.println("v5 = " + v5 +"\n");
		System.out.println("v6 = "+ v6+"\n");
		
		double v7 = Math.rint(4.12);
		double v8 = Math.rint(4.89);
		System.out.println("v7 = " + v7+"\n" );
		System.out.println("v8 = "+ v8+"\n");
		
		long v9 = 	Math.round(5.78); 
		int v10 = (int)Math.round(5.78); // 리 멤 버 댓.
		int v11 = Math.round(6.45f); //f 붙여잍~~~~~~~~~~~~~~~~~~~~~~
	}
}
