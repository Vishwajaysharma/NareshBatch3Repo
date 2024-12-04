package icici.loans.refinements;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Prog3 
{

	public static void main(String[] args) 
	{
		Date currentDate = new Date();
		System.out.println("Current Date is : " + currentDate);
		SimpleDateFormat format1 = new SimpleDateFormat("yyyy-MM-dd");
		SimpleDateFormat format2 = new SimpleDateFormat("MM/dd/yyyy");
		SimpleDateFormat format3 = new SimpleDateFormat("MMMM d,yyyy");
		
		System.out.println("Format1 :" + format1.format(currentDate));
		System.out.println("Format2 :" + format2.format(currentDate));
		System.out.println("Format3 :" + format3.format(currentDate));
	}

}
