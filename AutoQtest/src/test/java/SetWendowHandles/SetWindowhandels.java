package SetWendowHandles;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class SetWindowhandels {

	public static void main(String[] args) throws IOException, InterruptedException {

		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		
//		open demoautomation Window page
		driver.get("http://demo.automationtesting.in/Windows.html");
		
//		get window id/handel
		String parent = driver.getWindowHandle();
		System.out.println(parent);
		
//		click on "click" button of open new tab window
		driver.findElement(By.xpath("//*[@id=\"Tabbed\"]/a/button")).click();
		
//		getting window id/Handles of two tabs
		Set<String> ids = driver.getWindowHandles();
		
		for(String a:ids) {		//for each loop to execute 1by1
			if(!a.equals(parent)) {	// if window id not match with new window id 
				System.out.println(a);
				Thread.sleep(3000);
				
				driver.switchTo().window(a); //then switchTo new window
				Thread.sleep(6000);
				
				driver.findElement(By.xpath("/html/body/div/footer/div/div/div[3]/p/a")).click();
				Thread.sleep(6000);
			}
		}
		driver.switchTo().window(parent);
		driver.quit();
	}

}
