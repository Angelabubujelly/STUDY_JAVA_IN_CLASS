package inheritanceSuper05;



class Point {
	
	int x ;
	int y;
	
	Point(int x, int y) { //�� x,y�� �޾� ���� this���� �ִ´�?
		this.x = x;
		this.y = y;
	}
	 String getXY() { //���ڿ� ��ȯ��?
	return "("+x + ", " +y+ ")" ;
	 }
}
class Point3D extends Point{ //point3D�� Point�κ��� ���� �޾ұ⶧���� �ݵ�� ������ �ʿ�
	
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
		String str = super.getXY()	;//string�� �����ä���
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
