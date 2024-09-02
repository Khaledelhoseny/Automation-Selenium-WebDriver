package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import utils.MethodHandles;

public class DynamicLoadingPage extends MethodHandles {
    public DynamicLoadingPage(WebDriver driver) {
        super(driver);
    }

    private final By exampleOneLink  = By.partialLinkText("Example 1") ;
    public ExampleOnePage clickOneExampleOneLink(){
        click(exampleOneLink,5);
        return new ExampleOnePage(driver) ;
    }
}
