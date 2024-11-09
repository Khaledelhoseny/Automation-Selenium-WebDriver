package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import utils.MethodHandles;

public class FramesPage extends MethodHandles {

   public FramesPage(WebDriver driver){
       super(driver);
   }

    private final String frameId = "singleframe" ;
    private final By frameInput = By.xpath("(//input[@type = 'text'])") ;
    private final By iframeWithinAnIframe = By.linkText("Iframe with in an Iframe") ;

    public void insertTextInSingelIframe( String text ){
        switchToFrame(frameId);
        sendKeys(frameInput,4,text);
        switchToParent();
    }

    public void clickOnIframeWithinAnIframe(){
        click(iframeWithinAnIframe,5);
    }

    public void insertTextInNestedIframe( String text ){
        switchToFrame(1);
        switchToFrame(0);
        sendKeys(frameInput,4,text);
    }

}
