package com.cucumber.testng.steps;

import com.cucumber.testng.pages.DocsPage;
import com.cucumber.testng.pages.HomePage;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.assertj.core.api.Assertions;

public class MenuSteps {

    private HomePage homePage = new HomePage();
    private DocsPage docsPage = new DocsPage();


    @When("the user opens Cucumber website")
    public void openCucumberWebsite() {
        homePage.openCucumberWebsite();
    }

    @When("the user clicks on the {string} section")
    public void clickOnTheSection(String section) {
        homePage.menuSection(section).click();

    }

    @When("the user click on the {string} item")
    public void clickOnTheItem(String item) {
        homePage.childMenuItem(item).click();

    }

    @Then("page with title {string} is displayed")
    public void verifyPageTitleIsDisplayed(String pageTitle) {
        Assertions.assertThat(docsPage.isPageWithTitleDisplayed(pageTitle)).overridingErrorMessage("Page with %s is not displayed", pageTitle).
                isTrue();


    }
}
