package icici.loans.refinements;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Prog2 
{

	public static void main(String[] args) 
	{
		Date currentDate = new Date();
		System.out.println("Current Date is : " + currentDate);
		
		SimpleDateFormat formatter = new SimpleDateFormat("yyyy-MM-dd hh:mm:ss");
		String formattedDate = formatter.format(currentDate);
		
		System.out.println("Formatted Date : " + formattedDate);
	}

}
