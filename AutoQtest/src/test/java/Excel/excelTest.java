package Excel;

import java.io.FileInputStream;

import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;




public class excelTest {

	public static void main(String[] args) throws IOException {

		System.setProperty("webdriver.chrome.driver","C:\\Users\\DELL\\Music\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.get("http://facebool.com");
		
		FileInputStream fs = new FileInputStream("C:\\Users\\DELL\\Desktop\\demoTest.xlsx");
		
		String name = WorkbookFactory.create(fs).getSheet("test1").getRow(1).getCell(3).getStringCellValue();
		System.out.println(name);
		
		WebElement mail = driver.findElement(By.xpath("//*[@id='email']"));
		mail.sendKeys(name);
		
//		String pwd = WorkbookFactory.create(fs).getSheet("test1").getRow(1).getCell(1).getStringCellValue();
//		System.out.println(pwd);
		
		WebElement pass = driver.findElement(By.xpath("//*[@id='passContainer']"));
		pass.sendKeys("pwd");
	}

}
