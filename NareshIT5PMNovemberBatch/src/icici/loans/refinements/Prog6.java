package icici.loans.refinements;

import java.text.NumberFormat;

public class Prog6 
{

	public static void main(String[] args) 
	{
		NumberFormat percentFormat = NumberFormat.getPercentInstance();
		String formattedPercentage = percentFormat.format(0.12345);
		System.out.println("Formatted Percentage : " + formattedPercentage);
	}

}
