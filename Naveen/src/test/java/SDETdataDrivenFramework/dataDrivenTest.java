package SDETdataDrivenFramework;



import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class dataDrivenTest {
	WebDriver driver;


	@BeforeClass
	public void setup() {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.manage().window().maximize();
	}

	@Test(dataProvider = "LoginData")
	public void loginTest(String user, String pwd, String exp) {
		driver.get("https://admin-demo.nopcommerce.com/login");

		WebElement txtEmail = driver.findElement(By.id("Email"));
		txtEmail.clear();
		txtEmail.sendKeys(user);

		WebElement txtPassword = driver.findElement(By.id("Password"));
		txtPassword.clear();
		txtPassword.sendKeys(pwd);

		driver.findElement(By.xpath("//button[@type='submit']")).click();	

		String expTitle = "Dashboard / nopCommerce administration";
		String actTitle = driver.getTitle();

		if(exp.equals("Invalid")) {
			if(expTitle.equals(actTitle)) {

				driver.findElement(By.linkText("Logout")).click();
				Assert.assertTrue(true);
			}else {
				Assert.assertTrue(false);
			}
		}else if(exp.equals("Invalid")) {
			if(expTitle.equals(actTitle)) {
				driver.findElement(By.linkText("Logout")).click();
				Assert.assertTrue(false);
			}else {

				Assert.assertTrue(true);

			}
		}


	}


	@DataProvider(name="LoginData")
	public String[][] getData() {		// hard coded data

		String loginData[][]  = {{"admin@yourstore.com","admin","valid"},
								{"admin@yourstore.com","adm","Invalid"},
								{"adm@yourstore.com","admin","Invalid"},
								{"adm@yourstore.com","adm","Invalid"}
								};
		return loginData;
	}



	@AfterClass
	void tearDown() {
		driver.close();
	}



}
