package chap02_2;

public class LongEx {

	public static void main(String[] args) {
		//�ڷ����� �ּҰ��� �ִ밪 �˾ƺ���
		System.out.println("int : "+ Integer.MIN_VALUE + " ~ "+ Integer.MAX_VALUE); //I�빮�ڸ� 
		System.out.println("long : "+ Long.MIN_VALUE + " ~ "+ Long.MAX_VALUE);
		
		long var1 =	10; //�⺻���� int�� �ν�, 4byte.
		// long car2 = 12147483647; �⺻���� int������ 12147483647�� �ν���. �ִ� ũ�⺸�� Ŀ�� ���� �߻�
		long var2 = 12147483647L; // L�־��ָ� int�� �ƴ϶� Long������ �νĵǱ⿡ �ξ� ū ���� ���ư���.
		
		System.out.println(var1);
		System.out.println(var2);
		

	}

}
