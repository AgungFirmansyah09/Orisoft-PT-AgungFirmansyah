package tasks;

import ProtoCommerce.pageobject.OpenHomePageObject;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;

public class clickOn {
    public static Performable CheckboxClick() {
        return Task.where("{0} click checkbox",
                Click.on(OpenHomePageObject.CHECKBOX_CLICK)
        );
    }

    public static Performable SelectOption() {
        return Task.where("{0} choose option Female",
                Click.on(OpenHomePageObject.SELECT_OPTION)
        );
    }

    public static Performable RadioButton() {
        return Task.where("{0} choose radio button",
                Click.on(OpenHomePageObject.RADIO_BUTTON)
        );
    }

    public static Performable SelectDate() {
        return Task.where("{0} choose date",
                Click.on(OpenHomePageObject.SELECT_DATE)
        );
    }

    public static Performable SaveButton() {
        return Task.where("{0} Save Button",
                Click.on(OpenHomePageObject.SAVE_BUTTON)
        );
    }
}
