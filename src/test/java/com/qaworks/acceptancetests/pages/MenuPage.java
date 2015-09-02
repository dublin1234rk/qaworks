package com.qaworks.acceptancetests.pages;

import static org.openqa.selenium.support.ui.ExpectedConditions.elementToBeClickable;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;

public class MenuPage extends PageObject{
	@FindBy(linkText = "Home")
	WebElementFacade home;

	@FindBy(linkText = "Services")
	WebElementFacade services;

	@FindBy(linkText = "Works")
	WebElementFacade works;

	@FindBy(linkText = "Technology")
	WebElementFacade technology;

	@FindBy(linkText = "Prices")
	WebElementFacade prices;

	@FindBy(linkText = "News")
	WebElementFacade news;

	@FindBy(linkText = "About")
	WebElementFacade about;

	@FindBy(linkText = "Contact")
	WebElementFacade contact;
	
	public void navigateToHomePage(){
		waitFor(elementToBeClickable(home));
		home.click();
	}
	
	
	public void navigateToContactUsPage(){
		waitFor(elementToBeClickable(contact));
		contact.click();
	}

}
