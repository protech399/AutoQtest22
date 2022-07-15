import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.By.ByXPath;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Selenium {
//	WebDriver driver= new WebDriver();	// WebDriver is a interface & we are not creating OBJ of interface so it'll not work
//	ChromeDriver driver= new ChromeDriver();	//it'll only invoke Chrome browser not other browsers
//		
	public static void main(String[] args)  {
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\DELL\\Music\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();	// we can use other browser too
		driver.get("https://demoqa.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		//WebElement x=driver.findElement(By.xpath("https://www.google.com/"));
		//driver.manage().timeouts().implicitlyWait(15,TimeUnit.SECONDS);// Implicit wait overloading
		
		WebDriverWait wait= new WebDriverWait(driver, 20);	// explicit wait (here explicit wait override on implicit wait)
		WebElement x= wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("https://www.youtube.com/")));
		x.clear();
		

	}

}
