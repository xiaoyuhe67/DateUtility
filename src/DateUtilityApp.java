import java.util.Calendar;
import java.util.GregorianCalendar;

public class DateUtilityApp {
	
	public static void main(String[] args)
	{
		
		DateUtility dateu=new DateUtility();
		System.out.println(DateUtility.displayCalendarMonthYear(6, 2016));
		
		System.out.println(dateu.caldaysBetweentwodays(6, 1, 2016, 6, 24, 2016));
		System.out.println(dateu.caldaysBetweentwodays("6 1 2016"));
		
		System.out.println(dateu.getDayofWeek(06,19,2016));
		
		System.out.println(dateu.caldaysBetweentwodays("6 1 2016", "6 24 2016"));
		
	
	}
	


}
