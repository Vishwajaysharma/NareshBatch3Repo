package icici.loans.collections;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Set;
import java.util.TreeMap;

public class MapDemo 
{

	public static void main(String[] args) 
	{
		//HashMap<Integer, Integer> h = new HashMap<Integer, Integer>();
		//LinkedHashMap<Integer, Integer> h = new LinkedHashMap<Integer, Integer>();
		TreeMap<Integer, Integer> h = new TreeMap<Integer, Integer>();
		h.put(1000, 100);
		h.put(200, 200);
		h.put(3, 300);
		h.put(10, 400);
		h.put(15, 200);
		
		System.out.println(h);
		System.out.println(h.size());
		System.out.println(h.get(10));
		System.out.println(h.isEmpty());
		System.out.println(h.containsKey(50));
		System.out.println(h.containsValue(400));
		
		Set<Integer> keys = h.keySet();
		System.out.println(keys);
		for(Integer key :keys)
		{
			System.out.println(key + " ----> " + h.get(key));
		}
		
		
	}

}
