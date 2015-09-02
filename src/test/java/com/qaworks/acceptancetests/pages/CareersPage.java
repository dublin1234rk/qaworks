package com.qaworks.acceptancetests.pages;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.WebElementFacade;

public class CareersPage {

	@FindBy(linkText="Jobs")
	WebElementFacade jobs;
	
	@FindBy(linkText="Back to Website")
	WebElementFacade backToWebsite;
	
	@FindBy(linkText="Register")
	WebElementFacade register;
	
	@FindBy(linkText="Log In")
	WebElementFacade logIn;
	
	
}
