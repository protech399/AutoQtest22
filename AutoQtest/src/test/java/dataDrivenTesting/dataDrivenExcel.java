package dataDrivenTesting;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class dataDrivenExcel {
WebDriver driver;
	
	@BeforeClass
	public void setup()
	{
		System.setProperty("webdriver.chrome.driver","C:\\Users\\DELL\\Music\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		driver.manage().window().maximize();
	}
	
	
	@Test(dataProvider="LoginData")
	public void loginTest(String user, String pwd, String exp)
	{
		driver.get("https://admin-demo.nopcommerce.com/login");
		
		WebElement txtEmail = driver.findElement(By.id("Email"));
		txtEmail.clear();
		txtEmail.sendKeys(user);
		
		WebElement txtPassword = driver.findElement(By.id("Password"));
		txtPassword.clear();
		txtPassword.sendKeys(pwd);
		
		driver.findElement(By.xpath("//button[@type='submit']")).click(); // login button
		
		String exp_title= "Dashboard / nopCommerce adiministration";
		String act_title= driver.getTitle();
		
		if(exp.equals("Valid")) 
		{
			if(exp_title.equals(act_title)) 
			{		
				driver.findElement(By.linkText("Logout")).click();
				Assert.assertTrue(true);
			}
			else 
			{
				Assert.assertTrue(false);
			}
		}
		else if(exp.equals("Invalid"))
		{
			if(exp_title.equals(act_title)) 
			{
				Assert.assertTrue(false);
			}
			else 
			{
				Assert.assertTrue(true);
			}
		}
			
		
		
	}
	
	
	@DataProvider(name="LoginData")
	public String[][] getData() throws IOException				// data from excel sheet
	{
		String path="C:\\Users\\DELL\\Desktop\\loginData.xlsx"; 
		
		excelUtility XLUtil = new excelUtility(path);
		int totalrows= XLUtil.getRowCount("Sheet1");
		int totalcolmns= XLUtil.getCellCount("Sheet1", 1);
		
		String loginData[][] =new String[totalrows][totalcolmns];
		
		for(int i=1; i<=totalrows; i++) 
		{
			for(int j=0; j<totalcolmns; j++) 
			{
				loginData[i-1][j] =XLUtil.getCellData("Sheet1", i, j);
			}
		}
		
		
		return loginData;
	}
	
	@AfterClass
	 void tearDown() 
	{
		driver.close();
	}
	
}
