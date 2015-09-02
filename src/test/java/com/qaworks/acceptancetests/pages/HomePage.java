package com.qaworks.acceptancetests.pages;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;
import net.thucydides.core.annotations.DefaultUrl;

@DefaultUrl("http://www.qaworks.com/")
public class HomePage extends PageObject {

	@FindBy(xpath = "//*[@id='AboutUsHeaderDesc']/h1")
	WebElementFacade welcomeMessage;

	public String getWelcomeMessage() {
		return welcomeMessage.getText();

	}

}
