package properties;

import base.BaseTests;
import org.testng.annotations.Test;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class PropertiesTests extends BaseTests {
    @Test
    public void testPropertiesFile() throws IOException {
        FileInputStream file = new FileInputStream("D:\\Automation-Selenium-WebDriver\\data\\data.properties") ;
        Properties p = new Properties() ;
        p.load(file);
        System.out.println(p.getProperty("browser"));
    }
}
