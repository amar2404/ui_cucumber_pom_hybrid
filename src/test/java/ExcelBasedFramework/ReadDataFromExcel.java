package ExcelBasedFramework;

import java.io.File;
import java.io.FileInputStream;

import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ReadDataFromExcel {
	
	public static final String FILE_NAME = "/Users/amrsingh0/eclipse-workspace/maven/src/test/java/ExcelBasedFramework/TestData.xlsx";

	public static void main(String[] args) 
    { 
		try {
		FileInputStream excelFile = new FileInputStream(new File(FILE_NAME) );
		@SuppressWarnings("resource")
		Workbook workbook = new XSSFWorkbook(excelFile);
		
		Sheet datatypeSheet = workbook.getSheet("Team");
		
		
		int rowTotal = datatypeSheet.getLastRowNum();
		int noOfColumns = datatypeSheet.getRow(0).getLastCellNum();
		System.out.println("total row count" + rowTotal);
		System.out.println("total column count" + noOfColumns);
		System.out.println("print the position 0,0" + datatypeSheet.getRow(0).getCell(0));
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
    }
		
       
}

