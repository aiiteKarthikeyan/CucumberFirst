package org.stepdefinition;

import org.junit.Assert;
import org.openqa.selenium.support.ui.WebDriverWait;

import org.repository.LoginPageRepo;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class LoginPageStepsSecond {
	LoginPageRepo repo = new LoginPageRepo();
	WebDriverWait wait;

	@Given("^Open Facebook and launch the application$")
	public void open_facebook_and_launch_the_application() {
 		CommonMethods.driver.get("https://www.facebook.com");
		System.out.println("This step opens the facebook and launch the application.");
	}

	@When("^Enter the Username and Password$")
	public void enter_the_Username_and_Password() {
		System.out.println("This step enter the Username and Password on the login page.");
		CommonMethods.type("karthikeyan", repo.getUsername());
		CommonMethods.type("S", repo.getPassword());
	}

	@Then("^Close the browser$")
	public void close_the_browser() {
		System.out.println("This step click on the Reset button.");
		CommonMethods.driver.close();
	}

}
