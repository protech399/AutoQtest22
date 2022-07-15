package besicOfAutomationtesting;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AlertTest {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\DELL\\Music\\chromedriver.exe");
		WebDriver driver=new ChromeDriver(); 
		
		driver.get("http://demo.automationtesting.in/Windows.html");
		
		String parent= driver.getWindowHandle();
		System.out.println(parent);
		
		
		driver.findElement(By.xpath(""));
		
		
		
		
	}

}
