package TestNGBasic;

import java.io.File;

import java.io.IOException;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import org.openqa.selenium.io.FileHandler;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TestNGDemoScreanShot {
	
	WebDriver driver ;
	@BeforeMethod					//4
	public void  url()
	{
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://demo.automationtesting.in/Register.html");
	}
	
	@Test
	public void  testing1() throws IOException
	{
		
		String act = driver.getTitle();
		System.out.println(act);
		String exp ="Register1";
		
		if (act.equals(exp)) {
			System.out.println("This TC is Pass");
		}
		else
		{
			System.out.println("This TC is Failed, you can refer the SS");
			
			TakesScreenshot t  = (TakesScreenshot)driver;		//typecasting
			
			
			File source = t.getScreenshotAs(OutputType.FILE);
			
			
			File target = new File("C:\\Users\\DELL\\eclipse-workspace\\AutoQtest\\Faild TC\\"+"SStestng.jpeg");
			
			FileHandler.copy(source, target);
			
			JavascriptExecutor js= (JavascriptExecutor)driver;
			js.executeScript("window.scrollBy(0,250)","");
			
			
		}
	}
	
	@AfterMethod
	public void  logout()
	{
		driver.close();
	}
}
