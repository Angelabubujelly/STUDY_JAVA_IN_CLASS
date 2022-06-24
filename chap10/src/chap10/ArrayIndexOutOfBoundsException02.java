package chap10;

public class ArrayIndexOutOfBoundsException02 {
	public static void main (String []args	 ) {
////배열에 아무런 값이 없는데 각 값을 내오라니까 익셉션이 나오는것임.
//		
//		String data1 = args[0];
//		String data2 = args[1];
//		//배열 값엔 2개 이상의 값이 들어가야함??
//		
//		System.out.println("args[0] =" + args[0]);
//		System.out.println("args[1]="+ args[1]); 
//		
		
		if(args.length >= 2) {
		String data1 = args[0];
		String data2 = args[1];
		
		System.out.println("args[0] =" + args[0]);
		System.out.println("args[1]="+ args[1]); 
	} else {
		System.out.println("[실행 방법]");
		System.out.println("2개의 인자값을 반드시 넣으세용");
		System.out.println("java ArrayIndexOutOfBoundsExceptionExample ");
	System.out.println("값1 값2");
	}
		
	}

}
