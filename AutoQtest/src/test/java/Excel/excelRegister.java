package Excel;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class excelRegister {
	
	public String registerlLoin(String sheetName, int rowNo, int colmnNo) throws IOException 
	{
		
//		demoTest.xlsx file path 
		File path = new File("C:\\Users\\DELL\\Desktop\\demoTest.xlsx");
		
//		load demoTest.xlsx file in java
		FileInputStream load = new FileInputStream(path);
		
		XSSFWorkbook workbook = new XSSFWorkbook(load);
		XSSFSheet sheet= workbook.getSheet(sheetName);
		String data=sheet.getRow(rowNo).getCell(colmnNo).getStringCellValue();
		
		
//		String data = WorkbookFactory.create(load).getSheet(sheetName).getRow(rowNo).getCell(colmnNo).getStringCellValue();
		
		return data;
		
		
	}
	

	public static void main(String[] args) throws IOException  {
		
		excelRegister loin = new excelRegister();
		String firstName = loin.registerlLoin("test1", 1, 0);
		String lastName = loin.registerlLoin("test1", 1, 1);
		String address = loin.registerlLoin("test1", 1, 2);
		String email = loin.registerlLoin("test1", 1, 3);
		String phone = loin.registerlLoin("test1", 1, 4);
		
		System.out.println(firstName);
		System.out.println(lastName);
		System.out.println(address);
		System.out.println(email);
		System.out.println(phone);
		
//		System.setProperty("webdriver.chrome.driver","C:\\Users\\DELL\\Music\\chromedriver.exe");
//		WebDriver driver = new ChromeDriver();
//		
//		driver.get("http://demo.automationtesting.in/Register.html");
//		
//		WebElement First_Name = driver.findElement(By.xpath("//*[@placeholder='First Name']"));
//		First_Name.sendKeys(firstName);
//		
//		WebElement Last_Name = driver.findElement(By.xpath("//*[@placeholder=\'Last Name\']"));
//		Last_Name.sendKeys(lastName);
//		
//		WebElement Address =driver.findElement(By.xpath("//*[@id=\'basicBootstrapForm\']/div[2]/div/textarea"));
//		Address.sendKeys(address);
//		
//		driver.findElement(By.xpath("//*[@type='email']")).sendKeys(email);
//		
//		driver.findElement(By.xpath("//*[@type='tel']")).sendKeys(phone);
//		
////		Actions class 
//		Actions a = new Actions(driver);
//		
//		WebElement Male = driver.findElement(By.xpath("//*[@value='Mle']"));
//		a.click(Male).build().perform();
//		
//		WebElement Hobbis = driver.findElement(By.xpath("//*[@value='Cricket']"));
//		a.click(Hobbis).build().perform();
//		
//		WebElement Languages = driver.findElement(By.id("msdd"));
//		a.click(Languages).build().perform();
		
		
		
		
		
	}

}
