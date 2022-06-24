package inheritance07;

public class Circle extends Shape{
//	Point center = new Point();랑 같????
	Point center;
	int r;
	
	Circle(){
/*		Point center = new Point(0,0); */
		this(new Point(), 100); //사용자가 값 안 넣으면 Point는 0임.
	}
	Circle(Point center/*Point p;, p = new Point()라는 뜻 ..*/, int r) { 
		//class 자료형 중 Point 객체를 생성해서 그 주소룰 받겠다...
		this.center = center; //사용자가 메인에서 넣으려면 Point center = new Point();의 center의 값이 생성자 center에 들어가??
		this.r = r;
	}
	@Override
	void draw()	{ //생성자는 객체가 호출 될 때 생성 되는거궁... 쟤 Circle은 값 2개를 넣어줘야 생성된다..
		System.out.println("[center = (" + center.x + ", " + center.y + "), r = " + r +", color = " + color +"]");
		//상속받았기때문에.... shape에 있는 color를 그냥 쓰면 됩니다...
	}
	
	void aa (int x) { //매개변수 반드시 하나 넣으시오 했응게 x값을 넣어줘야만 오류 안나융
		System.out.println("aaaa");
	}
	
}
