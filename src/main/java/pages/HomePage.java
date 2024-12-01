package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import utils.MethodHandles;

import java.io.File;

public class HomePage extends MethodHandles {

   public HomePage(WebDriver driver){
       super(driver);
   }

    private final By formAuthemticationLink = By.linkText("Form Authentication");
    private final By entryAdLink = By.linkText("Entry Ad");
    private final By checkBoxLink = By.linkText("Checkboxes") ;
    private final By jsAleartsLink = By.linkText("JavaScript Alerts") ;
    private final By dragAndDropLink = By.linkText("Drag and Drop");
    private final By hoverLink = By.linkText("Hovers");
    private final By dropDownLoadingLink = By.linkText("Dropdown") ;
    private final By dynamicLoadingLink = By.linkText("Dynamic Loading") ;
    private final By statusCodesLink = By.linkText("Status Codes") ;
    private final By fileUploadLink = By.linkText("File Upload");
    private final By nestedFramesLink = By.linkText("Nested Frames") ;

    public LoginPage clickFormAuthemticationLink(){
       click(formAuthemticationLink ,  5);
       return new LoginPage(driver) ;
   }
    public EntryAdPage clickOnentryAdLink(){
        click(entryAdLink,5);
        return new EntryAdPage(driver) ;
    }
    public CheckBoxPage clickOnCheckBoxLink (){
        driver.findElement(checkBoxLink).click();
        return new CheckBoxPage(driver) ;
    }
    public JsAlertPage clickOnJsAleartsLink(){
        driver.findElement(jsAleartsLink).click();
        return new JsAlertPage(driver) ;
    }
    public DragAndDropPage clickOnDragAndDropLink(){
        click(dragAndDropLink,5);
        return new DragAndDropPage(driver) ;
    }
    public HoverPage clickOnHoverLink(){
        click(hoverLink , 5);
        return new HoverPage(driver);
    }
    public DropDownPage clickOnDropDownLink (){
        click(dropDownLoadingLink , 5 );
        return new DropDownPage(driver) ;
    }

    public DynamicLoadingPage clickOnDynamicLoadingLink (){
        click(dynamicLoadingLink , 5);
        return new DynamicLoadingPage(driver) ;
    }
    public FileUploadPage clickOnFileUpload(){
        click(fileUploadLink , 5);
        return new FileUploadPage(driver) ;
    }
    public NestedFramePage clickOnNestedFrame(){
        click(nestedFramesLink,5);
        return new NestedFramePage(driver) ;
    }
    public void scrollIntoLink(){
        scrollWithJsExecutor(statusCodesLink);
    }
    public void clickOnStatusCodesLink(){
        click(statusCodesLink,5);
    }
}
