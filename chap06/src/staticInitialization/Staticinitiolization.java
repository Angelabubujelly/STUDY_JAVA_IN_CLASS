package staticInitialization;

	class Staticinitiolization {
	static String company = "samsung";
	static String model = "LCD";
	static String info;

	private int a = 10;
	
	//static �ʱ�ȭ �غ���! �� �Ⱦ��� ����
	// 
	static {
		info = company + "-" + model;
	
	}
}

	