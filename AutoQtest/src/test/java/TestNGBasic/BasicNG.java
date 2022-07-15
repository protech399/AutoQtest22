package TestNGBasic;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class BasicNG {
	
	
	@BeforeTest
	public void setup() {
		System.out.println("SetUp");
	}
	
	@BeforeClass
	public void Browser() {
		System.out.println("Launch Chrome");
	}
	
	@BeforeMethod
	public void url() {
		System.out.println("Launch URL");
	}
	
	@BeforeTest
	public void login() {
		System.out.println("Gmail Login");
	}
	
	
	@Test(description = "LogIn", priority = 1, groups = {"Regresion","Smoke","Sanity"})
	public void test1() {
		System.out.println("Test1");
	}
	
	@Test(priority = 3, groups = {"Regresion"})	
	public void test2() {
		System.out.println("Test2");
	}
	
	@Test(priority = 5, groups = {"Regresion","Sanity"})
	public void test3() {
		System.out.println("Test3");
	}
	
	@Test(groups = {"Regresion", "Smoke"})	
	public void test4() {
		System.out.println("Test4");
	}
	
	@Test(groups = {"Regresion"})
	public void test5() {
		System.out.println("Test5");
	}
	
	@Test(description = "LogOut", priority = 4, enabled = false, groups = {"Regresion"})	// coz of enabled = flase only one case'll execute
	public void test6() {
		System.out.println("Test6");
	}
	
	@Test(groups = {"Regresion","Smoke"})
	public void test7() {
		System.out.println("Test7");
	}
	
	@Test(priority = 2, groups = {"Regresion", "Sanity"})	
	public void test8() {
		System.out.println("Test8");
	}
	
	@AfterTest
	public void logout() {
		System.out.println("GmailLogout");
	}
	
	@AfterMethod
	public void closeTab() {
		System.out.println("Close TAB");
	}
	
	@AfterClass
	public void CloseDriver() {
		System.out.println("CloseCoockies");
	}
	
	
	@AfterSuite
	public void report() {
		System.out.println("Generate Report");
	}
	
	
	
}
