package DynamicXPath;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DyanamicXPath1 {

	public static void main(String[] args)  {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\DELL\\eclipse-workspace\\AutoQtest\\Automation_Jar\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		
		driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		driver.get("https://classic.freecrm.com/login.cfm");
				
		
		
//		Actions a = new Actions(driver);
//		a.moveToElement(driver.findElement(By.xpath("//*[@id=\'navbar-collapse\']/ul/li[1]/a"))).build().perform();
//		a.doubleClick(driver.findElement(By.xpath("//*[@id=\'navbar-collapse\']/ul/li[1]/a"))).build().perform();
		
		WebElement classicCRM=driver.findElement(By.xpath("//*[@id=\'ui\']/div/div/div[2]/a"));
		classicCRM.click();
		
		WebElement userName=driver.findElement(By.xpath("//*[@id=\'loginForm\']/input[1]"));
		userName.sendKeys("naveenk");
		
		WebElement password=driver.findElement(By.xpath("//*[@id=\'loginForm\']/input[2]"));
		password.sendKeys("test@123");
		
		driver.findElement(By.xpath("//*[@id=\'loginForm\']/input[3]")).click();
		
//		a.moveToElement(driver.findElement(By.xpath("//*[@id=\'ui\']/div/div/form/div/div[3]"))).build().perform();
//		a.doubleClick(driver.findElement(By.xpath("//*[@id=\'ui\']/div/div/form/div/div[3]"))).build().perform();
		
//		WebElement submit=driver.findElement(By.name("username"));
//		submit.sendKeys("naveenk");
		
		
	}

}
