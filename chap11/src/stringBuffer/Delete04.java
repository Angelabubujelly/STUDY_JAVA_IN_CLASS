package stringBuffer;

public class Delete04 {

	public static void main(String[] args) {
		// delete( ���� index, �� index ) : �� �ε����� �������� ����! 
		StringBuffer sb = new StringBuffer("0123456789");
	System.out.println(	sb.delete(3, 7));
	// deleteCharAt( index ) : index�� �ش��ϴ� ���� 1�� �����.
System.out.println(	sb.deleteCharAt(2));
	}

}
