package inheritance07;

public class Point {
	int x;
	int y;

 
 Point(){//�ƹ��͵� �� �־��� ��
 	 this(0,0); //<-�ѱ�ÿ� 
 	 
 }
 Point(int x, int y){ //��ǥ �־��� ��
	 this.x = x;
	 this.y = y;
 }
 String getXY() { //xy��ǥ ������ �䷸�� ��ȯ�ϰڼ�~
	 return "("+x+", "+y+")";
 }
}
