package chap05_1;

public class Array08 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		if(args.length < 2) /*if(args.length != 2)*/{
			System.out.println("���α׷� ���� :");
			System.out.println("run Arguments�� 2���� ���ڸ� �Է��Ͻÿ�.");
			System.exit(0);
		}

		for (int i = 0; i<args.length; i++) {
			System.out.println(args[i]);
		}
//sting(�ּ�) ->�����ڷ���, int(��)	 -> �⺻�ڷ���
		int num1 =Integer.parseInt(args[0]); /*Ŭ�����̸�.�޼ҵ��̸� ��,... args��int�� ��ȯ..*/
		int num2 =Integer.parseInt(args[1]);
		
		System.out.println("�� ���� �� = "+ num1*num2);
	}

}
