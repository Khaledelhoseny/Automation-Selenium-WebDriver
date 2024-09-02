package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import utils.MethodHandles;

import java.time.Duration;

public class ExampleOnePage extends MethodHandles {
    public ExampleOnePage(WebDriver driver) {
        super(driver);
    }


    private final By startButton = By.cssSelector("#start > button") ;
    private final By helloWorldMessage = By.cssSelector("#finish > h4") ;
    public void clickOnStartButton(){
        click(startButton,5);
    }
    public String getHelloWorldMessage(){

        return  getText(helloWorldMessage, 5 );
    }


}
