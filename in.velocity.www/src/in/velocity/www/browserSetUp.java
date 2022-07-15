package in.velocity.www;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

import io.netty.channel.RecvByteBufAllocator;

public class browserSetUp {
		static WebDriver driver;
		
//		BrowserNmae if wanted
		static String browserName= "";
		
//		 demo link
		static String url= "https://opensource-demo.orangehrmlive.com/";
		
		
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\DELL\\eclipse-workspace\\in.velocity.www\\Automation_Jar\\chromedriver.exe");
		System.setProperty("webdriver.edge.driver", "C:\\Users\\DELL\\eclipse-workspace\\in.velocity.www\\Automation_Jar\\edgedriver.exe");
		
		
//		open browser if any
		if(browserName.equals("edge")) {
			driver = new EdgeDriver();
		}else {
			driver = new ChromeDriver();
		}
		
		// open demo link
		driver.get(url);
		
/*	login through different web elements
 * */		
		
		WebElement userName = driver.findElement(By.name("txtUsername"));
		userName.sendKeys("Admin");
		
		WebElement password= driver.findElement(By.name("txtPassword"));
		password.sendKeys("admin123");
		
		WebElement login= driver.findElement(By.className("button"));
		login.click();
		
		driver.findElement(By.id("welcome")).click();
		Thread.sleep(1000);
		
		driver.findElement(By.partialLinkText("Log")).click();
		
		
		
		
		Thread.sleep(8000);
		driver.quit();
	}

}
