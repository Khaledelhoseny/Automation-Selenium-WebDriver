package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import utils.MethodHandles;

public class DropDownPage extends MethodHandles {
    public DropDownPage(WebDriver driver){
        super(driver);
    }
    private final By dropDownList = By.xpath("//select[@id='dropdown']") ;
    public void selectFromDropDown(int index){
        selectElementByIndex(dropDownList , index);
    }
}
