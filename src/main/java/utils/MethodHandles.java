package utils;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.awt.*;
import java.time.Duration;

public class MethodHandles {
    protected WebDriver driver ;
    WebDriverWait wait  ;
    Actions actions ;
    public MethodHandles(WebDriver driver){
        this.driver = driver ;
    }
    private WebElement webElement(By locator ){
       return driver.findElement(locator) ;
    }
    private void explicitWait(By locator , int time ){
        wait = new WebDriverWait(driver , Duration.ofSeconds(time)) ;
        wait.until(ExpectedConditions.and(ExpectedConditions.visibilityOf(webElement(locator)),
                ExpectedConditions.visibilityOfElementLocated(locator) ,
                ExpectedConditions.elementToBeClickable(locator),
                ExpectedConditions.presenceOfElementLocated(locator)
        ));
    }
    protected void sendKeys(By locator , int time , String text){
        explicitWait(locator , time );
        webElement(locator).sendKeys(text);
    }

    protected void click(By locator , int time ){
        explicitWait( locator , time);
        webElement(locator).click();
    }

    protected void switchToFrame(By locator){
        driver.switchTo().frame(webElement(locator)) ;
    }

    protected void clickWithMouseActions(By locator){
        actions = new Actions(driver) ;
        actions.click(webElement(locator)).build().perform();
    }

    protected String getText(By locator){
        return webElement(locator).getText() ;
    }



}