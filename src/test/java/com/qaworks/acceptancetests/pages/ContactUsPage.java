package com.qaworks.acceptancetests.pages;

import com.qaworks.acceptancetests.model.Contact;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;

public class ContactUsPage extends PageObject {

	@FindBy(id = "ctl00_MainContent_NameBox")
	WebElementFacade name;

	@FindBy(id = "ctl00_MainContent_EmailBox")
	WebElementFacade email;

	@FindBy(id = "ctl00_MainContent_MessageBox")
	WebElementFacade message;

	@FindBy(name = "ctl00$MainContent$SendButton")
	WebElementFacade send;

	@FindBy(linkText = "Check out our current vacancies")
	WebElementFacade careers;

	public void contactQaWorks(Contact contact) {
		name.typeAndTab(contact.getName());
		email.typeAndTab(contact.getEmail());
		message.typeAndTab(contact.getMessage());
		send.click();
	}

	public String getName() {
		 waitABit(3000);
		return name.getText();
	}

	public void navigateToCareers() {
		careers.click();
	}

}
