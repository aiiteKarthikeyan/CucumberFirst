package org.stepdefinition;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.After;
import cucumber.api.java.Before;
import io.github.bonigarcia.wdm.WebDriverManager;

public class CommonMethods {
	public static WebDriver driver = null;

	@Before
	public static WebDriver openBrowser() {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		return driver;
	}

	public static void btclick(WebElement element) {
		element.click();
	}

	public static void type(String data, WebElement element) {
		element.sendKeys(data);
	}

	@After
	public static void close() {
		// dr.close();
	}
}
