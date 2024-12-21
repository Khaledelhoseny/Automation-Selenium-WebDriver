package dataProviderLogin;

import base.BaseTests;
import dataProvider.ExcelDataSupllier;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.LoginPage;
import pages.SecureAreaPage;

public class LogginWithExcel extends BaseTests {
    @Test(dataProvider = "loginData", dataProviderClass = ExcelDataSupllier.class)
    public void SuccessfulLogin( String username , String password ){
        LoginPage loginPage =  homePage.clickFormAuthemticationLink() ;
        SecureAreaPage secureAreaPage = loginPage.loginFeature(username , password);
        String actualResult = secureAreaPage.getValidationMessage() ;
        String expectedResult = "Your username is invalid!" ;
        Assert.assertTrue(actualResult.contains(expectedResult));
    }
}
