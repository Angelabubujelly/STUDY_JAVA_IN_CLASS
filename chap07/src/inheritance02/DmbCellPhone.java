package inheritance02;

public class DmbCellPhone extends  CellPhone {
	//필드
	int channel;
	
	//생성자!
	DmbCellPhone(String model, String color, int channel){
//인스턴스 변수가 이름이 같을 때 부모에 있는 model에 받으려면 this.를 붙여~
//만약 같은 변수가 부모에도 있어도 우선순위는 자식의 변수가 우선순위라 그걸 적용함!
// 그래서 내꺼에 있나~ 보구 부모에 있나~ 보는겨!
		
		this.model = model;
		this.color = color;
		this.channel = channel;
	}
	
	//메소드!
	void thrnOnDmb() {
		System.out.println("채널 "+ channel + "번 방송 수신을 시작합니다.");
	}
	void changeChannelDmb(int channel) {
		this.channel=channel; //<= 인스턴스 값으로 바꿔주고...
		System.out.println( channel + "번으로 채널을 바꿉니다.");
}
	void turnOffDmb() {
		System.out.println("방송 수신을 멈춥니다."+"\n");
	}
}