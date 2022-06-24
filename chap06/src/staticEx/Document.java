package staticEx;

public class Document {
	//1,2,3은 스테틱에 붙어야해. 그래야 어디서든 1,2,3이 붙지.
	
	static int count; //제목없음1,2, 요거..초기값 0으로 선언되징
	String name; //문서이름
	
	Document() {
		this("제목없음" + ++count);
	}
	Document(String name){ //얘는 사용자가 넣은 제목을 name에다 넣어쥬는
		this.name = name;
		System.out.println("문서 " + this.name +"이(가) 생성됐습니다.");
	}

}
