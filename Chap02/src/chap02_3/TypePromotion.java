package chap02_3;

public class TypePromotion {

	public static void main(String[] args) {
		// ���� ũ�⸦ ū ũ�⿡ �ִ� ���� �ڵ� �� ��ȯ
		
		byte by1 = 13;				 //1byte
		short sh1 = by1;			 //2byte
		int i1 = sh1;				 //4byte
		long lo1 = i1; //��ü�� int���̱� ������, l �Ⱥٿ��� �ȴ�,,,�� �ϳ׿�,,,			//8byte
		float fo1 = lo1; //��ü�� long ���̱� ������,, ������ ��,,,���ٱ�,,�ϳ׿�,,,		//4byte
		double dou1 = fo1;														//8byte

		
		System.out.println(sh1);
		System.out.println(i1);
		System.out.println(lo1);
		System.out.println(fo1); //float �� dou�� �Ǽ����̶� .0�� �ٴ´�.
		System.out.println(dou1);
		System.out.println("---------����������");
		
		char ch1 = '��';
		int i2 = ch1;
		
		System.out.println(i2); //unicode�� ���ڷ� ���Ϳ��
		System.out.println(ch1);
	}

}
