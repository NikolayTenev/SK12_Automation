import org.testng.annotations.*;

public class GroupsTesting {

    @Test(groups = "smoke")
    public void testName() {
        System.out.println("My 1 Test");
    }

    @Test(groups = "smoke")
    public void testName1() {
        System.out.println("My 2 Test");
    }

    @Test(groups = "smoke")
    public void testName2() {
        System.out.println("My 3 Test");
    }


    @Test(groups = "testGroup")
    public void testNameSecond() {
        System.out.println("My first group Test");
    }

    @Test(groups = "testGroup")
    public void testNameSecond2() {
        System.out.println("My second group Test");
    }

    @Test
    public void testNameTest() {
        System.out.println("My Test");
    }

    @Test
    public void testNameTest1() {
        System.out.println("My  1 Test");
    }
}
