package icici.loans.homeloans;

import java.util.Scanner;

public class MenuExample 
{

	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		int choice;
		
		do
		{
			System.out.println("Menu :");
			System.out.println("1. Dosa");
			System.out.println("2. Idly");
			System.out.println("3. Poori");
			System.out.println("4. Upma");
			System.out.println("5. Exit");
			
			System.out.println("Enter your choice : ");
			choice = sc.nextInt();
			
			switch (choice) 
			{
				case 1: 
					System.out.println("You selected Dosa");
					break;
					
				case 2:
					System.out.println("You selected Idly");
					break;
					
				case 3:
					System.out.println("You selected Poori");
					break;
					
				case 4:
					System.out.println("You selected Upma");
					break;
				
				case 5:
					System.out.println("You selected Exit, Bye Bye Tata...");
					break;
					
				default:
					System.out.println("Invalid choice ,please try again.");
			}
			
		}while(choice!=5);
	}

}
