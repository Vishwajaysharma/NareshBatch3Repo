package icici.loans.exeptions;

import java.util.Scanner;

public class UserDefineException extends Exception
{

	public UserDefineException(String string) 
	{
		super(string);
	}

	public static void main(String[] args) 
	{
		String str;
		Scanner sc = new Scanner(System.in);
		
		while (true) 
		{
			try 
			{
				System.out.println("Enter the 10 character string :");
				str = sc.nextLine();
				if (str.length() != 10) 
					throw new UserDefineException("should be 10 character string");
				else
					System.out.println("str : " +  str);
				break;
			} 
			catch (Exception e) 
			{
				e.printStackTrace();
			} 
		}
	}

}
