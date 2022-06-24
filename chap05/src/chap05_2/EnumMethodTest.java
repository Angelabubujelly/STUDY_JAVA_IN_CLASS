package chap05_2;

public class EnumMethodTest {

	public static void main(String[] args) {
		Week today = Week.BAMBLEBEE;
		String name = today.name();
		System.out.println(name);
		System.out.println(today);
		
		int ordinal = today.ordinal()	;
		 System.out.println(ordinal);
		 
		 Week week = Week.valueOf("BAMBLEBEE");
		 
		 System.out.println(week+"\n");
		 
		 Week[] days = Week.values();
		 for(Week day : days) {
			 System.out.println(day);
		 }
		 
		 Position[] po = Position.values();
		 for(Position posi : po) {
			 System.out.println(posi);
		 }

	}

}
