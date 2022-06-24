package inheritanceSuper05;



class Point {
	
	int x ;
	int y;
	
	Point(int x, int y) { //값 x,y를 받아 각각 this에다 넣는다?
		this.x = x;
		this.y = y;
	}
	 String getXY() { //문자열 반환형?
	return "("+x + ", " +y+ ")" ;
	 }
}
class Point3D extends Point{ //point3D는 Point로부터 값을 받았기때문에 반드시 생성자 필요
	
	int z;
	
	Point3D(int x, int y, int z) {
	super(x,y);
	this.z = z;
	
	}
	@Override
	String getXY() {
		return "("+x + ", " +y+", "+z+ ")" ;
	}
	String getPoint() {
		String str = super.getXY()	;//string이 들어오ㅓㅏ용
	return str;
	}
	}
public class PointTest {

	public static void main(String[] args) {
		Point3D p3d = new Point3D(5,7,25);
		System.out.println(p3d.getXY());
		System.out.println(p3d.getPoint());

	}

}
