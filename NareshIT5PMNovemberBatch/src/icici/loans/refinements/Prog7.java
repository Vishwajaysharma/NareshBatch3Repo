package icici.loans.refinements;

import java.text.NumberFormat;
import java.util.Locale;

public class Prog7 
{

	public static void main(String[] args) 
	{
		NumberFormat currencyFormat = NumberFormat.getCurrencyInstance(Locale.UK);
		String formattedCurrency = currencyFormat.format(12345.6789);
		System.out.println("Formatted Currency  (UK) : " + formattedCurrency);
	}

}
