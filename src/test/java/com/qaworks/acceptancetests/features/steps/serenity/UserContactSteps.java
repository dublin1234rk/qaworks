package com.qaworks.acceptancetests.features.steps.serenity;

import static org.assertj.core.api.Assertions.assertThat;

import java.util.List;

import com.qaworks.acceptancetests.model.Contact;
import com.qaworks.acceptancetests.pages.ContactUsPage;
import com.qaworks.acceptancetests.pages.MenuPage;

import net.thucydides.core.annotations.Step;

public class UserContactSteps {
	ContactUsPage contactUsPage;
	MenuPage menuPage;

	@Step
	public void want_to_know_more_about_qa_works() {
		menuPage.navigateToContactUsPage();
	}

	@Step
	public void should_contact_QAWorks(Contact contact) {
		contactUsPage.contactQaWorks(contact);
		// Here we should be really verifying the Thank you message from
		// QAWorks. But there is no message displayed after contact form
		// submitted
		assertThat(contactUsPage.getName()).isEmpty();
	}

	public void navigate_to_careers_section() {
		contactUsPage.navigateToCareers();		
	}
}
