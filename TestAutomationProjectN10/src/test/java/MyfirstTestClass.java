import org.testng.*;
import org.testng.annotations.*;


public class MyfirstTestClass<groups> {
    @BeforeSuite
    public void testBeforeSuite() {
        System.out.println("Before suite");
    }


    @BeforeTest(alwaysRun = true)
    public void testBeforeTest() {
        System.out.println("Before test");
    }


    @BeforeMethod
    public void testBeforeMethod() {
        System.out.println("Before Method");
    }

    @Test(groups = "smoke")
    public void testName() {
        System.out.println("My first Test");
    }


    @Test(groups = "testGroup")
    public void testNameSecond() {
        System.out.println("My second Test");
    }

    @AfterMethod(groups = "smoke")
    public void testAfterMethod() {
        System.out.println("After Method test");
    }

    @AfterTest
    public void testAfterTest() {
        System.out.println("After  test");
    }

    @AfterSuite(groups = "test", alwaysRun = true )
    public void testAfterSuite() {
        System.out.println("After Suite test");
    }
}
