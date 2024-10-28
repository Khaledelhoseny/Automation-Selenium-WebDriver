package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import utils.MethodHandles;

import java.rmi.MarshalException;

public class ReflectSignUpPage extends MethodHandles {
    public ReflectSignUpPage (WebDriver driver){
        super(driver);
    }

    private final By inputField = By.cssSelector("input.input-field") ;

    public void insetFisrtName(String text){
        WebElement firstName =  driver.findElements(inputField).get(0);
        firstName.sendKeys(text);
    }

}
