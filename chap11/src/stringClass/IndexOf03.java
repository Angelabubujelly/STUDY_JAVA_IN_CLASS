package stringClass;

public class IndexOf03 {

	public static void main(String[] args) {
		String str = "자바 프로그램";
		//단어가 있는곳의 시작인 index번호 변환
		int index = str.indexOf("로그"); //index번호가 반환되기 때문에 반환형이 int임♥ indexOf 이거 다 오버로딩 되어있는거여!!!
		System.out.println(index); //빈칸도 index 번호 1개씩 차지해염 
		
		if (str.indexOf("도치") != -1)
		System.out.println("도치 책 입니다.");
		else
			System.out.println("도치와 관련없는 책입니다.");
		

	}

}
