package icici.loans.homeloans;

import java.util.Arrays;

public class ReturiningMultipleVariables 
{

	public int[] elements()
	{
		int a = 10;
		int b = 20;
		int c = 30;
		
		System.out.println("Inside method : " + a);
		System.out.println("Inside method : " + b);
		System.out.println("Inside method : " + c);
		return new int[] {a,b,c};
	}
	
	public static void main(String[] args) 
	{
		ReturiningMultipleVariables obj = new ReturiningMultipleVariables();
		int[] val = obj.elements();
		System.out.println("Outside method : " +  Arrays.toString(val));
	}

}
