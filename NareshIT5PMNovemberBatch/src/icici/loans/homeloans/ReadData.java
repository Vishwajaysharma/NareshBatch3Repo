package icici.loans.homeloans;

import java.util.Scanner;

public class ReadData 
{

	public static void main(String[] args) 
	{
		int a,b;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the A value :");
		a = sc.nextInt();
		System.out.println("Enter the B value :");
		b = sc.nextInt();
		
		System.out.println(a + "\t"+ b);
	}

}
