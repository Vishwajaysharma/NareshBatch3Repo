package icici.loans.files;

import java.io.File;

public class FileOperations3 
{

	public static void main(String[] args) throws Exception 
	{
		File f = new File("C:/Users/DELL/Desktop/A/B/C");
		//f.mkdir();
		//f.mkdirs();
		
		if(f.exists())
			f = new File("C:/Users/DELL/Desktop/A/B/C/r2.txt");
			f.createNewFile();
		
	}

}
