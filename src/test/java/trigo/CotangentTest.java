package trigo;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.powermock.core.classloader.annotations.PrepareForTest;
import org.powermock.modules.junit4.PowerMockRunner;

import static org.easymock.EasyMock.anyDouble;
import static org.easymock.EasyMock.expect;
import static org.junit.Assert.*;
import static org.powermock.api.easymock.PowerMock.mockStatic;
import static org.powermock.api.easymock.PowerMock.replayAll;

@RunWith(PowerMockRunner.class)
@PrepareForTest({Cotangent.class,Cosine.class,Sine.class})
public class CotangentTest {
    private final double deltaX=0.01;
    private final double deltaY=0.1;
    private void testPoint(double x,double sinY,double cosY,double expectedY){
        mockAll();
        expect(Cosine.cos(x-deltaX)).andReturn(cosY);
        expect(Cosine.cos(x)).andReturn(cosY);
        expect(Cosine.cos(x+deltaX)).andReturn(cosY);
        expect(Sine.sin(x-deltaX)).andReturn(sinY);
        expect(Sine.sin(x)).andReturn(sinY);
        expect(Sine.sin(x+deltaX)).andReturn(sinY);
        replayAll();
        assertEquals(expectedY,new Cotangent().cot(x-deltaX),deltaY);
        assertEquals(expectedY,new Cotangent().cot(x),deltaY);
        assertEquals(expectedY,new Cotangent().cot(x+deltaX),deltaY);
    }
    void mockAll(){
        mockStatic(Cosine.class);
        mockStatic(Sine.class);
    }
    @Test
    public void test2_1(){
        testPoint(-2.5,-0.59847,-0.80114,1/0.747022);
    }
    @Test
    public void test2_2(){
        testPoint(-3.0,-0.14112,-0.98999,1/0.142547);
    }
    @Test
    public void test2_3(){
        testPoint(-2.7,-0.42738,-0.90407,1/0.472728);
    }
    @Test
    public void test3_1(){
        testPoint(-1.0,-0.84147,0.540302,1/-1.55741);
    }
    @Test
    public void test3_2(){
        testPoint(-0.4,-0.38942,0.921061,1/-0.42279);
    }
    @Test
    public void test3_3(){
        testPoint(-0.6,-0.56464,0.825336,1/-0.68414);
    }

    @Test
    public void test4_1(){
        testPoint(-4.0,-0.756802,-0.65364,1/1.15782);
    }
    @Test
    public void test4_2(){
        testPoint(-3.9,-0.687766,-0.72593,1/0.94742);
    }
    @Test
    public void test4_3(){
        testPoint(-3.8,-0.611858,-0.79097,1/0.77356);
    }
    @Test
    public void test5_1(){
        testPoint(-2.5,0.59847,-0.80114,1/-0.747022);
    }
    @Test
    public void test5_2(){
        testPoint(-3.0,0.14112,-0.98999,1/-0.142547);
    }
    @Test
    public void test5_3(){
        testPoint(-2.7,0.42738,-0.90407,1/-0.472728);
    }
    @Test
    public void test1(){
        mockAll();
        expect(Sine.sin(anyDouble())).andReturn(0.0);
        expect(Cosine.cos(anyDouble())).andReturn(1.0);
        replayAll();
        assertEquals(0.0,new Tangent().tan(-Math.PI/2),deltaY);
    }
    @Test
    public void test2(){
        mockAll();
        expect(Sine.sin(anyDouble())).andReturn(1.0);
        expect(Cosine.cos(anyDouble())).andReturn(0.0);
        replayAll();
        assertEquals(Double.NaN,new Tangent().tan(0),deltaY);
    }
    @Test
    public void test3(){
        mockAll();
        expect(Sine.sin(anyDouble())).andReturn(0.0);
        expect(Cosine.cos(anyDouble())).andReturn(1.0);
        replayAll();
        assertEquals(0.0,new Tangent().tan(Math.PI/2),deltaY);
    }
}