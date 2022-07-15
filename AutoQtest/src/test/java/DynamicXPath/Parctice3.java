package DynamicXPath;



import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Parctice3 {
		
		static WebDriver driver;
		static String browserName;
		static String url= "https://opensource-demo.orangehrmlive.com/";
		
		
		
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\DELL\\eclipse-workspace\\AutoQtest\\Automation_Jar\\chromedriver.exe");
		System.setProperty("webdriver.edge.driver", "C:\\Users\\DELL\\eclipse-workspace\\AutoQtest\\Automation_Jar\\msedgedriver.exe");
		
		
		browserName = "";
		
		if(browserName.equals("edge")) {
			driver =new EdgeDriver();
		}else {
			driver = new ChromeDriver();
		}
		
		driver.get(url);
		
		WebElement loginTxt = driver.findElement(By.xpath("//div[text()='LOGIN Panel']"));
		
		String actualTxt = loginTxt.getText();
		System.out.println(actualTxt);
		
		String expectedTxt="LOGIN Panel";
		
		if(actualTxt.equals(expectedTxt)) {
			System.out.println("Text is as expected");
		}
		

	}

}
