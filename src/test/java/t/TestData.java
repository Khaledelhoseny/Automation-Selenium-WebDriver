package t;

import base.BaseTests;
import org.testng.annotations.Test;
import reader.ReadDataFromJson;

import java.io.FileNotFoundException;

public class TestData extends BaseTests {


    @Test
    public void testURL () throws FileNotFoundException {
        System.out.println(dataModel().URL);
    }


    @Test
    public void t2() throws FileNotFoundException {
        System.out.println(dataModel().Login.ValidCredentials.Username);
        System.out.println(dataModel().Login.ValidCredentials.Password);
    }


}
