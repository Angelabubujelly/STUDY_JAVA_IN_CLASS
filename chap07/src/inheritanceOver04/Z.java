package inheritanceOver04;

public class Z extends X {
	int z = 30;
	
	@Override
	void setXY (int x, int y) {
		this.x = x; //이걸 붙여줘야.. 오버라이딩 돼서 얘를 호출한거거덩..
		this.y = y; //이걸 붙여줘야.. 
		
		System.out.println("좌표 : (" + this.x + ", " + this.y + ", " + z + ")" ); //z는 유일해서 this 생략가능..
	}
}
