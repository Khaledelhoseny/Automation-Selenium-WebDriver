package dropDown;

import base.BaseTests;

import org.testng.Assert;
import org.testng.annotations.Test;
import pages.DropDownPage;

import java.util.List;

public class DropDownTests extends BaseTests {
    @Test(groups = "regression2")
    public void testDropDownList() throws InterruptedException {
       DropDownPage dropDownPage =  homePage.clickOnDropDownLink();
       Thread.sleep(3000);
       dropDownPage.selectFromDropDown(2);
       List<String> selectedOption = dropDownPage.getSelectedOptions();
       Assert.assertEquals(selectedOption.size(), 1 , "incorrect number of selection");
       Assert.assertTrue(selectedOption.contains("Option 2"));
    }
}
