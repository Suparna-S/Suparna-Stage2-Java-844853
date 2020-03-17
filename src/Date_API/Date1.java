package Date_API;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.LocalTime;
import java.time.Year;
import java.util.Date;

public class Date1 {

	public static void main(String[] args) throws ParseException {
		Date date=new Date();
		System.out.println("Date Class: "+date.toString());
		Date dNow=new Date();
		SimpleDateFormat ft=new SimpleDateFormat("E yyyy.MM.dd 'at' hh:mm:ss a zzz");
		System.out.println("Current Date: "+ft.format(dNow));
		
		LocalDate date1=LocalDate.now();
		LocalDate yesterday=date1.minusDays(1);
		System.out.println("Today date: "+date1);
		System.out.println("Yesterday Date: "+yesterday);
		
		LocalTime time=LocalTime.now();
		System.out.println("Current Time: "+time);
		
		Year y=Year.of(2020);
		LocalDate l=y.atDay(90);
		System.out.println("2020: (90th day): "+l);
		
		//parsing String to Date object.
		SimpleDateFormat sdf=new SimpleDateFormat("dd-M-yyyy hh:mm:ss");
		String dateInString = "15-10-2018 10:20:56";
		Date date4=sdf.parse(dateInString);
		System.out.println("String to date: "+date4);
	}

}
