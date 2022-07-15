package DropDownHandling;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import besicOfAutomationtesting.WebElements;
import io.github.bonigarcia.wdm.WebDriverManager;

public class ByWeBElement {

	public static void main(String[] args) {
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		
		
//		open facebook
		driver.get("https://mbasic.facebook.com/reg/?cid=103&refsrc=deprecated&_rdr");
		
////		click on create newaccount
//		WebElement createACC= driver.findElement(By.xpath("//input[@name='sign_up']"));
//		createACC.click();
		
//		print all options from day DropDown & select 21
		List<WebElement> days = driver.findElements(By.cssSelector("#day option"));
		for(WebElement day:days) {
//			System.out.println(day.getText());
			if(day.getText().equals("21"))
				day.click();
		}
		
//		print all options from months DropDown
		List<WebElement> months = driver.findElements(By.cssSelector("#month option"));
		for(WebElement month:months) {
//			System.out.println(month.getText());
			if(month.getText().equalsIgnoreCase("Mar")) 
				month.click();
		}
		
		
//		print all options from years DropDown
		List<WebElement> years = driver.findElements(By.cssSelector("#year option"));
		for(WebElement year:years) {
//			System.out.println(year.getText());
			if(year.getText().equals("1992")) 
				year.click();
		}
		
		
		
		
		
		
		
		
	}

}
