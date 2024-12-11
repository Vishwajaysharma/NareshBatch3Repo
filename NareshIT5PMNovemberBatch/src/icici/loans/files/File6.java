package icici.loans.files;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class File6 
{

	public static void main(String[] args) throws IOException 
	{
		File f = new File("C:\\Users\\DELL\\Desktop\\text1.txt");
		if(f.exists())
			f.delete();
		f.createNewFile();
		
		String text = "Hello welcome to naresh IT";
		
		FileWriter fos = new FileWriter(f);
		for(char ch:text.toCharArray())
		{
			fos.write(ch);
		}
		fos.close();
	}

}
