package testdemo.a;
import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.hssf.usermodel.HSSFCell;
import org.apache.poi.hssf.usermodel.HSSFRow;
import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
public class Assingforreadexcel {


	public static Object [][] dataOfStockPrices(String filename , String sheetname) throws IOException {

		Object[][] obj = null;

		FileInputStream file = new FileInputStream(filename );

	HSSFWorkbook book = new HSSFWorkbook(file);

		HSSFSheet sheet = book.getSheet(sheetname);

		int row = sheet.getLastRowNum();

		obj = new Object[row][sheet.getRow(0).getLastCellNum() - 1];

		for (int i = 0; i <= row; i++) {
			HSSFRow cell = sheet.getRow(i);

			for (int j = 0; j <cell.getLastCellNum(); j++) {

				HSSFCell cell1 = cell.getCell(j);

			obj[i][j]= cell1.getStringCellValue();

			}

		}
return obj;


	}
	
	
	
	
	
	
	
	
}
