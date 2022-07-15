package in.velocity.www;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class handlingDropDown {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\DELL\\eclipse-workspace\\AutoQtest\\Automation_Jar\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://mbasic.facebook.com/");
		
		driver.findElement(By.cssSelector("#signup-button input")).click();
		Thread.sleep(1000);
		
		List<WebElement> days = driver.findElements(By.id("day"));
		Thread.sleep(1000);
		
		for(WebElement day:days) {
			System.out.println(day.getText());
		}
		
		for(WebElement day:days) {
			if(day.getText().equals("18"))
				day.click();
		}
		
		
		List<WebElement> months = driver.findElements(By.cssSelector("#month"));
		
		for(WebElement month:months) {
			if(month.getText().equals("june"))
				month.click();
		}
		
		List<WebElement> years = driver.findElements(By.cssSelector("#year"));
		for(WebElement year:years) {
			if(year.getText().equals("1991"))
				year.click();
		}
		
		
		
		driver.quit();
		
		
		
	}

}
