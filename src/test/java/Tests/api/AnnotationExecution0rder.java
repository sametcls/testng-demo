package Tests.api;

import org.testng.annotations.*;

public class AnnotationExecution0rder {

    @BeforeClass
    public void beforeClass() {
        System.out.println("Before class");
    }

    @AfterClass
    public void afterClass() {
        System.out.println("After class");
    }

    @BeforeMethod
    public void setUpEachMethod() {
        System.out.println("Befote Method");
    }

    @AfterMethod
    public void setUpEachMethodsdv(){
        System.out.println("After Method");
    }

    @BeforeSuite
    public void setUpSuite(){
        System.out.println("Before Suite");
    }
    @AfterSuite
    public void setUpSuiteafter(){
        System.out.println("After Suite");
    }

    @BeforeTest
    public void setUpTest(){
        System.out.println("Before Test");
    }
    @AfterTest
    public void setUpSuiteaftersd(){
        System.out.println("After Test");
    }

    @Test(groups = {"smoke"})
    public void methdod1 () {
        System.out.println("Test 1");
    }

    @Test
    public void methdod2 () {
        System.out.println("Test 2");
    }
}
