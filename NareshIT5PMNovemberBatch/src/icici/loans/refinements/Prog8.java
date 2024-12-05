package icici.loans.refinements;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Prog8 
{

	public static void main(String[] args) 
	{
		Date currentDate = new Date();
		System.out.println("Current Date is : " + currentDate);
		
		
		// set format in 12 hours
		// hh = hours in 12hr format
        // mm = minutes
        // aa = am/pm
		SimpleDateFormat formatTime = new SimpleDateFormat("hh:mm aa");
        String time = formatTime.format(currentDate); // changing the format of 'date'
        System.out.println("Current Time in AM/PM Format is : " + time);
	}

}
