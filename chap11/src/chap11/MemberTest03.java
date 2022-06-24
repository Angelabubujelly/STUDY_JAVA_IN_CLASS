package chap11;


	class Member{
	String id; //String�� �������̰� �̸� ���ǵǾ�����. �� ���� ���� ���ϴ°�.
				// int�� �׷� �� ����
	 Member(String id) {
		this.id = id;
	}
	 @Override
		public boolean equals(Object obj) {
			if(obj instanceof Member) {
				Member member = (Member)obj; //����ȯ �����ָ� null?????
				//String�� ��� �������̵� �� equals ��  ȣ��~ ��
				if(id.equals(member.id)) 
					return true;
			}
			return false;
		}
}
public class MemberTest03 {
	public static void main(String[] args) {
		Member mem1 = new Member("12345"); //���� ���Ƶ� �ּҰ� �ٸ��� �ٸ� ��ü
		Member mem2 = new Member("12345");
		Member mem3 = new Member("67891");
	
		System.out.println(mem1);
		
		if(mem1.equals(mem2))
			System.out.println("mem1�� mem2�� ���� ��ü"+ "\n");
		else
			System.out.println("mem1�� mem2�� �ٸ� ��ü" + "\n");
	
		if(mem2.equals(mem3))
			System.out.println("mem2�� mem3�� ���� ��ü");
		else
			System.out.println("mem2�� mem3�� �ٸ� ��ü");
		
		String str = new String("java"); 
		String str2 = new String("java");
		
		System.out.println(str == str2); //���� �ּ�(�ؽ��ڵ�??)�� ����Ű�°�???
		System.out.println(str.equals(str2)); //��ü�� ����ִ� ���� �������� �������̵�???
		//String �� �������� ���� Ŭ�����̰� �ű⿡ override�Ǿ��ִ°Ŷ��??
	
	}

}
