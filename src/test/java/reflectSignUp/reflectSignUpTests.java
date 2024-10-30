package reflectSignUp;

import base.BaseTests;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.*;
import pages.AutomationPracticeHomePage;
import pages.FramesPage;
import pages.ReflectSignUpPage;
import utils.ScreenRecorderUtil;
import utils.UtilsTests;

import java.lang.reflect.Method;

public class reflectSignUpTests extends BaseTests {
    UtilsTests utilsTests ;
    public ReflectSignUpPage reflectSignUpPage ;
    @Parameters("browser")
    @BeforeClass(groups = {"modefiedRegression","smoke"})
    @Override
    public void setUp( @Optional("chrome") String browser ){
        setUpBrowser(browser);
        driver.manage().window().maximize();
        reflectSignUpPage = new ReflectSignUpPage(driver) ;
    }
    @BeforeMethod(groups = {"modefiedRegression","smoke"})
    @Override
    public void goHome( Method testMethod ) throws Exception {
        driver.get("https://app.reflect.run/registration");
        System.out.println(driver.getTitle());
        //        Take Screen Record
        ScreenRecorderUtil.startRecord(testMethod.getName());
        //        Create Test case in report
        utilsTests = new UtilsTests(driver) ;
        utilsTests.createTestCaseInReport(testMethod);
    }
    @Test
    public void testSignUp(){
        WebElement firstName =  driver.findElements(By.cssSelector("input.input-field")).get(0);
        firstName.sendKeys("Khaled");
        driver.navigate().refresh();
        firstName.sendKeys("El Hoseny");


//        reflectSignUpPage.insetFisrtName("khaled");
//        driver.navigate().refresh();
//        reflectSignUpPage.insetFisrtName("ahmed");

    }
}
