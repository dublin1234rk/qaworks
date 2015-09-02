package com.qaworks.acceptancetests.features.steps.serenity;

import com.qaworks.acceptancetests.pages.HomePage;

import net.thucydides.core.annotations.Step;
import static org.assertj.core.api.Assertions.assertThat;

public class UserHomeSteps {

	HomePage homePage;

	@Step
	public void navigateToQAWorksSite() {
		homePage.open();
	}

	@Step
	public void shouldSeeWelcomeMessage(String welcomeMessage) {
		assertThat(homePage.getWelcomeMessage()).isEqualTo(welcomeMessage);
	}

}
