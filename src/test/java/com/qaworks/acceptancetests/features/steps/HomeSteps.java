package com.qaworks.acceptancetests.features.steps;

import com.qaworks.acceptancetests.features.steps.serenity.UserHomeSteps;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.thucydides.core.annotations.Steps;

public class HomeSteps {

	@Steps 
	UserHomeSteps user;
	
	@Given("^I am an end user$")
	public void i_am_an_end_user() throws Throwable {
		
	}

	@When("^I navigate to QAWorks site$")
	public void i_navigate_to_QAWorks_site() throws Throwable {
	   user.navigateToQAWorksSite();
	}

	@Then("^I should see (.*) message$")
	public void i_should_see_message(String welcomeMessage) throws Throwable {
	    user.shouldSeeWelcomeMessage(welcomeMessage);
	}
}
