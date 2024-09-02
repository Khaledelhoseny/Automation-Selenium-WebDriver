package frame;

import base.BaseTests;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import pages.FramesPage;

import java.util.Base64;

public class FrameTests extends BaseTests {

    protected WebDriver driver ;
    public FramesPage framesPage;
    @BeforeClass
    public void  setUp(){
        driver = new ChromeDriver() ;
        driver.manage().window().maximize();
        framesPage = new FramesPage(driver) ;
    }

    @BeforeMethod
    public void goHome() {
        driver.get("https://demo.automationtesting.in/Frames.html");
    }

    @AfterClass
    public void tearDowon(){
        driver.quit();
    }

    @Test
    public void testIframe(){
        framesPage.insertText("helllooo");
        framesPage.clickOnIframeWithinAnIframe();
    }
}
