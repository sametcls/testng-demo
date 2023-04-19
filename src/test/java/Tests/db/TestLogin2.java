package Tests.db;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

public class TestLogin2 extends TestBase {



    @Test
    public void testLogin() throws InterruptedException {


        String username = "Tester";
        String password = "test";

        driver.findElement (By.name ("ctl00$MainContent$username")) .sendKeys (username);
        driver.findElement (By.name ("ctl00$MainContent$password")).sendKeys (password);
        driver.findElement (By.className ("button")).click();
        Assert.assertEquals(driver.getTitle (), "Web Orders");


    }

    @Test
    public void testLogin2() throws InterruptedException {


        String username = "Tester";
        String password = "test";

        driver.findElement (By.name ("ctl00$MainContent$username")) .sendKeys (username);
        driver.findElement (By.name ("ctl00$MainContent$password")).sendKeys (password);
        driver.findElement (By.className ("button")).click();
        Assert.assertNotEquals(driver.getTitle (), "Web Orders23");


    }

    @Test
    public void testLogin3() throws InterruptedException {


        String username = "Tester";
        String password = "test";

        driver.findElement (By.name ("ctl00$MainContent$username")) .sendKeys (username);
        driver.findElement (By.name ("ctl00$MainContent$password")).sendKeys ("");
        driver.findElement (By.className ("button")).click();
        Assert.assertNotEquals(driver.getTitle (), "Web Ordersjhv");


    }
}
