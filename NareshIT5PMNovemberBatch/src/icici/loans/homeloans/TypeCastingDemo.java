package icici.loans.homeloans;

public class TypeCastingDemo 
{

	public static void main(String[] args) 
	{
		//1-ltr water bottle -> 500 ml of water -> There is no dataloss -->widding
		//1-ltr water bottle -> 1.5ltr of water -> There is a dataloss  -->Narowing
		
		// byte-1 , short-2, int-4, long-8, float-4, double-8
		
		//Type casting from one primitive datatype to another primitive datatype
		
		int i1 =35;
		System.out.println(i1);
		
		double i2 = (double)i1;
		System.out.println(i2);
		
		int i3 = (int)i2;
		System.out.println(i3);
		
		char i4 = (char)i3;
		System.out.println(i4);
		
		//Type casting from primitive datatype to corresponding wrapperclass type
		
		int x1 = 100;
		System.out.println(x1);
		
		//Integer x2 = x1;
		Integer x2 =Integer.valueOf(x1);
		System.out.println(x2);
		
		int x3 = (int)x2;
		System.out.println(x3);
		
		//Type casting from wrapperclass type to another wrapperclass type
		
		String s1 = "200";
		String s2 = "300";
		System.out.println(s1+s2);
		
		float f1 = Float.parseFloat(s1);
		float f2 = Float.parseFloat(s2);
		System.out.println(f1+f2);
		
		int p1 = Integer.parseInt(s1);
		int p2 = Integer.parseInt(s2);
		System.out.println(p1+p2);
		
		Integer q1 = Integer.valueOf(p1);
		Integer q2 = Integer.valueOf(p2);
		System.out.println(q1+q2);
		
		Integer r1 = Integer.valueOf(s1);
		Integer r2 = Integer.valueOf(s2);
		System.out.println(r1+r2);
	}

}
