package exceloperations;

public class DataManagement 
{

	public static void main(String[] args) throws Exception 
	{
		ExcelAPI e = new ExcelAPI("C:\\Users\\DELL\\Desktop\\suitex.xlsx");
		String sheetName = "data";
		String testName = "TestB";
		
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
		for(int rnum =datastartrownum;rnum<datastartrownum+rows;rnum++)
		{
			for(int cnum=0;cnum<cols;cnum++)
			{
				System.out.println(e.getCellData(sheetName, cnum, rnum));
			}
		}
	}

}
