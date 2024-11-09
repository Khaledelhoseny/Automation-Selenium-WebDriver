package hover;
import base.BaseTests;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.HomePage;
import pages.HoverPage;
import utils.UtilsTests;

import static utils.MethodHandles.myAssertEquals;

//import static utils.UtilsTests.myAssertEquals;

public class HoverTests extends BaseTests {
    @Test
    public void testGetUserData(){
        HoverPage hoverPage = homePage.clickOnHoverLink() ;
        hoverPage.hoverOverFigure(3);
        String actualResult = hoverPage.getUserData();
        String expectedResult = "name: user3" ;
        myAssertEquals(actualResult,expectedResult);
//        myAssertEquals(actualResult , expectedResult);
    }


}
