package newWindow;

import base.BaseTests;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WindowType;
import org.testng.Assert;
import org.testng.annotations.*;
import org.testng.asserts.SoftAssert;
import pages.AutomationPracticeHomePage;
import pages.AutomationPracticeLoginPage;
import utils.ScreenRecorderUtil;
import utils.UtilsTests;

import java.lang.reflect.Method;

public class NewWindowTests extends BaseTests {
    UtilsTests utilsTests ;
    public AutomationPracticeHomePage automationPracticePage ;
    @Parameters("browser")
    @BeforeClass(groups = {"modefiedRegression","smoke"})
    @Override
    public void setUp( @Optional("chrome") String browser ){
        setUpBrowser(browser);
        driver.manage().window().maximize();
        automationPracticePage = new AutomationPracticeHomePage(driver) ;
    }
    @BeforeMethod(groups = {"modefiedRegression","smoke"})
    @Override
    public void goHome( Method testMethod ) throws Exception {
        driver.get("http://www.automationpractice.pl/index.php");
        System.out.println(driver.getTitle());
        //        Take Screen Record
        ScreenRecorderUtil.startRecord(testMethod.getName());
        //        Create Test case in report
        utilsTests = new UtilsTests(driver) ;
        utilsTests.createTestCaseInReport(testMethod);
    }
    @Test
    public void newWindowTests(){
        WebDriver newWindow = driver.switchTo().newWindow(WindowType.WINDOW) ;
        newWindow.get("http://www.automationpractice.pl/index.php?controller=stores");
        System.out.println(newWindow.getTitle());
    }
    @Test
    public void testWorkingInBothWindowTabs(){
        driver.switchTo().newWindow(WindowType.TAB)
                .get("http://www.automationpractice.pl/index.php?controller=authentication&back=my-account");
        System.out.println(driver.getTitle());
        AutomationPracticeLoginPage automationPracticeLoginPage = new AutomationPracticeLoginPage(driver);
        automationPracticeLoginPage.insertInEmailAddressInput("khaledelhoseny76@gmail.com");
        automationPracticeLoginPage.clickOnCreateAccountButton();

        Object[] allTabs = driver.getWindowHandles().toArray();
        driver.switchTo().window((String) allTabs[0]) ;
        System.out.println(driver.getTitle());
        automationPracticePage.insertSearchText("T-Shirts");
    }

    @Test
    public void softAssertion(){
        SoftAssert softAssert = new SoftAssert();
        softAssert.assertEquals(false,true);
        System.out.println("After Assertion");
    }
    @Test
    public void hardAssertion(){
        Assert.assertEquals(false,true);
        System.out.println("After Assertion");
    }
}
