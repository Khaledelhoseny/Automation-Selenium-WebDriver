package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import utils.MethodHandles;

import java.time.Duration;

public class EntryAdPage extends MethodHandles {
    public EntryAdPage(WebDriver driver) {
        super(driver);
    }
    private final By clickHereLink = By.linkText("click here") ;
    private final By closeButton = By.cssSelector(".modal-footer > p") ;
//    public void dismissModalFirstTime(){
//
//    }
    public void dismissModalWindow(){
        click(closeButton, 5);
        System.out.println("dismiss for first time open");
        for (int i = 0 ; i<10 ; i++ ){
            click(clickHereLink , 5);
            try {
                click(closeButton, 5);
                System.out.println("Element found: " + getText(closeButton , 5));
                break;
            }catch (Exception e){
                System.out.println("Element not found");
            }
        }
    }
}
