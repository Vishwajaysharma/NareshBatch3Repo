package icici.loans.refinements;

import java.text.NumberFormat;

public class Prog1 
{

	public static void main(String[] args) throws Exception 
	{
		String price1 = "12,345.678";
		System.out.println("String price is : " + price1 );
		System.out.println(price1.getClass().getSimpleName());
			
		
		NumberFormat format = NumberFormat.getInstance();
		Number number = format.parse(price1);
		System.out.println(number.getClass().getSimpleName() + " -- " + number);
		
		
		String price2 = "12,345";
		System.out.println("String price is : " + price2 );
		System.out.println(price2.getClass().getSimpleName());
		
		NumberFormat format1 = NumberFormat.getInstance();
		Number number1 = format1.parse(price2);
		System.out.println(number1.getClass().getSimpleName() + " -- " + number1);
		
		int number2 = number1.intValue();
		System.out.println(((Object)number2).getClass().getSimpleName() + " -- " + number2);
		
		float number3 = number1.floatValue();
		System.out.println(((Object)number3).getClass().getSimpleName() + " -- " + number3);
	}

}
