import org.junit.Before;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;


import java.util.List;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.*;



class ATest {
    B mockB = mock(B.class);
    @BeforeEach
    public void setUp(){
        when(mockB.getIntegers()).thenReturn(List.of(1, 2, 3));
    }

    @Test
    void testA() {
        A a = new A(mockB);
        assertEquals(mockB, a.getB());
        a.add(2);
        assertFalse(a.remove(1));
        assertTrue(a.remove(2));
        a.add(2);
        assertEquals(List.of(2, 1, 2, 3), a.concat());
    }

}
