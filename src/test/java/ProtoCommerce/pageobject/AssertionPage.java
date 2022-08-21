package ProtoCommerce.pageobject;

import net.serenitybdd.core.pages.PageObject;
import net.thucydides.core.annotations.Step;
import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AssertionPage extends PageObject {
    WebDriver driver;
    @Step
    public void ApplicationTitle(){
        String ExpectedTitle = "ProtoCommerce";
        System.setProperty("webdriver.chrome.driver","src/test/resources/webdriver/chromedriver.exe");
        driver = new ChromeDriver();
        driver.get("https://rahulshettyacademy.com/angularpractice/");
        String ActualTitle = driver.getTitle();
        System.out.println("Title of Application is" + ActualTitle);
        Assert.assertEquals(ActualTitle, ExpectedTitle);
    }

    public void CloseApplication(){
        driver.quit();
    }

    public void DisableButton(){
        Boolean disableButton = driver.findElement(By.id("inlineRadio3")).isDisplayed();
        if (disableButton){
            System.out.println("Button Disable");
        } else {
            System.out.println("Button No Disable");

        }
    }

    public void clickButton (){
        driver.findElement(By.id("inlineRadio3")).click();
    }
}
