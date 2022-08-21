package ProtoCommerce.stepdefinitions;

import ProtoCommerce.pageobject.AssertionPage;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.serenitybdd.core.pages.PageObject;
import net.thucydides.core.annotations.Steps;

public class AssertionStepdefs {
    @Steps
    AssertionPage assertionPage;

    @Given("User Open Web page ProtoCommerce")
    public void userOpenWebPageProtoCommerce() {
        assertionPage.ApplicationTitle();

    }

    @When("User Validation title")
    public void validationTitle() {

    }

    @Then("user can view title")
    public void userCanViewTitle() {
        assertionPage.CloseApplication();
    }

    @When("User view Disable button")
    public void userViewDisableButton() {
        assertionPage.DisableButton();
    }

    @Then("user can't click disable button")
    public void userCanTClickDisableButton() {
        assertionPage.clickButton();
        assertionPage.CloseApplication();
    }
}
