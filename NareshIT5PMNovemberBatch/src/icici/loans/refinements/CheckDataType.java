package icici.loans.refinements;

import java.util.Scanner;

public class CheckDataType 
{

	public static void main(String[] args) 
	{
		int intData;
		char charData;
		String strData;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the Integer Value : ");
		intData = sc.nextInt();
		
		System.out.println("Enter the Character Value : ");
		charData = sc.next().charAt(0);
		
		System.out.println("Enter the String Value : ");
		strData = sc.next();
		
		System.out.println("strData is : " + strData.getClass().getSimpleName());
		System.out.println("intData is : " + ((Object)intData).getClass().getSimpleName());
		System.out.println("charData is : " + ((Object)charData).getClass().getSimpleName());
	}

}
