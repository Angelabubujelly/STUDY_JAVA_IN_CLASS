package inheritance07;

public class Circle extends Shape{
//	Point center = new Point();�� ��????
	Point center;
	int r;
	
	Circle(){
/*		Point center = new Point(0,0); */
		this(new Point(), 100); //����ڰ� �� �� ������ Point�� 0��.
	}
	Circle(Point center/*Point p;, p = new Point()��� �� ..*/, int r) { 
		//class �ڷ��� �� Point ��ü�� �����ؼ� �� �ּҷ� �ްڴ�...
		this.center = center; //����ڰ� ���ο��� �������� Point center = new Point();�� center�� ���� ������ center�� ��??
		this.r = r;
	}
	@Override
	void draw()	{ //�����ڴ� ��ü�� ȣ�� �� �� ���� �Ǵ°ű�... �� Circle�� �� 2���� �־���� �����ȴ�..
		System.out.println("[center = (" + center.x + ", " + center.y + "), r = " + r +", color = " + color +"]");
		//��ӹ޾ұ⶧����.... shape�� �ִ� color�� �׳� ���� �˴ϴ�...
	}
	
	void aa (int x) { //�Ű����� �ݵ�� �ϳ� �����ÿ� ������ x���� �־���߸� ���� �ȳ���
		System.out.println("aaaa");
	}
	
}
