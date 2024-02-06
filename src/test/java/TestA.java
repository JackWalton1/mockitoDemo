import org.junit.Before;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;


import java.util.List;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.*;

class ATest {
    //mock creation
    B mockB = mock(B.class);
    @BeforeEach
    public void setUp(){
//  Stubbing:
        when(mockB.getIntegers()).thenReturn(List.of(10, 20, 30));
//  Make mock object call the real method:
//        when(mock.someMethod()).thenCallRealMethod();
//  Throw exceptions:
//        when(mockedList.get(1)).thenThrow(new RuntimeException());
//        doThrow(new RuntimeException()).when(mockedList).get(1);
//  Flexible "argument matchers":
//        when(mockedList.get(anyInt())).thenReturn("element"); anyBoolean(); isNull();

//  Reset all rules up to this point:
//        reset(mockB);
    }

    @Test
    void testA() {
        A a = new A(mockB);
        assertEquals(mockB, a.getB());
        a.add(2);
        assertFalse(a.remove(1));
        assertTrue(a.remove(2));
        a.add(2);
        assertEquals(List.of(2, 10, 20, 30), a.concat());
    }

}
