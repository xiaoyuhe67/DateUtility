import static org.junit.Assert.*;

public class Test {

	@org.junit.Test
	public void test() {
	
		//get Days in month		
		int getDaysinmonth=DateUtility.getDaysInMonth(2, 2016);
		assertTrue(getDaysinmonth==29);
		System.out.println(getDaysinmonth);
		
		//toString
		DateUtility dateu=new DateUtility();
		String toString=dateu.toString();
		assertTrue(toString.equals("06/07/2015"));
		System.out.println(toString);
		
		//isLeapYear
		boolean isLeapYear=DateUtility.isLeapYear(2012);
		assertTrue(isLeapYear==true);
		System.out.println(isLeapYear);
		
		//displayCalendarMonthYear
		String displayCalendarMonthYear=DateUtility.displayCalendarMonthYear(4, 2016);
		System.out.println(displayCalendarMonthYear);
		
		//caldaysBetweentwodays
		assertTrue(dateu.caldaysBetweentwodays(6, 1, 2016, 6, 24, 2016)==23);
		System.out.println(dateu.caldaysBetweentwodays(6, 1, 2016, 6, 24, 2016));
		assertTrue(dateu.caldaysBetweentwodays("6/5/2016")==17);
		System.out.println(dateu.caldaysBetweentwodays("6/5/2016"));
		assertTrue(dateu.caldaysBetweentwodays("1/30/2015", "8/31/2016")==578);
		System.out.println(dateu.caldaysBetweentwodays("1/30/2015", "8/31/2016"));
		
		//getDayofWeek
		assertTrue(dateu.getDayofWeek(6, 22, 2016)==3);
		System.out.println(dateu.getDayofWeek(06,22,2016));
		assertTrue(dateu.getDayofWeek("6/19/2016")==0);
		System.out.println(dateu.getDayofWeek("6/19/2016"));

		
	}

}
