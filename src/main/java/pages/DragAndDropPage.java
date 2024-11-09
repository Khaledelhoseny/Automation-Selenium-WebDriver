package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import utils.MethodHandles;

public class DragAndDropPage extends MethodHandles {

    public DragAndDropPage(WebDriver driver){
        super(driver);
    }

    private final By columnA = By.id("column-a") ;
    private final By columnB = By.id("column-b") ;

    public void dragAndDrop(){
//        dragAndDropAction(columnA , columnB );
        moveToElement(columnA,columnB,5);
    }



}
