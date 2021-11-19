package org.repository;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import org.stepdefinition.CommonMethods;

public class LoginPageRepo {
	public LoginPageRepo() {
		PageFactory.initElements(CommonMethods.driver, this);
	}

	@FindBy(id = "email")
	private WebElement username;

	public WebElement getUsername() {
		return username;
	}

	@FindBy(id = "pass")
	private WebElement password;

	public WebElement getPassword() {
		return password;
	}
}
