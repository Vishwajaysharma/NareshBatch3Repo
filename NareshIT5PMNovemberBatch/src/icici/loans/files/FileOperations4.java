package icici.loans.files;

import java.io.File;

public class FileOperations4 
{

	public static void main(String[] args) 
	{
		File f = new File(System.getProperty("user.dir")+"/main");
		f.mkdir();
		System.out.println(f.getAbsolutePath());
		System.out.println(f.getParent());
		
		String p = f.getAbsolutePath();
		String val = p+"\\r3.txt";
		System.out.println(val);
	}

}
