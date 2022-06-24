package tv;

public class Tv01 {
	/*TV의 속성 : 색상, 전원상ㅌㅐ, 채널,볼륨
	 *
	 * 
	 * */
	String color = "은색	";//얜 안 넣으면 null이라 색상 넣었음당/.
	boolean power; //(off는 기본값인false)
	int channel; //도 입력 안하묜 0이니꽈 그냥 선언만...
	int vol; //도 입력 안하면 0임...
	
	// 메서드 : 전원을 키거나 끄기, 채널을 올리거나 내리는 것, 볼륨 내리거나 올리는 것
	//void는 호출만 하구ㅡ,,,  ,,,응,.,,,
	void power () { //한번 호출할때마다 켰껐되는..
		power = !power;
	}
	
	void channelUp () {
	channel ++;
	
	}
	void channelDown () {
		channel --;
	}
	void volUp() {
		vol++;
	}
	void volDown() {
		vol--;
	}
}
