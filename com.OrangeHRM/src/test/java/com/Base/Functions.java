package com.Base;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Functions extends SetUp{
	public static void wait(int ele)
	{
		try {
			Thread.sleep(ele);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public static void click(WebElement ele)
	{
		ele.click();
	}
	public static void sendkeys(WebElement ele,String value)
	{
		ele.sendKeys(value);
	}
	public static void Dropdown(WebElement ele,String value)
	{
		Select se=new Select(ele);
		se.selectByVisibleText(value);
		//se.selectByValue(value);
	}
	
	

	// explicitly wait
	public static WebElement waitForElement(By ele) {

		WebElement element = null;
		WebDriverWait wait = new WebDriverWait(driver, 50);

		try {
			element = wait.until(ExpectedConditions.presenceOfElementLocated(ele));
			element = wait.until(ExpectedConditions.visibilityOfElementLocated(ele));
			

		} catch (Exception e) {
			e.printStackTrace();
			

		}

		return element;

	}

	// get element using xpath or other locators
	public static WebElement getWebElement(String locator, String value) {
		WebDriverWait wait = new WebDriverWait(driver, 20);
		WebElement webElement = null;
		switch (locator) {
		case "ID":
			webElement = wait.until(ExpectedConditions.visibilityOfElementLocated(By.id(value)));
		case "CLASSNAME":

			webElement = wait.until(ExpectedConditions.visibilityOfElementLocated(By.className(value)));
		case "NAME":
			webElement = wait.until(ExpectedConditions.visibilityOfElementLocated(By.name(value)));

		case "XPATH":
			webElement = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(value)));

		case "CSS":
			webElement = wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector(value)));
		case "LINKTEXT":
			webElement = wait.until(ExpectedConditions.visibilityOfElementLocated(By.linkText(value)));
		case "TAGNAME":
			webElement = wait.until(ExpectedConditions.visibilityOfElementLocated(By.tagName(value)));
		case "PARTIALLINKTEXT":
			webElement = wait.until(ExpectedConditions.visibilityOfElementLocated(By.partialLinkText(value)));
		default:
			webElement = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(value)));

		}

		return webElement;
	}
	
}
