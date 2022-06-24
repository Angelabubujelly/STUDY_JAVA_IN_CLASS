package inheritanceOver04;

public class Computer extends Calculator {
	@Override //@ crtrl + space bar 
	double areaCircle(double y) {
		System.out.println("Conputer 객체의 areaCircle() 실행");
		return Math.PI*y*y; //변수명은 내 맘대룡~~ 다만 나머지는 원형과 똑같이~~!
	}
	
	
	
}
