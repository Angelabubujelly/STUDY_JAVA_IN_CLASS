package finalStatic;
class Earth {
	static final double EARTH_RADIUS = 6400;
	static final double EARTH_SURFACE_AREA ;
	
	static {
		EARTH_SURFACE_AREA = 4*Math.PI*EARTH_RADIUS;
	}
}


public class EarthEx {

	public static void main(String[] args) {
//	ststic final double PI = 3.141592653589793; 웅 PI도 스태틱.
//		System.out.println(Math.PI);
		
		System.out.println("지구의 반지름: " + Earth.EARTH_RADIUS + "km"); //Earth라는 클래스의 EARTH_RADIUS라는 상수를..
		System.out.println("지구의 표면적: "+ Earth.EARTH_SURFACE_AREA + "Km^2");
	}

}
