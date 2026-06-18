package com.Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import com.Base.Functions;
import com.Base.SetUp;

public class LoginPage extends SetUp{
	public static WebDriver driver;
	

	private static By username=By.xpath("//input[@name='username']");
	private static By password=By.xpath("//input[@name='password']");
	private static By loginBtn=By.xpath("//button[text()=' Login ']");
	
	public LoginPage(WebDriver driver)
	{
		//this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	public static void sendUserName(String value)
	{
		Functions.wait(5000);
		Functions.sendkeys(Functions.waitForElement(username), value);
	}
	public static void sendPassword(String value)
	{
		Functions.wait(5000);
		Functions.sendkeys(Functions.waitForElement(password), value);
	}
	public static void clickLoginBtn()
	{
		Functions.wait(5000);
		Functions.click(Functions.waitForElement(loginBtn));
	}
	
}
