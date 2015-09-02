package com.qaworks.acceptancetests.features.steps;

import java.util.List;

import com.qaworks.acceptancetests.features.steps.serenity.UserContactSteps;
import com.qaworks.acceptancetests.model.Contact;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.thucydides.core.annotations.Steps;

public class ContactSteps {

	@Steps
	UserContactSteps user;
	
	@Given("^I am on the QAWorks site$")
	public void i_am_on_the_QAWorks_site() throws Throwable {

	}

	@When("^I want to know more about QAWorks exciting services$")
	public void i_want_to_know_more_about_QAWorks_exciting_services() throws Throwable {
		user.want_to_know_more_about_qa_works();
	}

	@Then("^I should be able to contact QAWorks with the following information$")
	public void i_should_be_able_to_contact_QAWorks_with_the_following_information(List<Contact> contactUs) throws Throwable {
	   Contact contact = contactUs.get(0);
	   user.should_contact_QAWorks(contact);	  
	}
	
	@When("^I navigate to Careers section$")
	public void i_navigate_to_Careers_section() throws Throwable {
	    user.navigate_to_careers_section();
	}

}
