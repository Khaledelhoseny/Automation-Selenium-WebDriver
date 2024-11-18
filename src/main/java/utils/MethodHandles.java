package utils;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.markuputils.ExtentColor;
import com.aventstack.extentreports.markuputils.MarkupHelper;
import junit.framework.Assert;
import org.apache.poi.ss.formula.atp.Switch;
import org.openqa.selenium.*;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.awt.*;
import java.time.Duration;
import java.util.ArrayList;
import java.util.List;

import static java.awt.SystemColor.text;

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
    protected void explicitWait(By locator , int time ){
        wait = new WebDriverWait(driver , Duration.ofSeconds(time)) ;
        wait.until(ExpectedConditions.and(ExpectedConditions.visibilityOf(webElement(locator)),
                ExpectedConditions.visibilityOfElementLocated(locator) ,
                ExpectedConditions.elementToBeClickable(locator),
                ExpectedConditions.presenceOfElementLocated(locator)
        ));
    }
    protected void inVisabilityOfElement(By locator , int time ){
        wait = new WebDriverWait(driver , Duration.ofSeconds(time)) ;
        wait.until(ExpectedConditions.invisibilityOfElementLocated(locator));
    }

    protected void sendKeys(By locator , int time , String text){

        for (int i = 0 ; i<5 ; i++){
            try {
                explicitWait(locator , time );
                addBorderToElement(driver, webElement(locator));
                setSteps();
                webElement(locator).sendKeys(text);
                break;
            }catch (StaleElementReferenceException e){
                System.out.println("Element doesn't exist");
            }
        }
    }

    protected void click(By locator , int time ){
        for (int i = 0 ; i<5 ; i++){
            try {
                explicitWait( locator , time);
                addBorderToElement(driver, webElement(locator));
                setSteps();
                webElement(locator).click();
                break;
            }catch (StaleElementReferenceException e){
                System.out.println("Element doesn't exist");
            }
        }
    }
    protected void scrollToElement( By locator){
        actions = new Actions(driver) ;
        actions.scrollToElement(webElement(locator)).build().perform();
    }
    public void scrollWithJsExecutor( By locator ){
        JavascriptExecutor js = (JavascriptExecutor) driver ;
        js.executeScript("arguments[0].scrollIntoView(true);",webElement(locator));
    }
    protected void switchToFrame(By locator){
        driver.switchTo().frame(webElement(locator)) ;
    }

    protected void clickWithMouseActions(By locator , int time){
        actions = new Actions(driver) ;
        for (int i = 0 ; i<5 ; i++){
            try {
                explicitWait( locator , time);
                addBorderToElement(driver, webElement(locator));
                setSteps();
                actions.click(webElement(locator)).build().perform();
                break;
            }catch (StaleElementReferenceException e){
                System.out.println("Element doesn't exist");
            }
        }
    }

    protected String getText(By locator , int time){
        String text = null ;
        for (int i = 0 ; i<5 ; i++){
            try {
                explicitWait( locator , time);
                addBorderToElement(driver, webElement(locator));
                setSteps();
                text = webElement(locator).getText() ;
                break;
            }catch (StaleElementReferenceException e){
                System.out.println("Element doesn't exist");
            }
        }
        return text ;
    }

    protected boolean isSelected(By locator , int time ){
        Boolean flag = false ;
        for (int i = 0 ; i<5 ; i++){
            try {
                explicitWait( locator , time);
                addBorderToElement(driver, webElement(locator));
                setSteps();
                flag = webElement(locator).isSelected() ;
                break;
            }catch (StaleElementReferenceException e){
                System.out.println("Element doesn't exist");
            }
        }
        return flag ;
    }

    protected boolean isDisplayed(By locator , int time ){
        Boolean flag = false ;
        for (int i = 0 ; i<5 ; i++){
            try {
                explicitWait( locator , time);
                addBorderToElement(driver, webElement(locator));
                setSteps();
                flag = webElement(locator).isDisplayed();
                break;
            }catch (StaleElementReferenceException e){
                System.out.println("Element doesn't exist");
            }
        }
        return flag ;
    }

    protected void clear(By locator , int time ){
        for (int i = 0 ; i<5 ; i++){
            try {
                explicitWait( locator , time);
                addBorderToElement(driver, webElement(locator));
                setSteps();
                webElement(locator).clear();
                break;
            }catch (StaleElementReferenceException e){
                System.out.println("Element doesn't exist");
            }
        }
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
    protected void moveToElement(By source ,By target ,  int time ){
        actions = new Actions(driver) ;
        for (int i = 0 ; i<5 ; i++){
            try {
                explicitWait( source , time);
                explicitWait( target , time);
                addBorderToElement(driver, webElement(source));
                addBorderToElement(driver, webElement(target));
                setSteps();
                actions.dragAndDrop(webElement(source) , webElement(target)).build().perform();
                break;
            }catch (StaleElementReferenceException e){
                System.out.println("Element doesn't exist");
            }
        }
    }

    protected void hoverOver(By locator){
        actions =  new Actions(driver) ;
        actions.moveToElement(webElement(locator)).build().perform();
    }

    protected void hoverOver(By locator , int index , int time ){
        actions =  new Actions(driver) ;
        for (int i = 0 ; i<5 ; i++){
            try {
                explicitWait( locator , time);
                addBorderToElement(driver, webElements(locator,index));
                setSteps();
                actions.moveToElement(webElements(locator,index)).build().perform();
                break;
            }catch (StaleElementReferenceException e){
                System.out.println("Element doesn't exist");
            }
        }

    }


    protected void selectElementByIndex(By locator , int index , int time){
        select = new Select(webElement(locator));
        for (int i = 0 ; i<5 ; i++){
            try {
                explicitWait( locator , time);
                addBorderToElement(driver, webElement(locator));
                setSteps();
                select.selectByIndex(index);
                break;
            }catch (StaleElementReferenceException e){
                System.out.println("Element doesn't exist");
            }
        }

    }
    protected List <String> getOptions(By locator){
        select = new Select(webElement(locator));
        setSteps();
        List<WebElement> selectedElements = select.getAllSelectedOptions();
        List<String> list = new ArrayList<String>(5);
        for (WebElement result : selectedElements) {
            list.add(result.getText());
            System.out.println(result.getText());
        }
        System.out.println(list);
        return list ;
    }


    protected void switchToFrame(String nameOrId){
        driver.switchTo().frame(nameOrId);
    }
    protected void switchToParent(){
        driver.switchTo().parentFrame();
    }
    protected void switchToFrame(int frameIndex){
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


    public static void myAssertEquals(Object actual , Object expected){
        test.info(MarkupHelper.createLabel("----------- End OF Steps -----------------" , ExtentColor.BLUE));
        test.info(MarkupHelper.createLabel("----------- Actual Result -----------------" , ExtentColor.BLUE));
        test.info(actual.toString()) ;
        test.info(MarkupHelper.createLabel("----------- Expected Result -----------------" , ExtentColor.BLUE));
        test.info(expected.toString());
        Assert.assertEquals(actual,expected);
    }

    public static void myAssertTrue(String actual , String expected){
        test.info(MarkupHelper.createLabel("----------- End OF Steps -----------------" , ExtentColor.BLUE));
        test.info(MarkupHelper.createLabel("----------- Actual Result -----------------" , ExtentColor.BLUE));
        test.info(actual) ;
        test.info(MarkupHelper.createLabel("----------- Expected Result -----------------" , ExtentColor.BLUE));
        test.info(expected);
        Assert.assertTrue(actual.contains(expected));
    }

}

