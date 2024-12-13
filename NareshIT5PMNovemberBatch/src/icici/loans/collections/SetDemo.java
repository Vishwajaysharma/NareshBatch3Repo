package icici.loans.collections;

import java.util.Iterator;
import java.util.LinkedHashSet;

public class SetDemo 
{

	public static void main(String[] args) 
	{
		LinkedHashSet<Integer> h = new LinkedHashSet<Integer>();
		h.add(10);
		h.add(20);
		h.add(30);
		h.add(10);
		h.add(40);
		h.add(50);
		System.out.println(h);
		
		Integer[] a = new Integer[h.size()];
		h.toArray(a);
		for(Integer i:a)
		{
			if(i.equals(40))
			
				System.out.println(i);
		}
		
		System.out.println("-----------------------------");
		Iterator<Integer> itr = h.iterator();
		while (itr.hasNext()) {
			Integer integer = (Integer) itr.next();
			System.out.println(integer);
		}
	}

}
