package chap04_1;

public class IfEx {

	public static void main(String[] args) {
		int score = 50;
		
		if(score >= 60) 
			System.out.println("����Դϴ�.");
		System.out.println("���̾���"); //if���� ��� ����.
			
		
		int score2 = 50;
			
		if(score2 >= 90) {
			System.out.println("�� ���߽��ϴ�.");
			System.out.println("���б��� �����մϴ�");
		
		System.out.println("�̾��̾߿�"); //�� if�� �����ϱ� ���ǿ� �� ������ ��� X
		
		}
	
	
		
		System.out.println("���α׷� ����"); //�� if�� �����ϱ� ��ȣ �ٱ��� �̳��� if���� ���þ��� ����.
	
	
	
	
	
	if(score >= 80) {
		System.out.println("�հ��Դϴ�.");
		System.out.println("�����մϴ�.");
	
	}
	
	if(score <80) {
		System.out.println("���հ��Դϴ�");
		System.out.println("���� ��ȸ��...");
	}
	
	
	

}
}
