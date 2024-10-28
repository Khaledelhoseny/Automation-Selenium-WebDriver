package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import utils.MethodHandles;

public class AutomationPracticeLoginPage extends MethodHandles {


    public AutomationPracticeLoginPage (WebDriver driver){
        super(driver);
    }

    private final By emailAddressInput = By.id("email_create") ;
    private final By createAccountButton = By.id("SubmitCreate");

    public void insertInEmailAddressInput(String text){
        sendKeys(emailAddressInput , 5 ,text);
    }
    public void clickOnCreateAccountButton(){
        click(createAccountButton, 5);
    }
}
