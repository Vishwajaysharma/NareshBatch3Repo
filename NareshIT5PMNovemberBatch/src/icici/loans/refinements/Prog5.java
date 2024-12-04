package icici.loans.refinements;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;

public class Prog5 
{

	public static void main(String[] args) 
	{
		Date currentDate = new Date();
		System.out.println("Current Date is : " + currentDate);
		SimpleDateFormat frenchFormat1 = new SimpleDateFormat("EEEE,d MMMM yyyy", Locale.FRENCH);
		System.out.println("Formatted Date  (FRENCH) :" + frenchFormat1.format(currentDate));
		
		SimpleDateFormat frenchFormat2 = new SimpleDateFormat("EEEE,d MMMM yyyy", Locale.JAPAN);
		System.out.println("Formatted Date  (FRENCH) :" + frenchFormat2.format(currentDate));
	}

}
