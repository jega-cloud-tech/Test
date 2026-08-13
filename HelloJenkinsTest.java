import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class HelloJenkinsTest {
    @Test
    public void testMessage() {
        String message = "Hello, Jenkins CI/CD!";
        assertEquals("Hello, Jenkins CI/CD!", message);
    }
}

