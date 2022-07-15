package besicOfAutomationtesting;

import org.openqa.selenium.By;



import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebElements {

	public static void main(String[] args) {
		/* First invoke the webDriver to ChromeDriver
		 * */
		System.setProperty("webdriver.chrome.driver","C:\\Users\\DELL\\Music\\chromedriver.exe");
		
		/* WebDriver is a Interface contains
		 * @Sub Interface like (ImeHandler, Navigation, Option, TargetLocator, timeouts, Windows)	
		 *ChromeDriver() is a class 
		 **/
		WebDriver driver= new ChromeDriver();
		
		/* findElement()
		 * findElements():List<WebElement>
		 * get(String):void
		 * getCurrentUrl():String
		 * getPageSource():String
		 * getTitle():String
		 * getWindowHandle():String
		 * getWindowHandles():Set<String>
		 * manage():Option
		 * navigate():Navigation //subInterface Navigation
		 * quit():void
		 * SwitchTo():TargetLocator 
		 * are the methods of Interface WebDriver
		 * */
		driver.manage().window().maximize();
		/* fullscreen():void
		 * getPosition():Point
		 * getSize():Dimension
		 * maximize():void
		 * setPosition(Point):void
		 * setSize(Dimension):void
		 */
		
		driver.navigate().to("https://www.amazon.in");
		
		/*WebElement is Interface 
		 * */
		WebElement electronics= driver.findElement(By.xpath("//*[@id='nav-xshop']/a[6]"));
		
		electronics.click();
		
		
		
	}

}
