package icici.loans.homeloans;

import java.util.Scanner;

public class PositiveNumber 
{

	public static void main(String[] args) 
	{
		Scanner scanner = new Scanner(System.in);
        int number;

        while (true) 
        {
            System.out.print("Enter a positive number: ");
            number = scanner.nextInt();

            if (number > 0) {
                System.out.println("Thank you! You entered: " + number);
                break;
            } else {
                System.out.println("Invalid input. Please try again.");
            }
        }
	}

}
