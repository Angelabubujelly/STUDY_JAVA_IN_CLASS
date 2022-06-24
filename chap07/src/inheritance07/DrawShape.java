package inheritance07;

public class DrawShape {

	public static void main( String[] args) {
		Point[]	p = {new Point(100,100), new Point(50,200),new Point(200,100)};
		Point[]	p2 = {new Point(100,100), new Point(50,200),new Point(200,100), new Point(300,400)};
		/*p[0]= 객체의 주소 100,100
		p[1]= 50,200의 객체의 주소
		p[2] = 200,100d의 객체의 주소
		*/
		Triangle t = new Triangle(p); //p만 넣으면 배열 세개(그 배열이 가리키는 주소)가 다 들어감...
		Circle c = new Circle(new Point(100,100), 200); // 안에 객채생성 해서 값 넣어야 함..
		c.draw();
		t.draw();//Override 했으니까 draw해두댕
		c.color="은색";
		t.color="은색";
		c.draw();
		t.draw();
		
		Ractangle r = new Ractangle(p2);
		r.draw();
	}

}
