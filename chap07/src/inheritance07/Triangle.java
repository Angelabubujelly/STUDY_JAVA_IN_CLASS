package inheritance07;

public class Triangle extends Shape {
//포인트 객체생성 3번해야 함
	Point[] p = new Point[3]; //삼각형이니까 point 3개만 필요행용
	
	Triangle(Point[] p) { //생성자에 배열 넣어주공
		this.p = p;
	}
	@Override
	void draw() {
		System.out.println("[p1="+p[0].getXY() + ", p2=" + p[1].getXY() + ", p3=" + p[2].getXY()+", color=" + color + "]");
	}
}
