package icici.loans.carloans;

public class A
{
	int x;  // variable declaration
	public int  y = 100; // Variable defined
	
	public void m1()
	{
		System.out.println("iam m1 from A");
	}

	public static void main(String[] args) 
	{
		A a = new A();
		a.m1();
		System.out.println(a.y);
	}

}
