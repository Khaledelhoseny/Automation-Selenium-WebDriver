package dropDown;

import base.BaseTests;
import org.testng.annotations.Test;
import pages.DropDownPage;

public class DropDownTests extends BaseTests {
    @Test(groups = "regression2")
    public void testDropDownList() throws InterruptedException {
       DropDownPage dropDownPage =  homePage.clickOnDropDownLink();
       Thread.sleep(3000);
       dropDownPage.selectFromDropDown(2);
    }
}
