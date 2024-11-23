package icici.loans.carloans;

public interface Rbi 
{
	int x = 10;
	
	public void deposit();
	public void withdrawl();
	
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
