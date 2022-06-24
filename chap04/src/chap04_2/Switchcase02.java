package chap04_2;

public class Switchcase02 {

	public static void main(String[] args) {
        String str = "몽이";
        
         switch(str) {
         case "블비":
        	 System.out.println("용공로 대표 미남입니다.");
        	 break;
         case "몽이":
        	 System.out.println("올공 두목님입니다.");
        	 break;
         case "둥이":
        	 System.out.println("앨리웨이 아이돌입니다.");
        	 break;
        	 default:
        		 System.out.println("모르는 넘입니다.");
         }
         
         char ch = '몽'; //1글자 이상이면 무조건 스트링 . 한글자일때는 무조건 ' 루.
         switch(ch) {
         case '블':
        	 System.out.println("고독한 기요밉니다.");
        	 break;
         case '몽':
        	 System.out.println("별기계입니다.");
        	 break;
         case '둥':
        	 System.out.println("무심한 듯 도시적입니다.");
        	 break;
        	 default:
        		 System.out.println("그러던지말던지입니다.");
         }

	}

}
