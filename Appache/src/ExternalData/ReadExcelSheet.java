package ExternalData;

import java.io.FileInputStream;

import java.io.IOException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class ReadExcelSheet {

	public static void main(String[] args) throws IOException {
		
		
		String path = ("C:\\Users\\vthorat\\eclipse-workspace\\Maven\\DataProvider\\data.xlsx");
		FileInputStream fis = new FileInputStream(path);
		
		Workbook wb = WorkbookFactory.create(fis);
		
		Sheet sh=wb.getSheet("Permission");
		
		int rows = sh.getLastRowNum();
		int column = sh.getRow(0).getLastCellNum();
		
		for (int r=0; r<=rows; r++)
		{
			Row row = sh.getRow(r);
			
		for (int c=0; c<column; c++)
		{
			Cell cell =row.getCell(c);
			
			switch (cell.getCellType())
			{
			case STRING : System.out.println(cell.getStringCellValue()+" / "); break;
			case NUMERIC : System.out.println(cell.getNumericCellValue()+" / ");break;
			case BOOLEAN : System.out.println(cell.getBooleanCellValue()+" / "); break;
			}
		}
		System.out.println();
		}
	}
}