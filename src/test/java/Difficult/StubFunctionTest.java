package Difficult;

import org.junit.BeforeClass;
import org.junit.Test;
import trigo.Sine;

import static org.junit.Assert.*;
import static org.junit.Assert.*;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;
public class StubFunctionTest {
    private static Sine sin;
    @BeforeClass
    public static void setUp(){
        sin=mock(Sine.class);
        when(sin.sin(0.0)).thenReturn(0.0);
        //when(1.0).thenReturn(1.0);
        //when(2.0).thenReturn(2.0);
        //when(3.0).thenReturn(3.0);
        //when(4.0).thenReturn(4.0);
        //when(5.0).thenReturn(5.0);

    }
    @Test
    public void func() {

    }
}