package icici.loans.homeloans;

import java.util.Scanner;

public class SingleDimenssionArray 
{

	public static void main(String[] args) 
	{
		/*int[] a = {10,20,30,40,50,60,70,80};
		System.out.println(a.length);
		
		for(int i=0;i<a.length;i++)
		{
			System.out.println("a["+i+"]="+a[i]);
		}*/
		
		/*int[] a = new int[] {10,20,30,40,50};
		for(int i=0;i<a.length;i++)
		{
			System.out.println("a["+i+"]="+a[i]);
		}*/
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the array size :");
		int asize = sc.nextInt();
		
		int[] a = new int[asize];
		int sum = 0;
		
		System.out.println("Enter the array elements : ");
		for(int i=0;i<a.length;i++)
		{
			a[i] = sc.nextInt();
			System.out.println("a["+i+"]="+a[i]);
			sum = sum+a[i];
		}
		System.out.println("sum of the array is : " + sum);
	}
}
