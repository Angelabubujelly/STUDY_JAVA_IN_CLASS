package stringBuffer;

public class Delete04 {

	public static void main(String[] args) {
		// delete( 시작 index, 끝 index ) : 끝 인덱스는 포함하지 않음! 
		StringBuffer sb = new StringBuffer("0123456789");
	System.out.println(	sb.delete(3, 7));
	// deleteCharAt( index ) : index에 해당하는 글자 1개 지우기.
System.out.println(	sb.deleteCharAt(2));
	}

}
