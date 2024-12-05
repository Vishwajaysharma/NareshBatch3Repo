package icici.loans.carloans;

public class HDFC implements Rbi
{

	@Override
	public void deposit() {
		System.out.println("Iam overriden deposit in HDFC");
	}

	@Override
	public void withdrawl() {
		System.out.println("Iam overriden withdrawl in HDFC");
	}
	
	public void ministatement()
	{
		System.out.println("Iam overriden ministatement  in HDFC");
	}
	
	public static void main(String[] args) {
		HDFC h = new HDFC();
		h.deposit();
		h.withdrawl();
		h.ministatement();
	}

}
