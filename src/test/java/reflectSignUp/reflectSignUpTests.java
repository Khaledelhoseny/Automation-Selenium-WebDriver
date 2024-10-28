package reflectSignUp;

import base.BaseTests;
import org.testng.annotations.*;
import pages.FramesPage;
import pages.ReflectSignUpPage;
import utils.ScreenRecorderUtil;
import utils.UtilsTests;

import java.lang.reflect.Method;

public class reflectSignUpTests extends BaseTests {
    UtilsTests utilsTests ;
    ReflectSignUpPage reflectSignUpPage ;
    @Parameters("browser")
    @BeforeClass(groups = {"modefiedRegression","smoke"})
    @Override
    public void setUp( @Optional("chrome") String browser ){
        setUpBrowser(browser);
        driver.manage().window().maximize();
//        homePage = new HomePage(driver);
        reflectSignUpPage = new ReflectSignUpPage(driver);
    }
    @BeforeMethod(groups = {"modefiedRegression","smoke"})
    @Override
    public void goHome( Method testMethod ) throws Exception {
        driver.get("https://app.reflect.run/registration");
        ScreenRecorderUtil.startRecord(testMethod.getName());
        //        Create Test case in report
        utilsTests = new UtilsTests(driver) ;
        utilsTests.createTestCaseInReport(testMethod);
    }
    @Test
    public void testSignUp(){
        reflectSignUpPage.insetFisrtName("khaled");
    }
}
