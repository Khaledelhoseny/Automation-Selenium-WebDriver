package dragAndDrop;

import base.BaseTests;
import org.testng.annotations.Test;
import pages.DragAndDropPage;

public class DragAndDrop extends BaseTests {

    @Test
    public void testDragAndDrop(){
       DragAndDropPage dragAndDropPage = homePage.clickOnDragAndDropLink() ;
       dragAndDropPage.dragAndDrop();
    }
}
