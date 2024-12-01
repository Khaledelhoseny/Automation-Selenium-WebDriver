package nestedFrames;

import base.BaseTests;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.NestedFramePage;

public class NestedFramesTests extends BaseTests {
    @Test
    public void testNestedFrames(){
        NestedFramePage nestedFramePage =  homePage.clickOnNestedFrame();
        String leftText =  nestedFramePage.getLeftText() ;
        Assert.assertEquals(leftText ,"LEFT" , "No Matched");
        String bottomText = nestedFramePage.getBottomText();
        Assert.assertEquals(bottomText ,"BOTTOM" , "No Matched");
    }


}
