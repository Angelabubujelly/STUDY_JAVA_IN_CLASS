package inheritance07;

public class Ractangle extends Shape{
	
	Point [] p = new Point[4];
	
	Ractangle(Point[] p) {
		this.p =p;
	}
	@Override
	void draw() {
		System.out.println("[p1"+p[0].getXY() + ", p2="+p[1].getXY()+", p3="+p[2].getXY()+", p4="+p[3].getXY()+"]");
	}

}
