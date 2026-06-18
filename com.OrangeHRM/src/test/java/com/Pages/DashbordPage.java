package com.Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import com.Base.Functions;
import com.Base.SetUp;

public class DashbordPage extends SetUp{
	public static WebDriver driver;
	 private static By dash=By.xpath("//h6[normalize-space()='Dashboard']");
	 
	 public DashbordPage(WebDriver driver)
	 {
		 PageFactory.initElements(driver, this);
	 }
	 
	 public static void TestDashbord(String value)
	 {
		 Functions.wait(2000);
		 Functions.verifyText(Functions.waitForElement(dash), value);
		 
	 }
	

}
