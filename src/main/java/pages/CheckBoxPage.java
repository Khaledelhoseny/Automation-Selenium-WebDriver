package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import utils.MethodHandles;

public class CheckBoxPage extends MethodHandles {
    public CheckBoxPage (WebDriver driver){
        super(driver);
    }
    private final By checkBoxOne = By.xpath("(//input[@type='checkbox'])[1]") ;
    private final By chekcBoxTwo = By.xpath(" (//input[@type='checkbox'])[2]") ;
    public void clickOnCheckBoxOne (){
        click(checkBoxOne,5);

    }
    public void clickOnCheckBoxTow (){
        click(chekcBoxTwo,5);
    }
    public boolean checkBoxOneIsSelected (){
        return isSelected(checkBoxOne , 5);
    }
    public boolean checkBoxTwoIsNotSelected (){
        return isSelected(chekcBoxTwo , 5);
    }

}
