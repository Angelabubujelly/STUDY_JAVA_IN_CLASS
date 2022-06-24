package tv;

public class Tv02 {
	/*TV의 속성 : 색상, 전원상ㅌㅐ, 채널,볼륨
	 *
	 * 
	 * */
	String color = "은색	";//얜 안 넣으면 null이라 색상 넣었음당/.
	boolean power; //(off는 기본값인false)
	int channel; //도 입력 안하묜 0이니꽈 그냥 선언만...
	int volume; //도 입력 안하면 0임...
	
	// 메서드 : 전원을 키거나 끄기, 채널을 올리거나 내리는 것, 볼륨 내리거나 올리는 것
	//void는 호출만 하구ㅡ,,,  ,,,응,.,,,
	void power () { //한번 호출할때마다 켰껐되는..
		power = !power;
		if (power == true) {
			System.out.println("TV를 켰습니다.");
		} else 
			System.out.println("TV를 끕니다.");
	}
	
	int channelUp () {
	channel ++;
	return channel;
	
	}
	void channelDown () {
		channel --;
		System.out.println("현재 채널 : " + channel);
	}
	
	void volUp() {
		volume++;
	System.out.println("현재 볼륨 : " + volume);
	}
	
	int volDown() {
		volume--;
		System.out.println("현재 볼륨 : " + volume);
	return volume;
	}
	
	void volume(int volume) {
		this.volume=volume;
		/*지역변수랑 클래스 이름이 같을 땐 구분 해죠야함.. 
		 * 그래서 this.붙인겨.. 지역변수 이름이 vo1이면 걍 vol=vol1로 적어도 무방*/
		
	}
}
