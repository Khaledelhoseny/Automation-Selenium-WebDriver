package checkBox;

import base.BaseTests;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.CheckBoxPage;
import utils.UtilsTests;

import static utils.UtilsTests.print;

public class CheckBoxTests extends BaseTests {
    @Test(groups = "regression2")
    public void testCheckBox(){
        CheckBoxPage checkBoxPage = homePage.clickOnCheckBoxLink() ;
        checkBoxPage.clickOnCheckBoxOne();
        checkBoxPage.clickOnCheckBoxTow();
        Assert.assertTrue(checkBoxPage.checkBoxOneIsSelected());
        Assert.assertFalse(checkBoxPage.checkBoxTwoIsNotSelected());

    }
}
