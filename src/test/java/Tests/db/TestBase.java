package Tests.db;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import java.time.Duration;

public class TestBase {


    protected WebDriver driver;
    @BeforeMethod
    public void setUpEachMethod(){

        driver = new ChromeDriver();
        driver. manage () .window() .maximize ();
        driver.manage () .timeouts() .implicitlyWait(Duration.ofSeconds(5));
        driver.get("http://secure.smartbearsoftware.com/samples/TestComplete12/WebOrders/Login.aspx");

    }

    @AfterMethod
    public void tearDownMethod() {
        driver.quit();
    }
}
