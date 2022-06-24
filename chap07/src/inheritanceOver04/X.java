package inheritanceOver04;

public class X {
	int x;
	int y;
	
	void setXY(int x, int y) {
		this.x = x;
		this.y = y;
		System.out.println("부모 X,Y의 좌표 : ("+x + ", "+ y + ")" );
	}
}
