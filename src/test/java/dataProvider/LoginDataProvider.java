package dataProvider;

import org.testng.annotations.DataProvider;
import reader.ReadDataFromJson;
import java.io.FileNotFoundException;

public class LoginDataProvider {
    static ReadDataFromJson readDataFromJson ;
    @DataProvider
    public Object[][] dataProvider() throws FileNotFoundException {
        readDataFromJson = new ReadDataFromJson();
        return readDataFromJson.readJsonFile().Login2 ;
    }
}

