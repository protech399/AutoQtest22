package Automation;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class chromeTesting {
	
	public static void main(String[] args) throws InterruptedException {
			System.setProperty("webdriver.chrome.driver", "C:\\Users\\DELL\\Music\\chromedriver_win32\\chromedriver.exe");

			WebDriver driver = new ChromeDriver();

			driver.get("https://www.amazon.in/");
			
			 String act_string = driver.getTitle();
			 System.out.println("Title is :"+act_string);
			 
			 String exp_title = "Online Shopping site in India: Shop Online for Mobiles, Books, Watches, Shoes and More - Amazon.in";
			
			 if (act_string == exp_title)
			 {
				 System.out.println("TC is Pass");
			 }
			 else 
			 {
				 System.out.println("TC is Fail");
			 }
			 
			 
			 //Thread.sleep(4000);
			driver.manage().window().maximize();
			Thread.sleep(4000);
			//driver.close();
			driver.manage().window().minimize();
			
			
	}

}
	
	

