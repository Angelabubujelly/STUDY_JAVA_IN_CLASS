package chap11;

class SmartPhone	{
	private String company;
	private String os;
	
	SmartPhone(String company, String os){
		this.company =company;
		this.os=os;
		
	}
	
	@Override
	public String toString() {
	
		return company + ":" + os;
	}
}

public class SmartPhonEx07 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
SmartPhone sp = new SmartPhone("����", "�ȵ���̵�");
	System.out.println(sp); //override �� �ؼ� �ؽ��ڵ��� chap11.SmartPhone@4926097b ���
	
	//@Override �ϴϲ� return ������ �� ����..
	
	
	
	}

}
