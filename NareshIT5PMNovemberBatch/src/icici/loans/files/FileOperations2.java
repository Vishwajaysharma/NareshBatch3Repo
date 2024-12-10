package icici.loans.files;

import java.io.File;

public class FileOperations2 
{

	public static void main(String[] args) throws Exception 
	{
		File f = new File(System.getProperty("user.dir")+"//resume3.txt");
		if(f.exists())
			f.delete();
		else
			f.createNewFile();
		
		System.out.println(f.getAbsolutePath());
		System.out.println(f.getName());
	}

}
