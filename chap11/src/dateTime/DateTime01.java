package dateTime;

import java.time.LocalDateTime;

public class DateTime01 {

	public static void main(String[] args) {
		LocalDateTime now = LocalDateTime.now();

	System.out.println(now);
	String setDateTime = now.getYear() + "년 ";
	setDateTime += now.getMonthValue()	+ "월 ";
	setDateTime += now.getDayOfMonth() + "일 ";
	setDateTime += now.getDayOfWeek() +" " ;
	setDateTime += now.getHour() + "시 ";
	setDateTime += now.getMinute()+ "분 ";
	setDateTime +=now.getSecond()+ "초 ";
	
	 System.out.println(setDateTime);
	 
	}

}
