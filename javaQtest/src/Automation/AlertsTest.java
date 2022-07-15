package Automation;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class AlertsTest {

	public static void main(String[] args) throws InterruptedException {

		WebDriverManager.edgedriver().setup();
		
//		System.setProperty("webdriver.chrome.driver","C:\\Users\\DELL\\Music\\chromedriver.exe");

		WebDriver driver = new EdgeDriver();
		
		driver.get("http://demo.automationtesting.in/Register.html");
		
		Actions a= new Actions(driver);
		
		WebElement SwitchTo =driver.findElement(By.xpath("//*[@id=\'header\']/nav/div/div[2]/ul/li[4]/a")); 
		a.moveToElement(SwitchTo).build().perform();
		
		WebElement Alrt= driver.findElement(By.cssSelector("#header > nav > div > div.navbar-collapse.collapse.navbar-right > ul > li:nth-child(4) > ul > li:nth-child(1) > a"));
		Alrt.click();
		
		WebElement AB = driver.findElement(By.cssSelector("#OKTab > button"));
		AB.click();
		
		Alert al= driver.switchTo().alert();
		 Thread.sleep(3000);
		 
		al.accept();
		
		Select ab =new Select(AB);
		

	}

}
