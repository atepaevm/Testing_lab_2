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
    public void testMinusInf(){
        mockAll();
        double xVal = -4.512, yRes = -6.004;
        expect(Secant.sec(xVal)).andReturn(-5.02385);
        expect(Sine.sin(xVal)).andReturn(0.979989);
        replayAll();
        assertEquals(yRes, new MinusFunc().func(xVal), 0.01);
    }

    @Test
    public void testMinusInf2(){
        mockAll();
        double xVal = -4.379, yRes = -4.001;
        expect(Secant.sec(xVal)).andReturn(-3.05579);
        expect(Sine.sin(xVal)).andReturn(0.944939);
        replayAll();
        assertEquals(yRes, new MinusFunc().func(xVal), 0.01);
    }


    @Test
    public void borderValue(){
        mockAll();
        double xVal = -4.22, yRes = -2.997;
        expect(Secant.sec(xVal)).andReturn(-2.11536);
        expect(Sine.sin(xVal)).andReturn(0.881206);
        replayAll();
        assertEquals(yRes, new MinusFunc().func(xVal), 0.01);
    }

    @Test
    public void negativeXBottomPart() {
        mockAll();
        double xVal = -3.14, yRes = -0.998;
        expect(Secant.sec(xVal)).andReturn(-1.0000013);
        expect(Sine.sin(xVal)).andReturn(-0.00159265);
        replayAll();
        assertEquals(yRes, new MinusFunc().func(xVal), 0.01);
    }

    @Test
    public void negativeBotttom(){
        mockAll();
        double xVal = -2.543, yRes = -0.647;
        expect(Secant.sec(xVal)).andReturn(-1.21046);
        expect(Sine.sin(xVal)).andReturn(-0.563480);
        replayAll();
        assertEquals(yRes, new MinusFunc().func(xVal), 0.01);
    }

    @Test
    public void negativeXIncrease(){
        mockAll();
        double xVal = -2, yRes = -1.494;
        expect(Secant.sec(xVal)).andReturn(-2.402997);
        expect(Sine.sin(xVal)).andReturn(-0.909297);
        replayAll();
        assertEquals(yRes, new MinusFunc().func(xVal), 0.01);
    }

    @Test
    public void negativeXUpperLeft(){
        mockAll();
        double xVal = -1.37, yRes = 5.994;
        expect(Secant.sec(xVal)).andReturn(5.01379);
        expect(Sine.sin(xVal)).andReturn(-0.9799081);
        replayAll();
        assertEquals(yRes, new MinusFunc().func(xVal), 0.01);
    }

    @Test
    public void borderZero(){
        mockAll();
        double xVal = 0, yRes = 1;
        expect(Secant.sec(xVal)).andReturn(1.0);
        expect(Sine.sin(xVal)).andReturn(0.0);
        replayAll();
        assertEquals(yRes, new MinusFunc().func(xVal), 0.01);
    }

    @Test
    public void positiveBottom(){
        mockAll();
        double xVal = 0.599, yRes = 0.647;
        expect(Secant.sec(xVal)).andReturn(1.21080);
        expect(Sine.sin(xVal)).andReturn(0.563817);
        replayAll();
        assertEquals(yRes, new MinusFunc().func(xVal), 0.01);
    }

    @Test
    public void positiveRight(){
        mockAll();
        double xVal = 1.223, yRes = 1.994;
        expect(Secant.sec(xVal)).andReturn(2.93404);
        expect(Sine.sin(xVal)).andReturn(0.940126);
        replayAll();
        assertEquals(yRes, new MinusFunc().func(xVal), 0.01);
    }


}