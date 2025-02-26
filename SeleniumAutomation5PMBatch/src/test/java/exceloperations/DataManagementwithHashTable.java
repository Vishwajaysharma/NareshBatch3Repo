package exceloperations;

import org.testng.annotations.Test;

import java.util.Hashtable;

import org.testng.annotations.DataProvider;

public class DataManagementwithHashTable 
{
	
  @Test(dataProvider = "getData")
  public void f(Hashtable<String, String> h) 
  {
	  System.out.println(h.get("UserName"));
	  System.out.println(h.get("UserPassword"));
  }

  @DataProvider
  public Object[][] getData() throws Exception 
  {
	    ExcelAPI e = new ExcelAPI("C:\\Users\\DELL\\Desktop\\suitex.xlsx");
		String sheetName = "data";
		String testName = "LoginTest";
		
		//To find the matching testcase Rownumber 
		int teststartrownum = 0;
		while(!e.getCellData(sheetName, 0, teststartrownum).equals(testName))
		{
			teststartrownum++;
		}
		System.out.println(testName + " Test start row Number is : " + teststartrownum);
		
		int colstartrownum = teststartrownum+1;
		int datastartrownum = teststartrownum+2;
		
		
		//Calculate the rows of data
		int rows=0;
		while(!e.getCellData(sheetName, 0, datastartrownum+rows).equals(""))
		{
			rows++;
		}
		System.out.println("Total rows are : " + rows);
		
		//Calculate the cols of data
		int cols = 0;
		while(!e.getCellData(sheetName, cols, colstartrownum).equals(""))
		{
			cols++;
		}
		System.out.println("Total cols are : " + cols);
		
		//Read the test data
		int dataRow = 0;
		Hashtable<String, String> table = null;
		Object[][] data = new Object[rows][1];
		for(int rnum =datastartrownum;rnum<datastartrownum+rows;rnum++)
		{
			table = new Hashtable<String, String>();
			for(int cnum=0;cnum<cols;cnum++)
			{
				//System.out.println(e.getCellData(sheetName, cnum, rnum));
				//data[dataRow][cnum] = e.getCellData(sheetName, cnum, rnum);
				String key = e.getCellData(sheetName, cnum, colstartrownum);
				String value = e.getCellData(sheetName, cnum, rnum);
				table.put(key, value);
			}
			data[dataRow][0] = table;
			dataRow++;
		}
		return data;
  	}
  
}
