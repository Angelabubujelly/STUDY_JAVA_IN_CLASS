package staticInitialization;

	class Staticinitiolization {
	static String company = "samsung";
	static String model = "LCD";
	static String info;

	private int a = 10;
	
	//static 초기화 해보깅! 잘 안쓴대 ㅋㅋ
	// 
	static {
		info = company + "-" + model;
	
	}
}

	