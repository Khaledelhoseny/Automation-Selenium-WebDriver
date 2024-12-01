package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import utils.MethodHandles;

public class FileUploadPage extends MethodHandles {
    public FileUploadPage(WebDriver driver) {
        super(driver);
    }
    private final By inputField = By.id("file-upload") ;
    private final By uploadButton = By.id("file-submit");
    private final By uploadedFile = By.id("uploaded-files");
    public void uploadFile(String path){
        driver.findElement(inputField).sendKeys(path);
    }
    public void clickOnUpload(){
        click(uploadButton, 5);
    }

    public String getUploadedFile(){
        return getText(uploadedFile ,  5) ;
    }




}
