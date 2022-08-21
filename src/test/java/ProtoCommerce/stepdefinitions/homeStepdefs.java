package ProtoCommerce.stepdefinitions;

import ProtoCommerce.pageobject.OpenHomePageObject;
import io.cucumber.java.en.*;
import io.cucumber.java.en_old.Ac;
import io.github.cdimascio.dotenv.Dotenv;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.Actor;
import org.junit.Assert;
import tasks.*;

public class homeStepdefs {

    @Given("{actor} Open Web ProtoCommerce")
    public void OpenPage(Actor actor) throws Exception {
       actor.wasAbleTo(NavigateTo.theURL("Open Home Page"));

    }

    @When("{actor} Input Name Field Correctly")
    public void InputNameFieldCorrectly(Actor actor) throws Exception {
        Dotenv dotenv = Dotenv.load();
        String nama = dotenv.get("NAMA_FIELD");

        actor.attemptsTo(
                inputField.InputText("Nama", nama)
        );
    }

    @And("{actor} Input Email Field Correctly")
    public void InputEmailFieldCorrectly(Actor actor) throws Exception {
        Dotenv dotenv = Dotenv.load();
        String email = dotenv.get("EMAIL_FIELD");

        actor.attemptsTo(
                inputField.InputText("Email", email)
        );
    }

    @And("{actor} Input Password Field Correctly")
    public void InputPasswordFieldCorrectly(Actor actor) throws Exception {
        Dotenv dotenv = Dotenv.load();
        String password = dotenv.get("PASSWORD_FIELD");

        actor.attemptsTo(
                inputField.InputText("Password", password)
        );
    }

    @And("{actor} Click CheckBox")
    public void ClickCheckBox(Actor actor) throws Exception {
        actor.attemptsTo(
                clickOn.CheckboxClick()
        );
    }

    @And("{actor} Choose Gender")
    public void ChooseGender(Actor actor) throws Exception {
        actor.attemptsTo(
                clickOn.SelectOption()
        );
    }

    @And("{actor} Choose Status Employee")
    public void ChooseStatusEmployee(Actor actor) throws Exception {
        actor.attemptsTo(
                clickOn.RadioButton()
        );
    }

    @And("{actor} Choose Date of Birth")
    public void ChooseDateOfBirth(Actor actor) throws Exception {
        Dotenv dotenv = Dotenv.load();
        String date = dotenv.get("DATE_INPUT");

        actor.attemptsTo(
                clickOn.SelectDate(),
                inputField.InputText("Date input", date)
        );
    }

    @And("{actor} Click Button Save")
    public void ClickButtonSave(Actor actor) throws Exception {
        actor.attemptsTo(
                clickOn.SaveButton()
        );
    }

    @Then("{actor} View alert successfully save data")
    public void ViewAlertSuccessfullySaveData(Actor actor) throws Exception  {
        actor.attemptsTo(VerifyDisplayed.element("Success Notification"));
    }

    @When("User no Input data Available")
    public void userNoInputDataAvailable() {
    }

    @Then("{actor} View alert data no saved please check your field")
    public void ViewAlertDataNoSavedPleaseCheckYourField(Actor actor) throws Exception {
        actor.attemptsTo(VerifyDisplayed.element("Error Message"));
    }


}
