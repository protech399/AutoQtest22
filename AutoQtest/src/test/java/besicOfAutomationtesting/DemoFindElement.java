package besicOfAutomationtesting;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class DemoFindElement {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\DELL\\Music\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://demo.automationtesting.in/Register.html");
		WebElement searchBox=driver.findElement(By.xpath("//*[@id=\'basicBootstrapForm\']/div[1]/div[1]/input"));
		searchBox.sendKeys("Sagar");
		String win_id= driver.getWindowHandle();
//		win_id=driver.getWindowHandles();	// where we are using collection in selenium 
		System.out.println(win_id);	//CDwindow-02C48C7F74279C8D0E3E4D220571E073

		
	}

}
