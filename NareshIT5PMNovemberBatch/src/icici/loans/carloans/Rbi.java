package icici.loans.carloans;

public interface Rbi 
{
	int x = 10;
	
	public void deposit();
	public void withdrawl();
	
	default void ministatement()
	{
		System.out.println("ministatement dummy code");
		xyz();
	}
	
	static void abc()
	{
		System.out.println("abc static method");
		xyz();
	}
	
	private static void xyz()
	{
		System.out.println("iam xyz private method");
	}
	
	public static void main(String[] args) 
	{
		//Rbi i = new Rbi();
		
		Rbi i;
		
		i = new HDFC();
		i.withdrawl();
		i.deposit();
		
		i = new ICICI();
		i.withdrawl();
		i.deposit();
	}
}
