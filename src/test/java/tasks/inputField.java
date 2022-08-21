package tasks;

import ProtoCommerce.pageobject.OpenHomePageObject;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.targets.Target;

public class inputField {
    public static Performable InputText(String credType, String credential) throws Exception{
        Target field;

        switch (credType){
            case "Nama":
                field = OpenHomePageObject.NAMA_FIELD;
                break;
            case "Email":
                field = OpenHomePageObject.EMAIL_FIELD;
                break;
            case "Password":
                field = OpenHomePageObject.PASSWORD_FIELD;
                break;
            case "Date input":
                field = OpenHomePageObject.DATE_INPUT;
                break;
            default:
                throw new Exception("There is no credential type" + credType);
        }
        return Task.where("{0} input credential: '"+ credential +"'",
                Enter.theValue(credential)
                .into(field));
    }
}
