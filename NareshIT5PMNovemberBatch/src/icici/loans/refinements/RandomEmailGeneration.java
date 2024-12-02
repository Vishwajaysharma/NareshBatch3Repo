package icici.loans.refinements;

import java.util.Date;
import java.util.Random;

public class RandomEmailGeneration 
{

	public int randomNum()
	{
		Random r = new Random();
		//int rNum = r.nextInt();
		int rNum =r.nextInt(999);
		return rNum;
	}
	
	public String randomNumThroughDate()
	{
		Date d = new Date();
		System.out.println(d);
		String dt = d.toString().replace(":", "").replace(" ", "");
		return dt;
	}
	
	
	public static void main(String[] args) 
	{
		//String email = "username13@gmail.com";
		
		String fname ="qatest";
		String dname = "@gmail.com";
		
		RandomEmailGeneration obj = new RandomEmailGeneration();
		for(int i=1;i<=10;i++)
		{
			System.out.println(fname+obj.randomNum()+dname);
		}
		
		System.out.println(obj.randomNumThroughDate()+dname);
	}
}
