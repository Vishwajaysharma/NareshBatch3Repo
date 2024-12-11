package icici.loans.files;

import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class File3 
{

	public static void main(String[] args) throws IOException, InterruptedException 
	{
		File f = new File("C:\\Users\\DELL\\Desktop\\text2.txt");
		FileReader fr = new FileReader(f);
		int asciiNum = 0;
		
		while((asciiNum = fr.read()) != -1)
		{
			System.out.print((char)asciiNum);
			Thread.sleep(500);
		}
		
	}

}
