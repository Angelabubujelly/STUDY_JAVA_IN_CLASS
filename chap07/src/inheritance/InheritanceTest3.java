package inheritance;
//�� �ʹ� ��մ� ^^*
//�ʵ��� ���...
class E {
	int e;
}

class F extends E {
	String e;
}

public class InheritanceTest3 {

public static void main(String[] args) { 
		F f1 = new F();
		f1.e ="��Ժ�";
		System.out.println(f1.e);
//		f1.e  = 10; �켱������ ��ü�� ������ �ʵ尡 �� ���ƿ�
//      e������ Ÿ���� ���ڿ��̱� ������ �����߻�
		System.out.println(f1.e);
		
		E e1 = new E();
		e1.e = 10;
	}

}
