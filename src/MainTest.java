import org.junit.Test;
import static org.junit.Assert.*;

public class MainTest {

    @Test
    public void testIsEven() {
        Main main = new Main();
        assertTrue(main.isEven(4));
        assertFalse(main.isEven(5));
    }

    @Test
    public void testIsOdd() {
        Main main = new Main();
        assertTrue(main.isOdd(5));
        assertFalse(main.isOdd(4));
    }
}
