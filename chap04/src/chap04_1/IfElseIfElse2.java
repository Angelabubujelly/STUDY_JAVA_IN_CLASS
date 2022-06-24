package chap04_1;

public class IfElseIfElse2 {

	public static void main(String[] args) {
		double random1 = Math.random();
		//0.000000.. ~ 0.999999..

System.out.println(random1);

double random2 = Math.random() *10 ;
//0.000000.. ~ 9.999999..

System.out.println(random2);

int random3 = (int)(Math.random()*10) ;
//0~9
System.out.println(random3);	

int random4 = (int)(Math.random()*10) + 1 ;
//1~10
System.out.println(random4);	
		
int random5 =  (int)(Math.random()*4 ) ;
// 0~3
System.out.println(random5);

		int num = (int)(Math.random() * 5) + 1;
		
		if(num==1) 
			System.out.println("1번이 나왔습니다.");
			else if(num==2)
				System.out.println("2번이 나왔습니다.");
			else if(num==3)
				System.out.println("3번이 나왔습니다.");
			else if(num==4)
				System.out.println("4번이 나왔습니다.");
			else if(num==5)
				System.out.println("5번이 나왔습니다.");
		}
	

}
