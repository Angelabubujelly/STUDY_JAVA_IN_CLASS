package inheritance07;

public class Triangle extends Shape {
//����Ʈ ��ü���� 3���ؾ� ��
	Point[] p = new Point[3]; //�ﰢ���̴ϱ� point 3���� �ʿ����
	
	Triangle(Point[] p) { //�����ڿ� �迭 �־��ְ�
		this.p = p;
	}
	@Override
	void draw() {
		System.out.println("[p1="+p[0].getXY() + ", p2=" + p[1].getXY() + ", p3=" + p[2].getXY()+", color=" + color + "]");
	}
}
