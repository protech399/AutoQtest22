package Assertt;

import java.util.concurrent.TimeUnit;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.Assert;
import org.testng.asserts.SoftAssert;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Assertion {

	public static void main(String[] args) {
		
//		ChromeOptions op= new ChromeOptions();
//		op.setHeadless(true);
		
		WebDriver driver= WebDriverManager.chromedriver().create();
		
		driver.get("https://www.google.com");
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.MILLISECONDS);
		System.out.println("Step1");
		String title= driver.getTitle();
		String expe= "Goog";
//		Assert.assertEquals(title, expe);
		System.out.println("Step2");
		SoftAssert sa= new SoftAssert();
		sa.assertEquals(title, expe);
		System.out.println("Step3");
		System.out.println("Step4");
		
	}

}
