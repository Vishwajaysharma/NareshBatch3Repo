package icici.loans.homeloans;


class Parent
{
	public Number workHard()
	{
		System.out.println("Parent : wakeup early, Goto college");
		return 0;
	}
	
	public void care()
	{
		System.out.println("Parent : atmost care...");
	}
}

public class Child extends Parent
{
	
	public Integer workHard()
	{
		System.out.println("Child : wakeup anytime, Goto movie");
		return 0;
	}
	
	public void love()
	{
		System.out.println("Child : iam in love...");
	}

	public static void main(String[] args)
	{
		Child obj = new Child();
		obj.workHard();
		obj.care();
		obj.love();
	}

}
