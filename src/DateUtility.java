import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.Locale;
import java.util.Scanner;
import java.util.concurrent.TimeUnit;

public class DateUtility {
	
	private int month;
	private int day;
	private int year;
	private String delimiter="/";
		
	public static int getDaysInMonth(int month,int year)
	{
		int days=0;
		switch(month)
		{
		case 1: days=31;
		break;
		case 2: if(isLeapYear(year)==true)
			   {
			     days=29;
			   }
				else
				{
			      days=28;
				}
		break;
		case 3: days=31;
		break;
		case 4: days=30;
		break;
		case 5: days=31;
		break;
		case 6: days=30;
		break;
		case 7: days=31;
		break;
		case 8: days=31;
		break;
		case 9: days=30;
		break;
		case 10: days=31;
		break;
		case 11: days=30;
		break;
		case 12: days=31;
		break;
		default: days=0;
		break;
		}
		return days;
	}
	
	@Override
	public String toString()
	{
		return String.format("%02d", this.month)+this.delimiter+String.format("%02d", this.day)+this.delimiter+this.year;
	}
	
	public static boolean isLeapYear(int year)
	{
		boolean bLeapYear = false;
		 bLeapYear = (year % 4 == 0);

		// is it divisible by 4 and not 100
		 bLeapYear = bLeapYear && (year % 100 != 0);

		// is it divisible by 4 and not 100 unless it's divisible by 400
		 bLeapYear = bLeapYear || (year % 400 == 0);
		 
		 return bLeapYear;
	}
	public static String displayCalendarMonthYear(int month, int year) {
		// create a new GregorianCalendar object
		Calendar cal = new GregorianCalendar();

		// set its date to the first day of the month/year given by user
		cal.clear();
		cal.set(year, month - 1, 1);

		// print calendar header
		
        String CalenderHeader= "\n"	+ cal.getDisplayName(Calendar.MONTH, Calendar.LONG,Locale.US) + " "+ cal.get(Calendar.YEAR)+"\n";
		
		// obtain the weekday of the first day of month.
		int firstWeekdayOfMonth = cal.get(Calendar.DAY_OF_WEEK);

		// obtain the number of days in month.
		int numberOfMonthDays = getDaysInMonth(month,year);

		// print anonymous calendar month based on the weekday of the first
		// day of the month and the number of days in month:
		return CalenderHeader+printCalendar(numberOfMonthDays, firstWeekdayOfMonth);
	}

	/*
	 * 	prints an anonymous calendar month based on the weekday of the first
	 *  day of the month and the number of days in month:
	 */
	private static String printCalendar(int numberOfMonthDays, int firstWeekdayOfMonth) {

		// reset index of weekday
		int weekdayIndex = 0;

		// print calendar weekday header
		String weekdayHeader="Su  Mo  Tu  We  Th  Fr  Sa";
		
		
		String stringCalender="";
		// leave/skip weekdays before the first day of month
		for (int day = 1; day < firstWeekdayOfMonth; day++) {
			//System.out.print("    ");
			stringCalender+="    ";
			weekdayIndex++;
		}

		String stringDay=""+weekdayHeader+"\n"+stringCalender;
		// print the days of month in tabular format.
		for (int day = 1; day <= numberOfMonthDays; day++) {
			// print day
			//System.out.print(day);
			String formatted = String.format("%02d", day);
			stringDay+=formatted;

			// next weekday
			weekdayIndex++;
			// if it is the last weekday
			if (weekdayIndex == 7) {
				// reset it
				weekdayIndex = 0;
				// and go to next line
				//System.out.println();
				stringDay+="\n";
			} else { // otherwise
				// print space
				//System.out.print("  ");
				stringDay+="  ";
			}
		}

		// print a final new-line.
		stringDay+="\n";
		
		return stringDay;
	}

	
	public int caldaysBetweentwodays(int month1, int day1, int year1, int month2, int day2, int year2)
	{
		  Calendar cal1 = new GregorianCalendar();
		  Calendar cal2 = new GregorianCalendar();
		  cal1.clear();
		  cal1.set(year1, month1, day1); 
		  cal2.clear();
		  cal2.set(year2, month2, day2);
		int days=0;
		
	    days=daysBetween(cal1.getTime(),cal2.getTime());	
	   
		
		return days;
	}
	
	public int daysBetween(Date d1, Date d2){
        return (int)( (d2.getTime() - d1.getTime()) / (1000 * 60 * 60 * 24));
}
	public int getDayofWeek(int month, int day,int year)
	{
		int dayofWeek=0;
		
		Calendar datee = new GregorianCalendar();
		datee.clear();
		datee.set(year, month, day);
		
		dayofWeek=datee.get(Calendar.DAY_OF_WEEK_IN_MONTH);
		 
		return dayofWeek;
		
	}
	public int caldaysBetweentwodays(String date1, String date2)
	{
		Scanner sc1=new Scanner(date1);
		int month1=sc1.nextInt();
		int day1=sc1.nextInt();
		int year1=sc1.nextInt();
		Scanner sc2=new Scanner(date2);
		int month2=sc2.nextInt();
		int day2=sc2.nextInt();
		int year2=sc2.nextInt();
		
		Calendar cal1 = new GregorianCalendar();
		  Calendar cal2 = new GregorianCalendar();
		  cal1.clear();
		  cal1.set(year1, month1, day1); 
		  cal2.clear();
		  cal2.set(year2, month2, day2);
		int days=0;
		
	    days=daysBetween(cal1.getTime(),cal2.getTime());	
	   
		
		return days;
	}
	
	public int getDayofWeek(String date)
	{
		Scanner sc1=new Scanner(date);
		int month=sc1.nextInt();
		int day=sc1.nextInt();
		int year=sc1.nextInt();
		
		int dayofWeek=0;
		
		Calendar datee = new GregorianCalendar();
		datee.clear();
		datee.set(year, month, day);
		
		dayofWeek=datee.get(Calendar.DAY_OF_WEEK_IN_MONTH);
		 
		return dayofWeek;
		
	}
	public int caldaysBetweentwodays(String date1)
	{
		Scanner sc1=new Scanner(date1);
		int month1=sc1.nextInt();
		int day1=sc1.nextInt();
		int year1=sc1.nextInt();
		
		
		Calendar cal1 = new GregorianCalendar();
	
		  cal1.clear();
		  cal1.set(year1, month1, day1); 
		  
		  Date today = Calendar.getInstance().getTime();
		int days=0;
		
	    days=daysBetween(cal1.getTime(),today);	
	   
		
		return days;
	}
	
	
}


