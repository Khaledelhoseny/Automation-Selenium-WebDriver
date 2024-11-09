package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import utils.MethodHandles;

public class HoverPage extends MethodHandles {
    public HoverPage(WebDriver driver){
        super(driver);
    }

    private final By figure = By.cssSelector(".figure") ;
    private final By figureCaption = By.cssSelector(".figcaption") ;
    private final By username = By.tagName("h5") ;
    WebElement element ;
    public void hoverOverFigure(int index){
        element  = driver.findElements(figure).get(index-1) ;
        hoverOver(figure , index , 5);
    }
    public String getUserData(){
        WebElement caption =  element.findElement(figureCaption) ;
        return caption.findElement(username).getText() ;
    }


}
