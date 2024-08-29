package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import utils.MethodHandles;

public class LoginPage extends MethodHandles {
    public LoginPage(WebDriver driver) {
        super(driver);
    }

    private final By userNameField = By.id("username") ;
    private final By passwordField = By.id("password") ;
    private final By logineButton =  By.className("radius") ;


    public void insertUserName(String text ){
        sendKeys(userNameField, 5 , text );
    }

    public void insertPassword(String text){
        sendKeys(passwordField, 5 , text );
    }

    public void clickOnLogin(){
        click(logineButton,5);
    }

    public SecureAreaPage loginFeature(String username , String password){
        insertUserName(username);
        insertPassword(password);
        clickOnLogin();
        return new SecureAreaPage(driver);
    }

}
