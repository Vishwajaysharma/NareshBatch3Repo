package icici.loans.homeloans;

import java.util.Scanner;

public class ATMMachine 
{
	public static void main(String[] args) 
	{
		int pin = 1234;
		
		int attempts = 0;
		int maxAttempts = 3;
		
		Scanner sc = new Scanner(System.in);
		
		while(attempts<maxAttempts)
		{
			attempts++;
			System.out.println("Enter your pin : ");
			int enteredPin = sc.nextInt();
			if(enteredPin == pin)
			{
				System.out.println("Access granted,welcome to your Account..");
				break;
			}
			else 
			{
				System.out.println("Incorrect PIN, you have entered ," + (maxAttempts-attempts)+" - attempts left");
			}
		}
		
		if(attempts == maxAttempts)
		{
			System.out.println("Too many incorrect attempts. your account is locked.");
		}	
	}
}
