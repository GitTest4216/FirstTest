package ExternalData;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;


public class ReadExcelDataWithPermission {

	public static void main(String[] args) throws EncryptedDocumentException, IOException 
	
	{
		String path ="C:\\Users\\vthorat\\eclipse-workspace\\Maven\\DataProvider/data.xlsx";
	
	  FileInputStream file = new FileInputStream(path);
	  //Cell cell= WorkbookFactory.create(file).getSheet(sheet).getRow(Row).getCell(Cell);
	  Cell cell = WorkbookFactory.create(file).getSheet("permission").getRow(0).getCell(1);
		try {
			String value = cell.getStringCellValue();
			
		}
		catch(IllegalStateException e)
		{
			long value = (long)cell.getNumericCellValue();
			
			String value1 = String.valueOf(value);
		

		}
		System.out.println();
	}
}
	
		
	