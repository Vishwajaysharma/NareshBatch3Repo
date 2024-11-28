package icici.loans.homeloans;

public class SumEvenNumbers 
{

	public static void main(String[] args) 
	{
		int sum = 0;
		
		for(int i=1;i<=10;i++)
		{
			if(i%2 == 0)
			{
				System.out.print(i + "  ");
				sum = sum+i;
			}	    
		}
		System.out.println();
		System.out.println("The sum of all even numbers from 1 to 10 is: " + sum);
	}

}
