package chap04_05;

public class NameOuter03 {

	public static void main(String[] args) {
		
	kim:for (int dan = 2; dan<=9; dan++) /*for���� �̸��� kim*/{
			System.out.println("��" + dan + "�� �Դϴ٢�" + "\n");
			 for (int i = 1; i<=9; i++) {
				 System.out.println(dan + " * " + i + " = " + dan*i);
				 if(i==5)
					 break kim;
			 }
			 System.out.println("���� for�� ����\n");
		}
System.out.println("�ٱ� for�� <kim>for�� ����");



outter:for (int dan = 2; dan<=9; dan++) /*for���� �̸��� kim*/{
	 mid:for (int i = 1; i<=9; i++) {
		 for (int z = 1; z<=5; z++) {
			 System.out.println(dan + "," + i + ", " + z);
			if(z==3)
				break outter;
		 }
		 System.out.println("���� for�� ����");
	 }
	 System.out.println("�߾� for�� ����\n");
}
System.out.println("�ٱ� for�� <kim>for�� ����");
	}

}
