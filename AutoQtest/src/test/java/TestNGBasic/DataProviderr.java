package TestNGBasic;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class DataProviderr {
	
	
	@Test(dataProvider = "loginData")
	public void TC1() {
		System.out.println("TC1");
	}
	
	
	@DataProvider(name="loginData")
	public Object[][] getData()				// Hard core data
	{
		Object loginData[][]= {
								{"admin@yourstore.com", "admin", "Valid"},
								{"admin@yourstore.com", "adm", "Invalid"},
								{"amin@yourstore.com", "admi", "Invalid"},
								{"admin@yourtore.com", "dmin", "Invalid"},
							  };
		return loginData;
	}
	
	
	
	
	
	
	
	
}
