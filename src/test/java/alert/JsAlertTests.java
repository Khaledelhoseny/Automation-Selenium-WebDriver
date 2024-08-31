package alert;

import base.BaseTests;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.JsAlertPage;

public class JsAlertTests extends BaseTests {
    @Test
    public void testAcceptAlert(){
        JsAlertPage jsAlertPage = homePage.clickOnJsAleartsLink() ;
        jsAlertPage.clickOnJsAlertButton();
        jsAlertPage.acceptAlert();
        String expectedResult = "You successfully clicked an alert" ;
        String actualResult = jsAlertPage.getValidationMessage();
        Assert.assertEquals( actualResult , expectedResult );
    }
    @Test
    public void testDismissAlert(){
        JsAlertPage jsAlertPage = homePage.clickOnJsAleartsLink() ;
        jsAlertPage.clickOnJsConfirmButton();
        jsAlertPage.dismissAlert();
        String expectedResult = "You clicked: Cancel" ;
        String actualResult = jsAlertPage.getValidationMessage();
        Assert.assertEquals( actualResult , expectedResult );
    }

    @Test
    public void testJsPrompt(){
        JsAlertPage jsAlertPage = homePage.clickOnJsAleartsLink() ;
        jsAlertPage.clickOnJsPropmpt();
        jsAlertPage.insertJsPrompt("khaled");
        jsAlertPage.acceptAlert();
        String expectedResult = "You entered: khaled" ;
        String actualResult = jsAlertPage.getValidationMessage();
        Assert.assertEquals( actualResult , expectedResult );

    }

}
