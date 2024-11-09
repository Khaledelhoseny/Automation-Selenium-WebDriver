package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import utils.MethodHandles;

import java.time.Duration;

public class ExampleTwoPage extends MethodHandles {
    WebDriverWait wait ;
    public ExampleTwoPage(WebDriver driver) {
        super(driver);
    }


    private final By startButton = By.cssSelector("#start > button") ;
    private final By helloWorldMessage = By.cssSelector("#finish > h4") ;
    private final By loading = By.xpath("//div[@id='loading']");

    public void clickOnStartButton(){
        click(startButton,5);
    }
    public String getHelloWorldMessage(){
       inVisabilityOfElement(loading,3);
       return driver.findElement(helloWorldMessage).getText() ;
    }

}
