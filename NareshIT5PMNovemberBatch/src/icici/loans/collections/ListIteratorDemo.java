package icici.loans.collections;

import java.util.ArrayList;
import java.util.ListIterator;

public class ListIteratorDemo 
{

	public static void main(String[] args)
	{
		ArrayList<String> a = new ArrayList<String>();
		a.add("oracle");
		a.add("vmware");
		a.add("tcs");
		a.add("vmware");
		
		System.out.println(a);
		
		ListIterator<String> itr = a.listIterator();
		while (itr.hasNext()) 
		{
			String val = itr.next();
			if(val.equals("vmware"))
				itr.set("NareshIT");
			else
				itr.remove();
			
		}
		System.out.println(a);
	}
}
