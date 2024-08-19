import org.testng.annotations.Test;

import java.io.IOException;

public class ExeptionsTest {

    @Test
    public void runTimeExeption() {
        throw new RuntimeException("Pass");
    }

    @Test
    public void ioExeption() throws Exception {
        throw new IOException("Fail");
    }

    @Test
    public void nullExeptionPass() {
        throw new NullPointerException("Pass");
    }

    @Test
    public void nullExeptionFail() {
        throw new NullPointerException("Fail");
    }

}
