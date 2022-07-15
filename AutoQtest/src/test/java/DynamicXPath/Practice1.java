package DynamicXPath;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Practice1 {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\DELL\\eclipse-workspace\\AutoQtest\\Automation_Jar\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		
//		Open Demo link in ChromeDriver
		String url = "http://demo.automationtesting.in/Register.html";
		driver.navigate().to(url);
		
//		Actions class
		
		Actions a= new Actions(driver);
		
		WebElement SwitchTo = driver.findElement(By.linkText("SwitchTo"));
		a.moveToElement(SwitchTo).build().perform();
		
		WebElement Alerts = driver.findElement(By.linkText("Alerts"));
		a.click(Alerts).build().perform();
		
		WebElement AlertWithOk = driver.findElement(By.className("Alerts")); 
		a.contextClick(AlertWithOk).build().perform();
		
	}

}
