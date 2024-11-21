package icici.loans.homeloans;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegExPattern 
{

	public static void main(String[] args) 
	{
		//approch 1
		/*Pattern p = Pattern.compile("[6789][0-9]{9}");
		Matcher m = p.matcher("8678915347");
		boolean b = m.matches();
		System.out.println(b);
		
		//approch 2
		boolean b1 = Pattern.matches("[6789][0-9]{9}", "9678913434");
		System.out.println(b1);
		
		boolean b2 = Pattern.matches("[A-Z][a-z]+[0-9][a-z]+", "Ravi3kanth");
		System.out.println(b2);
		
		boolean b3 = Pattern.matches("[A-Z][a-z]*[.][0-9]+[@][a-z]*[.][a-z]{2,3}", "Ravilella.1981@gmail.com");
		System.out.println(b3);
		
		//Validate a Date Format (DD/MM/YYYY)
		String date = "01/12/2024";
        String regex = "(0[1-9]|[12][0-9]|3[01])/(0[1-9]|1[0-2])/\\d{2,4}";

        boolean b4 = Pattern.matches(regex, date);     
        System.out.println(b4);	*/
        
        //Validate a Password weakpass StrongP@ssw0rd
        boolean b5 = Pattern.matches("(?=.*[0-9])(?=.*[a-z])(?=.*[A-Z])(?=.*[@#$%^&+=]).{8,}","StrongP@ssw0rd");
        System.out.println(b5);
        
        // "visit our website at https://amazon.in or https://flipkart.com"
        
        // "Ravi kanth" - RK
        
        // "This     is a    test for    you"
        
        // "192.168.0.1"
        
        // "The order numbers are 123, 456, &  789"
	}
}
