package tasks;

import ProtoCommerce.pageobject.OpenHomePageObject;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Open;


public class NavigateTo extends PageObject {

    public static Performable theURL (String urlType) throws Exception {
        Class url;
        switch (urlType){
            case "Open Home Page" :
                url = OpenHomePageObject.class;
                break;
            default:
                throw new Exception("Url is available" + urlType);
        }

        return Task.where ("{0} access the home page",
        Open.browserOn().the(url));
    }
}
