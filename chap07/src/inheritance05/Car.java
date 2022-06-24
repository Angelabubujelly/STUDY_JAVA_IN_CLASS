package inheritance05;

public class Car {
	//필드
//	Tire[]tiers = new Tire [4];
//	Tire[0] = new Tire("앞왼쪽",6);
//	Tire[1] = new Tire("앞오른쪽",2);
//	Tire[2] = new Tire("뒤왼쬑",4);
//	Tire[3] = new Tire("뒤오른쪽",3);
	
	Tire[] tires = {new Tire("앞왼쪽",6), new Tire("앞오른쪽",2),new Tire("뒤왼쪽",4),new Tire("뒤오른쪽",3)};

//생성자
//메소드
	int run() { //달리려면 roll호출해야함...
		System.out.println("[자동차가 달립니다.]"); 
		
		for(int i=0; i<tires.length; i++) {
			if(tires[i].roll()==false) {
				stop();
				return i+1; 	
		}
	}
	return 0; 
	}
void stop() {
	System.out.println("[자동차가 멈춥니다.]");
}

}
