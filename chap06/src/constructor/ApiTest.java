package constructor;

public class ApiTest {

	public static void main(String[] args) {
		//적을때 굳이 순서 안 지켜도 돼용~~~! ㄴ
		
		Api a1 = new Api();
		Api a2 = new Api(29);
		Api a3 = new Api("김중경",28);
		Api a4 = new Api("밤블비","010-8888-8888",2);
		
		System.out.println("이름: " + a1.name + ", 전화번호 : " +
		a1.num + ", 나이 : " + a1.age);
		System.out.println("이름: " + a2.name + ", 전화번호 : " +
		a2.num + ", 나이 : " + a2.age);
		System.out.println("이름: " + a3.name + ", 전화번호 : " +
				a3.num + ", 나이 : " + a3.age);
		System.out.println("이름: " + a4.name + ", 전화번호 : " +
				a4.num + ", 나이 : " + a4.age);

	}

}
