package besicOfAutomationtesting;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.grid.node.locators.ById;

public class EdgeFacebook {

	public static void main(String[] args) {
		System.setProperty("webdriver.edge.driver", "C:\\Users\\DELL\\eclipse-workspace\\javatestmay\\Automation_Jar\\msedgedriver.exe");
		WebDriver driver=new EdgeDriver();
//		driver.manage().window().maximize();
		driver.get("https://www.facebook.com");
//		driver.findElement(By.name("email")).sendKeys("prafullpatil1213@gmail.com");
//		driver.findElement(By.name("pass")).sendKeys("sasbvc");
//		driver.findElement(By.xpath("//*[@id=\"u_0_5_bn\"]")).click();
//		driver.findElement(By.xpath("//*[@id=\"u_0_2_AG\"]/div[3]/a")).click();
		
//		WebElement CreateApage=driver.findElement(By.linkText("Create a Page"));
//		CreateApage.click();
		
		WebElement Forgottenpassword=driver.findElement(By.partialLinkText("otten pass"));
		Forgottenpassword.click();
	}
	

}
