package icici.loans.homeloans;

public class MethodDemonstartion 
{
	public Integer add(int a, int b)
	{
		int c = a+b;
		System.out.println("inside add method :" + c);
		return c;
	}
	
	
	public static void main(String[] args) 
	{
		MethodDemonstartion obj = new MethodDemonstartion();
		Integer val = obj.add(10, 20);
		System.out.println("outside method :" + val);
	}

}
