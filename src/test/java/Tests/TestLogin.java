package Tests;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.time.Duration;

public class TestLogin {

    @Test
    public void testLogin() throws InterruptedException {

        WebDriver driver = new ChromeDriver();
        driver. manage () .window() .maximize ();
        driver.manage () .timeouts() .implicitlyWait(Duration.ofSeconds(5));
        driver.get("http://secure.smartbearsoftware.com/samples/TestComplete12/WebOrders/Login.aspx");
        String username = "Tester";
        String password = "test";

        driver.findElement (By.name ("ctl00$MainContent$username")) .sendKeys (username);
        driver.findElement (By.name ("ctl00$MainContent$password")).sendKeys (password);
        driver.findElement (By.className ("button")).click();
        Assert.assertEquals(driver.getTitle (), "Web Orders");
        driver.quit();

    }

    @Test
    public void testLogin2() throws InterruptedException {

        WebDriver driver = new ChromeDriver();
        driver. manage () .window() .maximize ();
        driver.manage () .timeouts() .implicitlyWait(Duration.ofSeconds(5));
        driver.get("http://secure.smartbearsoftware.com/samples/TestComplete12/WebOrders/Login.aspx");
        String username = "Tester";
        String password = "test";

        driver.findElement (By.name ("ctl00$MainContent$username")) .sendKeys (username);
        driver.findElement (By.name ("ctl00$MainContent$password")).sendKeys (password);
        driver.findElement (By.className ("button")).click();
        Assert.assertNotEquals(driver.getTitle (), "Web Orders23");
        driver.quit();

    }

    @Test
    public void testLogin3() throws InterruptedException {

        WebDriver driver = new ChromeDriver();
        driver. manage () .window() .maximize ();
        driver.manage () .timeouts() .implicitlyWait(Duration.ofSeconds(5));
        driver.get("http://secure.smartbearsoftware.com/samples/TestComplete12/WebOrders/Login.aspx");
        String username = "Tester";
        String password = "test";

        driver.findElement (By.name ("ctl00$MainContent$username")) .sendKeys (username);
        driver.findElement (By.name ("ctl00$MainContent$password")).sendKeys ("");
        driver.findElement (By.className ("button")).click();
        Assert.assertNotEquals(driver.getTitle (), "Web Orders23");
        driver.quit();

    }
}
