package mayQtest;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SeleniumTuto {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\DELL\\Music\\chromedriver_win32\\chrome.exe");
		WebDriver driver= new ChromeDriver();
		driver.get("https://www.google.com");
		driver.manage().window().maximize();
		WebElement searchBox= driver.findElement(By.xpath("//input[@title='Search']"));
		searchBox.sendKeys("youtube");
		searchBox.sendKeys(Keys.ENTER);
		Thread.sleep(3000);
		driver.close();
		
	}

}
