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
//	ststic final double PI = 3.141592653589793; �� PI�� ����ƽ.
//		System.out.println(Math.PI);
		
		System.out.println("������ ������: " + Earth.EARTH_RADIUS + "km"); //Earth��� Ŭ������ EARTH_RADIUS��� �����..
		System.out.println("������ ǥ����: "+ Earth.EARTH_SURFACE_AREA + "Km^2");
	}

}
