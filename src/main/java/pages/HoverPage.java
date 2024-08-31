package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import utils.MethodHandles;

public class HoverPage extends MethodHandles {
    public HoverPage(WebDriver driver){
        super(driver);
    }

    private final By figure = By.cssSelector(".figure") ;
    private final By figureCaption = By.cssSelector(".figcaption") ;
    private final By username = By.tagName("h5") ;



}
