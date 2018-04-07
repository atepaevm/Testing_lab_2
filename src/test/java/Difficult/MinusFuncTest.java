package Difficult;

import logarithms.Logarithm;
import logarithms.NaturalLogarithm;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.powermock.core.classloader.annotations.PrepareForTest;
import org.powermock.modules.junit4.PowerMockRunner;
import trigo.*;

import static org.easymock.EasyMock.expect;
import static org.junit.Assert.assertEquals;
import static org.powermock.api.easymock.PowerMock.mockStatic;
import static org.powermock.api.easymock.PowerMock.replayAll;

@RunWith(PowerMockRunner.class)
@PrepareForTest({MinusFunc.class,Cosecant.class,Cosine.class,Cotangent.class,Secant.class,Sine.class,Tangent.class})
public class MinusFuncTest {
    void mockAll(){
        mockStatic(Cosecant.class);
        mockStatic(Cosine.class);
        mockStatic(Cotangent.class);
        mockStatic(Secant.class);
        mockStatic(Sine.class);
        mockStatic(Tangent.class);
    }
    @Test
    public void test1(){
        mockAll();
        double x=-1.0;
        double delta=0.01;
        expect(Cosecant.cosec(x)).andReturn(1.0);
        expect(Cosine.cos(x)).andReturn(1.0);
        expect(Cotangent.cot(x)).andReturn(1.0);
        expect(Secant.sec(x)).andReturn(1.0);
        expect(Sine.sin(x)).andReturn(1.0);
        expect(Tangent.tan(x)).andReturn(1.0);
        replayAll();
        assertEquals(3.0,new MinusFunc().func(x),0.01);
    }
}