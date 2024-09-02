package frame;

import base.BaseTests;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.*;
import pages.FramesPage;
import pages.HomePage;
import reader.ReadDataFromJson;

import java.lang.reflect.Method;
import java.util.Base64;

public class FrameTests extends BaseTests {
    public FramesPage framesPage;
    @Parameters("browser")
    @BeforeClass(groups = {"modefiedRegression","smoke"})
    @Override
    public void setUp( @Optional("chrome") String browser ){
        setUpBrowser(browser);
        driver.manage().window().maximize();
//        homePage = new HomePage(driver);
        framesPage = new FramesPage(driver);
    }
    @BeforeMethod (groups = {"modefiedRegression","smoke"})
    @Override
    public void goHome( Method testMethod ) throws Exception {
        driver.get("https://demo.automationtesting.in/Frames.html");
        //        Take Screen Record
//        ScreenRecorderUtil.startRecord(testMethod.getName());
    }
    @Test
    public void testSingleIframe(){
        framesPage.insertTextInSingelIframe("helllooo");
        framesPage.clickOnIframeWithinAnIframe();
    }
    @Test
    public void IframeWithInAnIframe(){
        framesPage.clickOnIframeWithinAnIframe();
        framesPage.insertTextInNestedIframe("khaled");
    }
}
