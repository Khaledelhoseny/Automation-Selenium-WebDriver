package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import utils.MethodHandles;

public class HomePage extends MethodHandles {

   public HomePage(WebDriver driver){
       super(driver);
   }

    private final By formAuthemticationLink = By.linkText("Form Authentication");

   public LoginPage clickFormAuthemticationLink(){
       click(formAuthemticationLink ,  5);
       return new LoginPage(driver) ;
   }


}