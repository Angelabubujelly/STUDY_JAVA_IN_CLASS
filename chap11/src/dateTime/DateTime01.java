package dateTime;

import java.time.LocalDateTime;

public class DateTime01 {

	public static void main(String[] args) {
		LocalDateTime now = LocalDateTime.now();

	System.out.println(now);
	String setDateTime = now.getYear() + "�� ";
	setDateTime += now.getMonthValue()	+ "�� ";
	setDateTime += now.getDayOfMonth() + "�� ";
	setDateTime += now.getDayOfWeek() +" " ;
	setDateTime += now.getHour() + "�� ";
	setDateTime += now.getMinute()+ "�� ";
	setDateTime +=now.getSecond()+ "�� ";
	
	 System.out.println(setDateTime);
	 
	}

}
