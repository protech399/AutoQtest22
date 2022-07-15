package besicOfAutomationtesting;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class driverMethodTest {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\DELL\\Music\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();

		driver.get("http://demo.automationtesting.in/Register.html");
		
		//Thread.sleep(5000);
		
		driver.navigate().to("https://www.apollospectra.com/");
		
		//Thread.sleep(5000);
		
		driver.navigate().back();
		
		//Thread.sleep(5000);
		
		driver.navigate().forward();
		
		//Thread.sleep(5000);
		
		driver.navigate().refresh();
		
		String title = driver.getTitle();
		
		System.out.println(title);
		
		String url = driver.getCurrentUrl();
		
		System.out.println(url);
		
//		String src_code = driver.getPageSource();
//		System.out.println(src_code);

	}

}
