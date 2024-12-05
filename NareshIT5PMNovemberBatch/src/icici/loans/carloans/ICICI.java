package icici.loans.carloans;

public class ICICI implements Rbi
{

	@Override
	public void deposit() {
		System.out.println("Iam overriden deposit in ICICI");
	}

	@Override
	public void withdrawl() {
		System.out.println("Iam overriden withdrawl in ICICI");
	}
	
	public void ministatement()
	{
		System.out.println("Iam overriden ministatement  in ICICI");
	}
	
	
	public static void main(String[] args) 
	{
		ICICI i = new ICICI();
		i.deposit();
		i.withdrawl();
		i.ministatement();
		Rbi.abc();
	}

}
