package in.velocity.www;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class SelectDropDown {
		
	static WebDriver driver;
	static String url = "http://demo.automationtesting.in/Register.html";
	
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\DELL\\eclipse-workspace\\AutoQtest\\Automation_Jar\\chromedriver.exe");	
		driver = new ChromeDriver();
		
		
//		Actions class
		
		Actions a = new Actions(driver); 
		
//		getting url
		driver.get(url);
		
		
		
		
		
		
		
		
		
	}

}
