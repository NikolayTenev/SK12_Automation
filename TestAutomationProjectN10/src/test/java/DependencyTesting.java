import org.testng.annotations.*;

public class DependencyTesting {

    @Test(groups = "smoke")
    public void testName1() {
        System.out.println("My 2 Test");
    }

    @Test(groups = "regression", dependsOnMethods = "registrationMethod")
    public void testName2() {
        System.out.println("My 3 Test");
    }

    @Test
    public void registrationMethod() {

        System.out.println("User registration");
    }

}
