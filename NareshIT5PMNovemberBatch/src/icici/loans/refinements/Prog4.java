package icici.loans.refinements;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.TimeZone;

public class Prog4 
{

	public static void main(String[] args) 
	{
		Date currentDate = new Date();
		System.out.println("Current Date is : " + currentDate);
		SimpleDateFormat format1 = new SimpleDateFormat("yyyy-MM-dd hh:mm:ss z");
		format1.setTimeZone(TimeZone.getTimeZone("UTC"));
		System.out.println("Formated Date with TimeZone :" + format1.format(currentDate));
	}

}
