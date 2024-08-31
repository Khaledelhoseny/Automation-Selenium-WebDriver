package dataProviderLogin;

import base.BaseTests;
import dataProvider.LoginDataProvider;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.LoginPage;
import pages.SecureAreaPage;

public class DataProviderLoginTests extends BaseTests {

    @Test( dataProviderClass = LoginDataProvider.class ,dataProvider = "loginData")
    public void dataProviderSuccessfulLogin( String username , String password ){
        LoginPage loginPage =  homePage.clickFormAuthemticationLink() ;
        SecureAreaPage secureAreaPage = loginPage.loginFeature(username , password);
        String actualResult = secureAreaPage.getValidationMessage() ;
        String expectedResult = "Your username is invalid!" ;
        Assert.assertTrue(actualResult.contains(expectedResult));
    }
}
