package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import utils.MethodHandles;


public class NestedFramePage extends MethodHandles {
    public NestedFramePage(WebDriver driver) {
        super(driver);
    }

    public final String frameTop = "frame-top";
    public final String frameLeft = "frame-left" ;
    public final String frameBottom = "frame-bottom" ;

    public final By leftText = By.xpath("//*[ contains(text(),'LEFT')]");
    public final By bottomText = By.xpath("//*[ contains(text(),'BOTTOM')]");


    public String getLeftText(){
        switchToFrame(frameTop);
        switchToFrame(frameLeft);
        return getText(leftText , 5) ;
    }

    public String getBottomText(){
        driver.switchTo().defaultContent();
        switchToFrame(frameBottom);
        return getText(bottomText , 5) ;
    }
}
