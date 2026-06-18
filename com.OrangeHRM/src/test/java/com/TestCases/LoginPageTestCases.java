package com.TestCases;

import org.testng.annotations.Test;

import com.Base.SetUp;
import com.Pages.DashbordPage;
import com.Pages.LoginPage;

public class LoginPageTestCases extends SetUp{

	@Test(priority = 1)
	public static void TC_001()
	{
		LounchBrowser("chrome");
		LoginPage.sendUserName("Admin");
		
	}
	@Test(priority = 2)
	public static void TC_002()
	{
		LoginPage.sendPassword("admin123");
	}
	@Test(priority = 3)
	public static void TC_003()
	{
		LoginPage.clickLoginBtn();
		
	}
	@Test(priority = 4)
	public static void TC_004()
	{
		DashbordPage.TestDashbord("Dashboard");
		
	}
	
}
