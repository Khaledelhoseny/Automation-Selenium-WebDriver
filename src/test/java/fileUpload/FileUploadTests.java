package fileUpload;

import base.BaseTests;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.FileUploadPage;

public class FileUploadTests extends BaseTests {
    @Test
    public void testFileUploadSuccessfully(){
        FileUploadPage fileUploadPage =  homePage.clickOnFileUpload() ;
        fileUploadPage.uploadFile("D:\\Automation-Selenium-WebDriver\\report\\dataProviderSuccessfulLogin.png");
        fileUploadPage.clickOnUpload();
        String actualResult =  fileUploadPage.getUploadedFile();
        String expectedResult = "dataProviderSuccessfulLogin.png" ;
        Assert.assertEquals(actualResult ,expectedResult ,"Image Failed ");
    }
}
