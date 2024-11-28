package icici.loans.homeloans;

public class ReturningOneVariable 
{
	public int add(int a, int b)
	{
		int c = a+b;
		System.out.println("inside add method :" + c);
		return c;
	}
	
	public static void main(String[] args) 
	{
		ReturningOneVariable obj = new ReturningOneVariable();
		int val = obj.add(10, 20);
		System.out.println("outside method :" + val);
	}

}
