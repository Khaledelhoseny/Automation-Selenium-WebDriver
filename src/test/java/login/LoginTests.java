package login;

import base.BaseTests;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.LoginPage;
import pages.SecureAreaPage;

import java.io.FileNotFoundException;

import static utils.MethodHandles.myAssertTrue;

public class LoginTests extends BaseTests {

    @Test (groups = {"regression2" , "smoke"} ,priority = 1)
    public void testSuccessfulLogin() throws FileNotFoundException, InterruptedException {
        LoginPage loginPage =  homePage.clickFormAuthemticationLink() ;
        SecureAreaPage secureAreaPage = loginPage.loginFeature(dataModel().Login.ValidCredentials.Username,dataModel().Login.ValidCredentials.Password);
        String actualResult = secureAreaPage.getValidationMessage() ;
        String expectedResult = "You logged into a secure area!" ;
        myAssertTrue(actualResult,expectedResult);
//        Assert.assertTrue(actualResult.contains(expectedResult));
    }
    @Test (groups = {"regression2" , "smoke"} ,priority = 2)
    public void testInvalidUserName() throws FileNotFoundException, InterruptedException {
        LoginPage loginPage =  homePage.clickFormAuthemticationLink() ;
        SecureAreaPage secureAreaPage = loginPage.loginFeature(dataModel().Login.InValidCredentials.InValidUserName.Username,dataModel().Login.InValidCredentials.InValidUserName.Password);
        String actualResult = secureAreaPage.getValidationMessage() ;
        String expectedResult = "Your username is invalid!" ;
        Assert.assertTrue(actualResult.contains(expectedResult));
    }

    @Test (groups = {"regression2" , "smoke"} ,priority = 3)
    public void testInvalidPassword() throws FileNotFoundException, InterruptedException {
        LoginPage loginPage =  homePage.clickFormAuthemticationLink() ;
        SecureAreaPage secureAreaPage = loginPage.loginFeature(dataModel().Login.InValidCredentials.InValidPassword.Username,dataModel().Login.InValidCredentials.InValidPassword.Password);
        String actualResult = secureAreaPage.getValidationMessage() ;
        String expectedResult = " ";
        Assert.assertTrue(actualResult.contains(expectedResult));
    }
}


