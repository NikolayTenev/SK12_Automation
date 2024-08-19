import org.testng.annotations.Parameters;
import org.testng.annotations.*;
import org.testng.annotations.Optional;


public class ParametersTests {

    @Parameters({"user-name"})
    @Test
    public void testParameters(String name) {
        System.out.println("This is " + name);
    }
}
