package icici.loans.collections;

import java.util.HashMap;
import java.util.Map;

public class PhoneDirectory 
{

	public static void main(String[] args) 
	{
		Map<String, String> phoneDirectory = new HashMap<String, String>();
		phoneDirectory.put("John", "123-456-7890");
		phoneDirectory.put("Jane", "235-654-9987");
		phoneDirectory.put("Jake", "323-656-9899");
		
		String johnNumber = phoneDirectory.get("Jane");
		System.out.println(johnNumber);
	}

}
