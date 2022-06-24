package chap11;
import java.util.*;
class Key{
	int number;
	Key(int number) { //����ڷκ��� number ���� �ްڽ�
		this.number = number;
	}
	@Override
	public int hashCode() {
	return number;
}
	@Override
	public boolean equals(Object obj) {
		if (obj instanceof Key) {
			Key key = (Key)obj;
			if(this.number == key.number)
				return true;
		} 
		return false;
	}
}

public class Key05 {

	public static void main(String[] args) {
		HashMap<Key, String>hashmap = new HashMap<Key, String>();
		//����ڰ� ���ϴ� �ڷ����� <>�� �־�a. Key�� ��ü�� �ްڴٴ°�.
		//Key�� ��ü, String����?

		hashmap.put(new Key(1), "ȫ�浿");
		
		String value = hashmap.get(new Key(1));
		System.out.println(value);
		
	}

}
