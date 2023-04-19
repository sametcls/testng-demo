package Tests.ui;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import java.time.Duration;

public class HardVsSoftAssertions {

    @Test
    public void test3() throws InterruptedException {

        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
        driver.get("http://secure.smartbearsoftware.com/samples/TestComplete12/WebOrders/Login.aspx");
        String username = "Tester";
        String password = "test";

        driver.findElement(By.name("ctl00$MainContent$username")).sendKeys(username);
        driver.findElement(By.name("ctl00$MainContent$password")).sendKeys("");
        driver.findElement(By.className("button")).click();

        //Hard Assertion
//        Assert.assertEquals(driver.getCurrentUrl(), "Wjhbhj");
//        Assert.assertNotEquals(driver.getTitle(), "Web Orders");
//        Assert.assertTrue(driver.getPageSource().contains("Wkhb"));


        //Soft Assertion

        SoftAssert softAssert = new SoftAssert();

        softAssert.assertEquals(driver.getCurrentUrl(), "Wjhbhj");
        softAssert.assertNotEquals(driver.getTitle(), "Web Orders");
        softAssert.assertTrue(driver.getPageSource().contains("Wkhb"));

        driver.quit();

        softAssert.assertAll(); // The last step is important, without this method call soft assertions will not throw any exception if there were any

        // The common scenario where soft assertions are needed is when you have
        // multiple assertions in a single test case


    }
}
