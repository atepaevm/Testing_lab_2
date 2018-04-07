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
@PrepareForTest({Secant.class, Sine.class})
public class SecantTest {
    private final double deltaX=0.01;
    private final double deltaY=0.1;
    private void testPoint(double x,double sinY,double expectedY){
        mockStatic(Sine.class);
        expect(Sine.sin(x-deltaX)).andReturn(sinY);
        expect(Sine.sin(x)).andReturn(sinY);
        expect(Sine.sin(x+deltaX)).andReturn(sinY);
        replayAll();
        assertEquals(expectedY,new Secant().sec(x-deltaX),deltaY);
        assertEquals(expectedY,new Secant().sec(x),deltaY);
        assertEquals(expectedY,new Secant().sec(x+deltaX),deltaY);
    }
    @Test
    public void test1_1() throws Exception {
        double x=-4.5;
        double cosY=0.97753;
        double expectedY=1.022986;
        testPoint(x,cosY,expectedY);
    }
    @Test
    public void test1_2() throws Exception {
        double x=-4.3;
        double cosY=0.916166;
        double expectedY=1.091505;
        testPoint(x,cosY,expectedY);
    }
    @Test
    public void test1_3() throws Exception {
        double x=-4;
        double expectedY=1.321349;
        double cosY=0.756802;
        testPoint(x,cosY,expectedY);
    }
    @Test
    public void test2_1() throws Exception {
        double x=-3;
        double expectedY=-7.08617;
        double cosY=-0.14112;
        testPoint(x,cosY,expectedY);
    }
    @Test
    public void test2_2() throws Exception {
        double x=-2;
        double expectedY=-1.09975;
        double cosY=-0.9093;
        testPoint(x,cosY,expectedY);
    }
    @Test
    public void test2_3() throws Exception {
        double x=-1.7;
        double expectedY=-1.00841;
        double cosY=-0.99166;
        testPoint(x,cosY,expectedY);
    }
    @Test
    public void test3_1() throws Exception {
        double x=-0.9;
        double expectedY=1.27661;
        double cosY=0.78333;
        testPoint(x,cosY,expectedY);
    }
    @Test
    public void test3_2() throws Exception {
        double x=-0.4;
        double expectedY=-2.56793;
        double cosY=-0.38942;
        testPoint(x,cosY,expectedY);
    }
    @Test
    public void test3_3() throws Exception {
        double x=-0.6;
        double expectedY=-1.7103;
        double cosY=-0.56464;
        testPoint(x,cosY,expectedY);
    }
    @Test
    public void test4_1() throws Exception {
        double x=-4.5;
        double cosY=-0.97753;
        double expectedY=-1.022986;
        testPoint(x,cosY,expectedY);
    }
    @Test
    public void test4_2() throws Exception {
        double x=-4.3;
        double cosY=-0.916166;
        double expectedY=-1.091505;
        testPoint(x,cosY,expectedY);
    }
    @Test
    public void test4_3() throws Exception {
        double x=-4;
        double expectedY=-1.321349;
        double cosY=-0.756802;
        testPoint(x,cosY,expectedY);
    }
    @Test
    public void test5_1() throws Exception {
        double x=-3;
        double expectedY=7.08617;
        double cosY=0.14112;
        testPoint(x,cosY,expectedY);
    }
    @Test
    public void test5_2() throws Exception {
        double x=-2;
        double expectedY=1.09975;
        double cosY=0.9093;
        testPoint(x,cosY,expectedY);
    }
    @Test
    public void test5_3() throws Exception {
        double x=-1.7;
        double expectedY=1.00841;
        double cosY=0.99166;
        testPoint(x,cosY,expectedY);
    }
    @Test
    public void test6_1() throws Exception {
        double x=-0.9;
        double expectedY=-1.27661;
        double cosY=-0.78333;
        testPoint(x,cosY,expectedY);
    }
    @Test
    public void test6_2() throws Exception {
        double x=-0.4;
        double expectedY=2.56793;
        double cosY=0.38942;
        testPoint(x,cosY,expectedY);
    }
    @Test
    public void test6_3() throws Exception {
        double x=-0.6;
        double expectedY=1.7103;
        double cosY=0.56464;
        testPoint(x,cosY,expectedY);
    }
    @Test
    public void test1(){
        mockStatic(Sine.class);
        expect(Sine.sin(anyDouble())).andReturn(1.0);
        replayAll();
        assertEquals(1.0,new Cosecant().cosec(-1.5*Math.PI),deltaY);
    }
    @Test
    public void test2(){
        mockStatic(Sine.class);
        expect(Sine.sin(anyDouble())).andReturn(0.0);
        replayAll();
        assertEquals(Double.NaN,new Cosecant().cosec(-1*Math.PI),deltaY);
    }
    @Test
    public void test3(){
        mockStatic(Sine.class);
        expect(Sine.sin(anyDouble())).andReturn(1.0);
        replayAll();
        assertEquals(1.0,new Cosecant().cosec(-0.5*Math.PI),deltaY);
    }
    @Test
    public void test4(){
        mockStatic(Sine.class);
        expect(Sine.sin(anyDouble())).andReturn(0.0);
        replayAll();
        assertEquals(Double.NaN,new Cosecant().cosec(0*Math.PI),deltaY);
    }
    @Test
    public void test5(){
        mockStatic(Sine.class);
        expect(Sine.sin(anyDouble())).andReturn(1.0);
        replayAll();
        assertEquals(1.0,new Cosecant().cosec(0.5*Math.PI),deltaY);
    }
    @Test
    public void test6(){
        mockStatic(Sine.class);
        expect(Sine.sin(anyDouble())).andReturn(0.0);
        replayAll();
        assertEquals(Double.NaN,new Cosecant().cosec(1*Math.PI),deltaY);
    }
    @Test
    public void test7(){
        mockStatic(Sine.class);
        expect(Sine.sin(anyDouble())).andReturn(1.0);
        replayAll();
        assertEquals(1.0,new Cosecant().cosec(1.5*Math.PI),deltaY);
    }
}