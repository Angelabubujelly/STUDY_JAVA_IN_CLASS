package chap04_2;

public class Switchcase02 {

	public static void main(String[] args) {
        String str = "����";
        
         switch(str) {
         case "���":
        	 System.out.println("����� ��ǥ �̳��Դϴ�.");
        	 break;
         case "����":
        	 System.out.println("�ð� �θ���Դϴ�.");
        	 break;
         case "����":
        	 System.out.println("�ٸ����� ���̵��Դϴ�.");
        	 break;
        	 default:
        		 System.out.println("�𸣴� ���Դϴ�.");
         }
         
         char ch = '��'; //1���� �̻��̸� ������ ��Ʈ�� . �ѱ����϶��� ������ ' ��.
         switch(ch) {
         case '��':
        	 System.out.println("���� ���Ӵϴ�.");
        	 break;
         case '��':
        	 System.out.println("������Դϴ�.");
        	 break;
         case '��':
        	 System.out.println("������ �� �������Դϴ�.");
        	 break;
        	 default:
        		 System.out.println("�׷������������Դϴ�.");
         }

	}

}
