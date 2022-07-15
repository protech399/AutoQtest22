package ScreanShot;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ScreanShot {
	static	WebDriver driver;
	public static void main(String[] args) throws IOException {
		WebDriverManager.chromedriver().setup();
		
		driver = new ChromeDriver();
		
		driver.get("http://demo.automationtesting.in/Register.html");
		
		
		
		
		String act = driver.getTitle();
		System.out.println(act);
		
		String exp = "Register1";
		
		if(act.equals(exp)) {
			System.out.println(" GetTitle TC Pass");
		}else {
			System.out.println("GetTitle TC Fail, Check ScreanShot");
			
			TakesScreenshot t= (TakesScreenshot)driver;	//typeCasting
			
			File source = t.getScreenshotAs(OutputType.FILE);
			File target = new File("C:/Users/DELL/eclipse-workspace/AutoQtest/Faild TC/"+"getTitle.jpeg");
			
			FileHandler.copy(source, target);
			
			driver.quit();
		}
		
	}

}
