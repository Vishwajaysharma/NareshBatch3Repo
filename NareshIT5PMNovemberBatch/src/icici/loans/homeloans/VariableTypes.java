package icici.loans.homeloans;

public class VariableTypes 
{
	// primitive variable
	int x = 100; //primitive instance (or) non-static (or) global
	static char ch = 'a'; //primitive static
	static VariableTypes obj ;
	
	public void m1()
	{
		int y = 200; // primitive local
		int x = 300;
		System.out.println(y);
		System.out.println(x);
		System.out.println(this.x);
		System.out.println(VariableTypes.ch);
	}
	
	public static void m2()
	{
		obj = new VariableTypes();
		System.out.println(obj.x);
		System.out.println(ch);
	}

	public static void main(String[] args) 
	{
		obj = new VariableTypes(); //Non-primitive variable
		System.out.println(obj.x);
		System.out.println(VariableTypes.ch);
		obj.m1();
		VariableTypes.m2();
	}

}
