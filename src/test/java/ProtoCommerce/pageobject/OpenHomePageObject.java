package ProtoCommerce.pageobject;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;
import net.thucydides.core.annotations.DefaultUrl;
import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

@DefaultUrl("https://rahulshettyacademy.com/angularpractice/")
public class OpenHomePageObject extends PageObject {

    public static Target NAMA_FIELD = Target.the("Nama field")
            .locatedBy("//input[@name='name']");

    public static Target EMAIL_FIELD = Target.the("Email field")
            .locatedBy("//input[@name='email']");

    public static Target PASSWORD_FIELD = Target.the("Password field")
            .locatedBy("#exampleInputPassword1");

    //    Click Functionality
    public static Target CHECKBOX_CLICK = Target.the("Click CheckBox")
            .locatedBy("#exampleCheck1");

    public static Target SELECT_OPTION = Target.the("Choose Option")
            .locatedBy("//option[text()='Female']");

    public static Target RADIO_BUTTON = Target.the("Choose Radio Button")
            .locatedBy("#inlineRadio2");

    public static Target SELECT_DATE = Target.the("Select Date")
            .locatedBy("//input[@name='bday']");

    public static Target DATE_INPUT = Target.the("Input Date")
            .locatedBy("//input[@name='bday']");

    public static Target SAVE_BUTTON = Target.the("Save Button")
            .locatedBy("//input[@value='Submit']");

    //    Notification View
    public static Target SUCCESS_NOTIF = Target.the("Success Notification")
            .locatedBy("//Strong[text()='Success!']");

    public static Target ERROR_MESSAGE = Target.the("Required")
            .locatedBy("//*[text()='Name is required']");

}
