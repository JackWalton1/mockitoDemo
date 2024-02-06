import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class BTest {
    @Test
    void testB() {
        B b = new B();
        assertEquals(0, b.getIntegers().size());
        b.add(9);
        assertFalse(b.remove(8));
        assertTrue(b.remove(9));
        assertEquals(0, b.getIntegers().size());
        B b2 = new B();
        assertTrue(b.equals(b2));
    }

}