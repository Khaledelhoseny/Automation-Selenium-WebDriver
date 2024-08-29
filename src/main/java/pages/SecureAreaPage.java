package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import utils.MethodHandles;

public class SecureAreaPage extends MethodHandles {
    public SecureAreaPage(WebDriver driver) {
        super(driver);
    }

    private final By validationMessage = By.id("flash");

    public String getValidationMessage() {
        return  getText(validationMessage);
    }

}
