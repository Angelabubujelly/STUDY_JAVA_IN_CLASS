package inheritance07;

public class Point {
	int x;
	int y;

 
 Point(){//아무것도 안 넣었을 때
 	 this(0,0); //<-넘기시옹 
 	 
 }
 Point(int x, int y){ //좌표 넣었을 때
	 this.x = x;
	 this.y = y;
 }
 String getXY() { //xy좌표 얻어오면 요렇게 반환하겠솽~
	 return "("+x+", "+y+")";
 }
}
