package Tests.ui;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.*;

import java.time.Duration;

public class TestLogin2 {


    WebDriver driver;
    @BeforeMethod(alwaysRun = true)
    public void setUpEachMethod(){

        driver = new ChromeDriver();
        driver. manage () .window() .maximize ();
        driver.manage () .timeouts() .implicitlyWait(Duration.ofSeconds(5));
        driver.get("http://secure.smartbearsoftware.com/samples/TestComplete12/WebOrders/Login.aspx");

    }

    @AfterMethod(alwaysRun = true)
    public void tearDownMethod() {
        driver.quit();
    }

    @Test
    public void testLogin() throws InterruptedException {


        String username = "Tester";
        String password = "test";

        driver.findElement (By.name ("ctl00$MainContent$username")) .sendKeys (username);
        driver.findElement (By.name ("ctl00$MainContent$password")).sendKeys (password);
        driver.findElement (By.className ("button")).click();
        Assert.assertEquals(driver.getTitle (), "Web Orders");


    }

    @Test(groups = {"smoke"})
    public void testLogin2() throws InterruptedException {


        String username = "Tester";
        String password = "test";

        driver.findElement (By.name ("ctl00$MainContent$username")) .sendKeys (username);
        driver.findElement (By.name ("ctl00$MainContent$password")).sendKeys (password);
        driver.findElement (By.className ("button")).click();
        Assert.assertNotEquals(driver.getTitle (), "Web Orders23");


    }

    @Test(groups = "flaky")
    public void testLogin3() throws InterruptedException {


        String username = "Tester";
        String password = "test";

        driver.findElement (By.name ("ctl00$MainContent$username")) .sendKeys (username);
        driver.findElement (By.name ("ctl00$MainContent$password")).sendKeys ("");
        driver.findElement (By.className ("button")).click();
        Assert.assertNotEquals(driver.getTitle (), "Web Ordersjhv");


    }
}
