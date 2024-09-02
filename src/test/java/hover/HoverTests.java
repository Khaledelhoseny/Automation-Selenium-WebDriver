package hover;
import base.BaseTests;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.HomePage;
import pages.HoverPage;
public class HoverTests extends BaseTests {
    @Test
    public void testGetUserData(){
        HoverPage hoverPage = homePage.clickOnHoverLink() ;
        hoverPage.hoverOverFigure(3);
        String actualResult = hoverPage.getUserData();
        String expectedResult = "name: user3" ;
        Assert.assertEquals(actualResult,expectedResult);
    }
}
