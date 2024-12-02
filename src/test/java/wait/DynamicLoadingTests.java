package wait;

import base.BaseTests;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.DynamicLoadingPage;
import pages.ExampleOnePage;
import pages.ExampleTwoPage;

public class DynamicLoadingTests extends BaseTests {
    @Test
    public void testExampleOne(){
        DynamicLoadingPage dynamicLoadingPage = homePage.clickOnDynamicLoadingLink() ;
        ExampleOnePage exampleOnePage = dynamicLoadingPage.clickOneExampleOneLink() ;
        exampleOnePage.clickOnStartButton();
        String expectedResult = "Hello World!" ;
//        Thread.sleep(5000);
        String actualResult =  exampleOnePage.getHelloWorldMessage()  ;
        Assert.assertEquals(actualResult ,expectedResult );
    }

    @Test
    public void testExampleTwo(){
        DynamicLoadingPage dynamicLoadingPage = homePage.clickOnDynamicLoadingLink() ;
        ExampleTwoPage exampleTwoPage = dynamicLoadingPage.clickOneExampleTwoLink() ;
        exampleTwoPage.clickOnStartButton();
        String expectedResult = "Hello World!" ;
        String actualResult =  exampleTwoPage.getHelloWorldMessage()  ;
        Assert.assertEquals(actualResult ,expectedResult );
    }
    @Test
    public void testFluentWait(){
        DynamicLoadingPage dynamicLoadingPage = homePage.clickOnDynamicLoadingLink() ;
        ExampleOnePage exampleOnePage = dynamicLoadingPage.clickOneExampleOneLink() ;
        exampleOnePage.clickOnStartButton();
        String expectedResult = "Hello World!" ;
//        Thread.sleep(5000);
        String actualResult =  exampleOnePage.getHelloWorldMessageWithFluentWait();
        Assert.assertEquals(actualResult ,expectedResult );
    }

}
