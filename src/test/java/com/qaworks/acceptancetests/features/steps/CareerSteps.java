package com.qaworks.acceptancetests.features.steps;

import java.util.List;

import com.qaworks.acceptancetests.features.steps.serenity.UserCareerSteps;

import cucumber.api.java.en.Then;
import net.thucydides.core.annotations.Steps;

public class CareerSteps {

	@Steps
	UserCareerSteps user;
	
	@Then("^I should see the following tabs$")
	public void i_should_see_the_following_tabs(List<String> tabs) throws Throwable {

	}
	
}
