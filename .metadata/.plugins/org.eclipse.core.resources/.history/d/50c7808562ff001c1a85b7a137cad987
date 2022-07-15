package CheckBoxHandling;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class oneBy1OnMultipleElement {

	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		WebDriver driver =new ChromeDriver();
		
		driver.get("https://opensource-demo.orangehrmlive.com/index.php/auth/login");
		
		driver.findElement(By.id("txtUsername")).sendKeys("Admin");
		driver.findElement(By.id("txtPassword")).sendKeys("admin123");
		driver.findElement(By.id("btnLogin")).click();
		Thread.sleep(3000);
		
		driver.findElement(By.id("menu_admin_viewAdminModule")).click();
		driver.findElement(By.id("menu_admin_userManagement")).click();
		
		List<WebElement> checkBoxes = driver.findElements(By.xpath("//table[@id='resultTable']//tr//td//input"));
		
		for(WebElement checkBox : checkBoxes) {
			checkBox.click();}
	}

}
