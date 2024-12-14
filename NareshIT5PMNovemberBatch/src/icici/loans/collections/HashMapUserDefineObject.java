package icici.loans.collections;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

import icici.loans.homeloans.Student;

public class HashMapUserDefineObject 
{

	public static void main(String[] args) 
	{
		Student s1 = new Student("ravi1", 20, 101);
		Student s2 = new Student("ravi2", 30, 102);
		Student s3 = new Student("ravi3", 40, 103);
		Student s4 = new Student("ravi4", 50, 104);
		
//		s1.displayInfo();
//		s2.displayInfo();
//		s3.displayInfo();
//		s4.displayInfo();
		
		Map<Integer, Student> enties = new HashMap<Integer, Student>();
		enties.put(s1.getRollNumber(), s1);
		enties.put(s2.getRollNumber(), s2);
		enties.put(s3.getRollNumber(), s3);
		enties.put(s4.getRollNumber(), s4);
		
		Set<Entry<Integer, Student>> ee = enties.entrySet();
		for(Entry<Integer, Student> e:ee)
		{
			System.out.println(e.getKey());
			Student RecordDetails = e.getValue();
			RecordDetails.displayInfo();
		}
		
		
	}

}
