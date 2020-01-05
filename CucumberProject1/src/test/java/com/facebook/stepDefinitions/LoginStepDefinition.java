package com.facebook.stepDefinitions;

import com.facebook.PageObjects.LoginPageObject;

import cucumber.api.PendingException;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class LoginStepDefinition extends LoginPageObject{

	LoginPageObject lpo = new LoginPageObject();
	@Given("^I am a user of facebook application$")
	public void i_am_a_user_of_facebook_application(){
	    lpo.openurl();
	   // throw new PendingException();
	    //hi
	    
	}

	@When("^I enter valid username$")
	public void i_enter_valid_username() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    throw new PendingException();
	}

	@When("^I enter valid pasword$")
	public void i_enter_valid_pasword() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    throw new PendingException();
	}

	@When("^I click on ogin button$")
	public void i_click_on_ogin_button() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    throw new PendingException();
	}

	@Then("^User should be able to Login successfully$")
	public void user_should_be_able_to_Login_successfully() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    throw new PendingException();
	}

	@Given("^I am a user of Facebook application$")
	public void i_am_a_user_of_Facebook_application() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    throw new PendingException();
	}

	@When("^I enter First name$")
	public void i_enter_First_name() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    throw new PendingException();
	}


	
}
