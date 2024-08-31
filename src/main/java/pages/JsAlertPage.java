package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import utils.MethodHandles;

public class JsAlertPage extends MethodHandles {
    public JsAlertPage (WebDriver driver){
        super(driver);
    }
    private final By jsAlertButton = By.xpath("//button[ contains ( text()  , 'Alert' ) ]");
    private final By validationMessage = By.id("result");
    private final By jsConfirmButton = By.xpath("//button[ contains ( text()  , 'Confirm' ) ]");
    private final By jsPropmptButton = By.xpath("//button[contains( text()  , 'Prompt' ) ] ");

    public void clickOnJsAlertButton (){
        click(jsAlertButton , 5);
        System.out.println("Clicked");
    }

    public void acceptAlert(){
        acceptJsAlert();
    }

    public String getValidationMessage(){
        return getText(validationMessage) ;
    }
    ////////////////////////////////////////////////////////////////////////////////////
    public void clickOnJsConfirmButton (){
        click(jsConfirmButton,5);
    }
    public void dismissAlert(){
        dismissJsAlert();
    }
    ////////////////////////////////////////////////////////////////////////////////////

    public void clickOnJsPropmpt(){
        click(jsPropmptButton , 5 );
    }
    public void insertJsPrompt(String text){
        insertToJsAlert(text);
    }





}
