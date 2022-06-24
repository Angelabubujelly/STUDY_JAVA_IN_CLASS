package chap04_04;

import java.io.IOException;

public class While02 {

	public static void main(String[] args) {
		// 방향키 ^ -> 1증가 ˇ .-> 1감소
		boolean run = true;
		int speed = 0, keyCode = 0;
		
		while(run) /*run 은 참이기에 while 문은 무한으로 재생 ㄷ ㄷ ㄷ */{
			//System.in.read(); // 키보드로 누른 것을 읽어 가져오시오... scanner랑 같은거랭...;;;;
			
			if(keyCode != 13 && keyCode!=10) {
				System.out.println("--------------------");
				System.out.println("1.증속 | 2. 감속 | 3. 중지 ");
				System.out.println("---------------------");	
				System.out.println("선택 : ");
			
			}
			try {
				keyCode = System.in.read(); //에러가 날 확률이 있기 때문에 try catch문으로 바꿔준다는 메시지가 뜹니당~~!
				if(keyCode ==49) {
					speed++;
					System.out.println("현재 속도 : " + speed);
				} else if(keyCode == 50) {
					speed--;
					System.out.println("현재 속도 : " + speed);
				} else if(keyCode == 51) {
					run = false;
				}
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		System.out.println("프로그램 종료");

	}

}
