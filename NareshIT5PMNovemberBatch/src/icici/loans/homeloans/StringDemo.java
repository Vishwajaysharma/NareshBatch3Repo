package icici.loans.homeloans;

public class StringDemo 
{

	public static void main(String[] args) 
	{
		String s1 = "ravikanth";
		System.out.println(s1);
		System.out.println(s1.isEmpty());
		System.out.println(s1.length());
		System.out.println(s1.charAt(2));
		System.out.println(s1.indexOf('v'));
		System.out.println(s1.startsWith("ravi"));
		System.out.println(s1.endsWith("nth"));
		System.out.println(s1.toUpperCase());
		System.out.println(s1.toLowerCase());
				
		String s2 = new String("lella");
		System.out.println(s2);
		//System.out.println(s1+s2);
		System.out.println(s1.concat(s2));
		System.out.println(s1.toUpperCase().concat(s2));
		System.out.println(s1);
		System.out.println(s1.substring(2, 7));
		System.out.println(s1);
		System.out.println(s1.replace('r', 'k'));
		
		String s3 = "ravikanth";
		System.out.println(s1.equals(s2));
		System.out.println(s1.equals(s3));
		
		String s4 = "Ravikanth";
		System.out.println(s1.equals(s4));
		System.out.println(s1.equalsIgnoreCase(s4));
		
		String s5 = "ravi";
		System.out.println(s1.equals(s5));
		System.out.println(s1.equalsIgnoreCase(s5));
		System.out.println(s1.contains(s5));
		System.out.println(s1.contains(s5.toLowerCase()));
		
		String s6 = " Ravi";
		System.out.println(s1.contains(s6.toLowerCase().trim()));
				
		String s7 = "ravi,World,ravi,ravi";
		System.out.println(s7.lastIndexOf("ravi"));
		
		String s8 = "ravi kanth	lella";
		System.out.println(s8);
		String[] str = s8.split(" ");
		for(String s:str)
		{
			System.out.println(s);
		}
		
		System.out.println(s1);
		System.out.println(s1.repeat(3));
		
		String str1 = "";		// Empty string
		String str2 = " ";		// Only space
		String str3 = "\t\n";	// Tab & new Line
		String str4 = "java";	// no-blank string
		
		System.out.println("Is srt1 blank ? "+ str1.isBlank());
		System.out.println("Is srt2 blank ? "+ str2.isBlank());
		System.out.println("Is srt3 blank ? "+ str3.isBlank());
		System.out.println("Is srt4 blank ? "+ str4.isBlank());
		
		
		String separator = "-".repeat(10);
		System.out.println(separator);
		
		
		String str5 = "Line1\nLine2\nLine3";
		long lineCount = str5.lines().count();
		System.out.println("Number of lines :" +  lineCount);
		
		String str6 = "Hello";
		System.out.println("str : "+ str6);
		char[] chars = str6.toCharArray();
		for(char c:chars)
		{
			System.out.print(c + " ");
		}
		
		
		int num = 123;
		System.out.println("\n" + num);
		String str7 = String.valueOf(num);
		System.out.println(str7);
	}

}
