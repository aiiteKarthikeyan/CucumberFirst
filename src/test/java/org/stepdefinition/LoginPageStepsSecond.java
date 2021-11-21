package org.stepdefinition;

import java.util.List;
import java.util.Map;

import org.openqa.selenium.support.ui.WebDriverWait;

import org.repository.LoginPageRepo;

import com.sun.org.apache.xpath.internal.operations.String;

import cucumber.api.java.en.And;
import cucumber.api.java.en.But;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import io.cucumber.datatable.DataTable;

public class LoginPageStepsSecond {
	LoginPageRepo repo = new LoginPageRepo();
	WebDriverWait wait;

	@Given("^Open Facebook and launch the application$")
	public void open_facebook_and_launch_the_application(DataTable table2) {
 		Hook.driver.get("https://www.facebook.com");
		System.out.println("This step opens the facebook and launch the application.");
		System.out.println("This is the step to check GITHUB");
		
		Map<java.lang.String, java.lang.String> asMap = table2.asMap(java.lang.String.class, java.lang.String.class);
		System.out.println(asMap.get("BBB"));	
		
		
		System.out.println("This change should reflect in GIT");
		
	}

	@When("^Enter the Username and Password$")
	public void enter_the_Username_and_Password(DataTable table3) {
		System.out.println("This step enter the Username and Password on the login page.");
		Hook.type("karthikeyan", repo.getUsername());
		Hook.type("S", repo.getPassword());
		
		List<Map<java.lang.String, java.lang.String>> asMaps = table3.asMaps();
		System.out.println(asMaps.get(0).get("Password"));
		System.out.println(asMaps.get(1).get("Password"));
		System.out.println(asMaps.get(2).get("Password"));	
	}
	
	@And("Sample & annotation method")
	public void sample_and_annotation_method()
	{
		System.out.println("I have used And annotation in Cucumber");	
	}

	@Then("^Close the browser$")
	public void close_the_browser() {
		System.out.println("This step click on the Reset button.");
		Hook.driver.close();
	}
	
	@But("Sample conjuction annotation method")
	public void sample_but_annotation_method()
	{
		System.out.println("I have used But annotation in Cucumber");	
	}

}
