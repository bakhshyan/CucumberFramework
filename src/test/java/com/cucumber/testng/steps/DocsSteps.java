package com.cucumber.testng.steps;

import com.cucumber.testng.pages.DocsPage;
import io.cucumber.java.en.Then;
import org.assertj.core.api.Assertions;
import org.openqa.selenium.WebElement;

import java.util.List;

public class DocsSteps {

    private DocsPage docsPage = new DocsPage();

    @Then("there are {int} items in the left-side menu")
    public void verifyLeftSideMenuSize(int expectedSize) {

        Assertions.assertThat(docsPage.getMenuItemTitles()).
                as("The left-side menu size is as expected").hasSize(expectedSize);
    }

    @Then("left-side menu contain the following links")
    public void verifyLeftSideMenuContainTheFollowingLinks(List<String> expectedTitles) {
        Assertions.assertThat(docsPage.getMenuItemTitles())
                .extracting(WebElement::getText)
                .as("Some of the left-side menu items are not as expecred")
                .containsAll(expectedTitles);
    }
}
