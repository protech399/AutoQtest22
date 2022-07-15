package besicOfAutomationtesting;



import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Auto {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\DELL\\Music\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demoqa.com/");
		WebElement searchbox=driver.findElement(By.xpath("//input//[@id=\"search\"]"));
		searchbox.sendKeys("www.youtube.com");
		searchbox.sendKeys(Keys.ENTER);
		
		Thread.sleep(3000);
		driver.close();
		
		
		
	}

}
