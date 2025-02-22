package exceloperations;

import java.io.FileInputStream;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ReadData 
{

	public static void main(String[] args) throws Exception 
	{
		FileInputStream fis = new FileInputStream("C:\\Users\\DELL\\Desktop\\data.xlsx");
		XSSFWorkbook wb = new XSSFWorkbook(fis);
		XSSFSheet sheet = wb.getSheet("people");
		
		int rows = sheet.getLastRowNum();
		int cols = sheet.getRow(0).getLastCellNum();
		
		for(int r=0;r<rows;r++)
		{
			XSSFRow row = sheet.getRow(r);
			for(int c=0;c<cols;c++)
			{
				XSSFCell cell = row.getCell(c);
				
				switch(cell.getCellType())
				{
					case STRING  : System.out.print(cell.getStringCellValue()); break;
					case NUMERIC : System.out.print(cell.getNumericCellValue()); break;
					case BOOLEAN : System.out.print(cell.getBooleanCellValue()); break;
					case FORMULA : System.out.print(cell.getCellFormula()); break;
				default: System.out.print("Cell is empty");
				}
				System.out.print(" | ");
			}
			System.out.println();
		}
		
	}

}
