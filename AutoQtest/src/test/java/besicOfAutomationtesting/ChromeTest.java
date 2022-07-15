package besicOfAutomationtesting;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ChromeTest {

	public static void main(String[] args) {
			System.setProperty("webdriver.chrome.driver","C:\\Users\\DELL\\Music\\chromedriver.exe");
			WebDriver driver=new ChromeDriver();
			driver.get("http://demo.automationtesting.in/Register.html");
		String act_title=driver.getTitle();
		System.out.println(act_title);
		String exp_title="Register";
		
		if(act_title.equals(exp_title)) {
			System.out.println("Pass TC");
		}else {System.out.println("Fail TC");}
		
	}

}
