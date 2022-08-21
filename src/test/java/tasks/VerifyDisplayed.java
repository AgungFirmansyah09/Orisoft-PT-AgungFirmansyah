package tasks;

import ProtoCommerce.pageobject.OpenHomePageObject;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.ensure.Ensure;
import net.serenitybdd.screenplay.targets.Target;
import net.serenitybdd.screenplay.waits.WaitUntil;

import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isVisible;

public class VerifyDisplayed {
        public static Performable element(String elementType) throws Exception{
            Target element;
            switch (elementType){
                case "Success Notification":
                    element = OpenHomePageObject.SUCCESS_NOTIF;
                    break;
                case "Error Message":
                    element = OpenHomePageObject.ERROR_MESSAGE;
                    break;
                default:
                    throw new Exception("There is no element type" + elementType);
            }

            WaitUntil.the(element, isVisible()).forNoMoreThan(25).seconds();

            return Task.where("{0} verify Element is Displayed",
                    Ensure.that(element)
                    .isDisplayed());
        }
}
