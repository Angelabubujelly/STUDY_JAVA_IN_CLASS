package chap10;

public class ArrayIndexOutOfBoundsException02 {
	public static void main (String []args	 ) {
////�迭�� �ƹ��� ���� ���µ� �� ���� ������ϱ� �ͼ����� �����°���.
//		
//		String data1 = args[0];
//		String data2 = args[1];
//		//�迭 ���� 2�� �̻��� ���� ������??
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
		System.out.println("[���� ���]");
		System.out.println("2���� ���ڰ��� �ݵ�� ��������");
		System.out.println("java ArrayIndexOutOfBoundsExceptionExample ");
	System.out.println("��1 ��2");
	}
		
	}

}
