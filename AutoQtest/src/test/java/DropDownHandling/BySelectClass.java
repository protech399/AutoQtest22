package DropDownHandling;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BySelectClass {

	public static void main(String[] args) {
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://mbasic.facebook.com/");
		driver.findElement(By.cssSelector("#signup-button input")).click();
		
		WebElement day= driver.findElement(By.cssSelector("#day"));
		WebElement month= driver.findElement(By.cssSelector("#month"));
		WebElement year= driver.findElement(By.cssSelector("#year"));
		
		Select selDay= new Select(day);
		selDay.selectByIndex(21);
		
		Select selMonth= new Select(month);
		selMonth.selectByValue("3");
		
		Select selYear= new Select(year);
		selYear.selectByVisibleText("1992");
		
	}

}
