package checkBox;

import base.BaseTests;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.CheckBoxPage;

public class CheckBoxTests extends BaseTests {
    @Test
    public void testCheckBox(){
        CheckBoxPage checkBoxPage = homePage.clickOnCheckBoxLink() ;
        checkBoxPage.clickOnCheckBoxOne();
        checkBoxPage.clickOnCheckBoxTow();
        Assert.assertTrue(checkBoxPage.checkBoxOneIsSelected());
        Assert.assertFalse(checkBoxPage.checkBoxTwoIsSelected());
    }
}
