package chap05_2;
import java.util.Calendar;

public class EnumTest {

	public static void main(String[] args) {
		
		Week week = Week.FRIDAY;
		System.out.println(week);
		
		System.out.println(week.BAMBLEBEE);
		
		Calendar cal = Calendar.getInstance();
		
		int year = cal.get(Calendar.YEAR);
		int month = cal.get(Calendar.MONTH)+1; //Month�� ���Ӱ� +1 ���ֻ�
		int day = cal.get(Calendar.DAY_OF_MONTH);
		int week1 = cal.get(Calendar.DAY_OF_WEEK);
		
		System.out.println(" ���� �⵵ : " + year);
		System.out.println(" �� : " + month);
		System.out.println(" �� : " + day);
		
		Week today = null;
		
		switch(week1) {
		case 1:
			today = Week.SUNDAY;
			break;
		case 2:
			today = Week.MONDAY;
			break;
		case 3:
			today = Week.TUESDAY;
			break;
		case 4:
			today = Week.WEDNESDAY;
			break;
		case 5:
			today = Week.THURSDAY;
			break;
		case 6:
			today = Week.FRIDAY;
			break;
		case 7:
			today = Week.SATURDAY;
			break;
		case 8:
			today = Week.BAMBLEBEE;
			break;
			
		}
		System.out.println(" ������ ���� : " + today);

		if(today == Week.SUNDAY) {
			System.out.println("�ڹ� ���θ� ������ �մϴ�.");
			
		} else {
			System.out.println("�ڹ� ���θ� �� �� �� �ä� ���������� ������ �մϴ�.");
		}
		
		Position po = Position.����;
		
		System.out.println(po);
		
		
	}

}
