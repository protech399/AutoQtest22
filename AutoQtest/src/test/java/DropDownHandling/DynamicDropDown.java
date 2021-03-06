package DropDownHandling;
/* it only work in DebugMode */


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DynamicDropDown {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.google.com/");
		
		WebElement search = driver.findElement(By.xpath("//input[@name='q']")); 
		search.sendKeys("Automation testing");
		
		String vartext = "interview questions";
																														//	Concatening
		WebElement interviewQuestions= driver.findElement(By.xpath("//ul//li//span[text()='automation testing']//b[text()=' "+vartext+"']"));
		Thread.sleep(5000);
		interviewQuestions.click();
		Thread.sleep(5000);
		driver.quit();
		
	}

}
