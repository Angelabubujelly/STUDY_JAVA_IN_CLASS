package inheritance07;

public class DrawShape {

	public static void main( String[] args) {
		Point[]	p = {new Point(100,100), new Point(50,200),new Point(200,100)};
		Point[]	p2 = {new Point(100,100), new Point(50,200),new Point(200,100), new Point(300,400)};
		/*p[0]= ��ü�� �ּ� 100,100
		p[1]= 50,200�� ��ü�� �ּ�
		p[2] = 200,100d�� ��ü�� �ּ�
		*/
		Triangle t = new Triangle(p); //p�� ������ �迭 ����(�� �迭�� ����Ű�� �ּ�)�� �� ��...
		Circle c = new Circle(new Point(100,100), 200); // �ȿ� ��ä���� �ؼ� �� �־�� ��..
		c.draw();
		t.draw();//Override �����ϱ� draw�صδ�
		c.color="����";
		t.color="����";
		c.draw();
		t.draw();
		
		Ractangle r = new Ractangle(p2);
		r.draw();
	}

}
