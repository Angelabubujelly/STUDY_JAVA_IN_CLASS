package chap04_05;

public class Break01 {

	public static void main(String[] args) {
		
		for (int i = 1; i<=100; i++) {
			System.out.println(i);
			if(i == 50)
				break;
		}
System.out.println("�ý����� �����մϴ�.");

	for (int dan = 2; dan<=9; dan++) {
		System.out.println("��" + dan + "�� �Դϴ٢�" + "\n");
	 for (int i = 1; i<=9; i++) {
		 System.out.println(dan + " * " + i + " = " + dan*i);
		 if (i == 5)
			 break;
	 }
	 	if(dan > 6)
	 		break;
	 	System.out.println("\n");
}
	}

}
