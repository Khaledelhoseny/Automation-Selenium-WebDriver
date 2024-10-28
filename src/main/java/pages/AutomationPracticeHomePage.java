package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import utils.MethodHandles;

public class AutomationPracticeHomePage extends MethodHandles {
    public AutomationPracticeHomePage(WebDriver driver){
        super(driver);
    }

    private final By searchBar = By.id("search_query_top");
    public void insertSearchText(String text){
        sendKeys(searchBar,5,text);
    }

}
