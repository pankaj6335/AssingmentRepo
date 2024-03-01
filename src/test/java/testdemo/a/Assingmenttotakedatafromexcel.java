package testdemo.a;

import java.io.IOException;

import org.testng.annotations.DataProvider;
public class Assingmenttotakedatafromexcel {

	
	@DataProvider
	public Object[][] dataOfStockPrices() throws IOException{
		
		return Assingforreadexcel.dataOfStockPrices("C:\\Users\\HITESH\\Downloads\\Stockprices.xls","companystocks");
	}
	
	
	
	
	
}
