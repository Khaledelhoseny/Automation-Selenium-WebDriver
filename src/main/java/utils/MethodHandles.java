package utils;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import org.apache.poi.ss.formula.atp.Switch;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.awt.*;
import java.time.Duration;

public class MethodHandles {
    protected WebDriver driver ;
    WebDriverWait wait  ;
    Actions actions ;
    Select select ;
    static ExtentTest test ;
    static ExtentReports extent ;
    public MethodHandles(WebDriver driver){
        this.driver = driver ;
    }
    private WebElement webElement(By locator ){
       return driver.findElement(locator) ;
    }
    private WebElement webElements(By locator , int index){
        return driver.findElements(locator).get(index-1) ;
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
        addBorderToElement(driver, webElement(locator));
        setSteps();
        webElement(locator).sendKeys(text);

    }

    protected void click(By locator , int time ){
        explicitWait( locator , time);
        addBorderToElement(driver, webElement(locator));
        setSteps();
        webElement(locator).click();
    }

    protected void switchToFrame(By locator){
        driver.switchTo().frame(webElement(locator)) ;
    }

    protected void clickWithMouseActions(By locator){
        actions = new Actions(driver) ;
        actions.click(webElement(locator)).build().perform();
    }

    protected String getText(By locator , int time){
        explicitWait( locator , time);
        addBorderToElement(driver, webElement(locator));
        setSteps();
        return webElement(locator).getText() ;
    }

    protected boolean isSelected(By locator){
        return webElement(locator).isSelected() ;
    }

    protected void acceptJsAlert(){
        driver.switchTo().alert().accept();
    }
    protected void dismissJsAlert(){
        driver.switchTo().alert().dismiss();
    }
    protected void insertToJsAlert(String text){
        driver.switchTo().alert().sendKeys(text);
    }
    protected void dragAndDropAction(By locator1,By locator2){
        actions =  new Actions(driver) ;
        actions.clickAndHold(webElement(locator1)).moveToElement(webElement(locator2)).release().build().perform();
    }

    protected void hoverOver(By locator){
        actions =  new Actions(driver) ;
        actions.moveToElement(webElement(locator)).build().perform();
    }

    protected void hoverOverByIndex(By locator , int index ){
        actions =  new Actions(driver) ;
        actions.moveToElement(webElements(locator,index)).build().perform();
    }


    protected void selectElementByIndex(By locator , int index){
        select = new Select(webElement(locator));
        select.selectByIndex(index);
    }

    protected void switchToFrameByString(String frameId){
        driver.switchTo().frame(frameId);
    }
    protected void switchToParent(){
        driver.switchTo().parentFrame();

    }
    protected void switchToFrameByIndex(int frameIndex){
        driver.switchTo().frame(frameIndex);
    }

    private static String getMethodName() {
        StackTraceElement[] stackTraceElements = Thread.currentThread().getStackTrace();
        if (stackTraceElements.length >= 2) {
            if (stackTraceElements.length >= 4)
                return stackTraceElements[4].getMethodName();
            return stackTraceElements[2].getMethodName();
        } else {
            return "Unknown";
        }
    }

    public void setSteps(){
        test.info(getMethodName());
    }

    private static void addBorderToElement(WebDriver driver, WebElement element) {
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("arguments[0].style.border = '5px solid red'", element);
    }



}

