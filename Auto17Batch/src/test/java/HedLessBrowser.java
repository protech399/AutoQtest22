import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class HedLessBrowser {
		
	public static void main(String[] args) {
		
		ChromeOptions co = new ChromeOptions();
		co.setHeadless(true);	// used for without launch browser
		
		WebDriver driver = WebDriverManager.chromedriver().capabilities(co).create();
		driver.get("https://www.google.com");
		System.out.println(driver.getTitle());
		System.out.println(driver.getCurrentUrl());
		System.out.println(driver.getWindowHandle());
//		System.out.println(driver.getPageSource());
		driver.quit();
		
		
//		out put is "Google",	"https://www.google.com/", "CDwindow-F512C1950A36FF325A83C19C69F77F6B"
	}
}
