package abstract03;

public class PhoneTest {

	public static void main(String[] args) {
		SmartPhone sp = new SmartPhone("밤블비");
		FolderPhone fp = new FolderPhone("김중경");
		
		sp.turnOn();
		sp.internetSearch();
		sp.turnOff();
	
		System.out.println("♡♡♡♡♡♡♡♡♡♡♡♡♡♡♡♡" + "\n");
		
		fp.turnOn();
		fp.camera();
		fp.turnOff();

		System.out.println("♡♡♡♡♡♡♡♡♡♡♡♡♡♡♡♡" + "\n");
				
		Phone phone = sp; //부모에 있는 method만 실행 가능
		phone.turnOff();
		phone.turnOn();
		
		System.out.println("♡♡♡♡♡♡♡♡♡♡♡♡♡♡♡♡" + "\n");

		//어렵지만 배열 잘 알면 간단하게 바루 출력할 수 있잖?
		// 하다보면 잘 할 수 있을거야~~~♡
		
		Phone phoneArr[] = new Phone [2]; 
		phoneArr[0]= new SmartPhone("리사");
		phoneArr[1]= new SmartPhone("로이");

		for(int i = 0; i<phoneArr.length; i++) {
			phoneArr[i].turnOn();
			phoneArr[i].turnOff();
		}
	
	}

}
