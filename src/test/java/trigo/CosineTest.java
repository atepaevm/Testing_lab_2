package trigo;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.powermock.core.classloader.annotations.PrepareForTest;
import org.powermock.modules.junit4.PowerMockRunner;

import static org.easymock.EasyMock.anyDouble;
import static org.easymock.EasyMock.expect;
import static org.easymock.EasyMock.verify;
import static org.junit.Assert.*;
import static org.powermock.api.easymock.PowerMock.mockStatic;
import static org.powermock.api.easymock.PowerMock.replayAll;

@RunWith(PowerMockRunner.class)
@PrepareForTest({Cosine.class,Sine.class})
public class CosineTest {
    private final double deltaX=0.01;
    private final double deltaY=0.01;
    private void testPoint(double x,double sinY,double expectedY){
        mockStatic(Sine.class);
        //expect(Sine.sin(sinY-deltaX)).andReturn(expectedY);
        //expect(Sine.sin(sinY)).andReturn(expectedY);
        //expect(Sine.sin((sinY+deltaX))%Sine.PI/2).andReturn(expectedY);
        expect(Sine.sin(anyDouble())).andReturn(expectedY);
        replayAll();
        //assertEquals(expectedY,new Cosine().cos(x-deltaX),deltaY);
        assertEquals(expectedY,new Cosine().cos(x),deltaY);
        //assertEquals(expectedY,new Cosine().cos(x+deltaX),deltaY);
    }
    @Test
    public void test1_1() throws Exception {
        testPoint(-5.0,Sine.PI/2+5,0.283662);
        testPoint(-5.001,Sine.PI/2+5,0.283662);
        testPoint(-4.999,Sine.PI/2+5,0.283662);
    }
    @Test
    public void test1_2() throws Exception {
        testPoint(-5.1001,Sine.PI/2+5.1,0.377978);
        testPoint(-5.1,Sine.PI/2+5.1,0.377978);
        testPoint(-5.0999,Sine.PI/2+5.1,0.377978);
    }
    @Test
    public void test1_3() throws Exception {
        testPoint(-5.2001,Sine.PI/2+5.2,0.468517);
        testPoint(-5.2,Sine.PI/2+5.2,0.468517);
        testPoint(-5.1999,Sine.PI/2+5.2,0.468517);
    }
    @Test
    public void test2_1() throws Exception {
        testPoint(-4.50001,Sine.PI/2+4.5,-0.2108);
        testPoint(-4.5,Sine.PI/2+4.5,-0.2108);
        testPoint(-4.4999,Sine.PI/2+4.5,-0.2108);
    }
    @Test
    public void test2_2() throws Exception {
        testPoint(-4.0,Sine.PI/2+4,-0.65364);
        testPoint(-4.01,Sine.PI/2+4,-0.65364);
        testPoint(-3.9999,Sine.PI/2+4,-0.65364);
    }
    @Test
    public void test2_3() throws Exception {
        testPoint(-4.3,Sine.PI/2+4.3,-0.4008);
        testPoint(-4.3001,Sine.PI/2+4.3,-0.4008);
        testPoint(-4.2999,Sine.PI/2+4.3,-0.4008);
    }
    @Test
    public void test3_1() throws Exception {
        testPoint(-2.8,Sine.PI/2+2.8,-0.94222);
        testPoint(-2.80001,Sine.PI/2+2.8,-0.94222);
        testPoint(-2.7999,Sine.PI/2+2.8,-0.94222);
    }
    @Test
    public void test3_2() throws Exception {
        testPoint(-2.9,Sine.PI/2+2.9,-0.7096);
        testPoint(-2.9001,Sine.PI/2+2.9,-0.7096);
        testPoint(-2.8999,Sine.PI/2+2.9,-0.7096);
    }
    @Test
    public void test3_3() throws Exception {
        testPoint(-2.95,Sine.PI/2+2.95,-0.9817);
        testPoint(-2.9501,Sine.PI/2+2.95,-0.9817);
        testPoint(-2.9499,Sine.PI/2+2.95,-0.9817);
    }
    @Test
    public void test4_1() throws Exception {
        testPoint(-1,Sine.PI/2+1,0.540302);
        testPoint(-1.01,Sine.PI/2+1,0.540302);
        testPoint(-0.99,Sine.PI/2+1,0.540302);
    }
    @Test
    public void test8_1() throws Exception {
        testPoint(1,Sine.PI/2-1,0.540302);
    }
    @Test
    public void test5_1() throws Exception {
        testPoint(-5.0,Sine.PI/2+5,0.283662);
        testPoint(-5.001,Sine.PI/2+5,0.283662);
        testPoint(-5.0002,Sine.PI/2+5,0.283662);
    }
    @Test
    public void test5_2() throws Exception {
        testPoint(-5.1,Sine.PI/2+5.1,0.377978);
        testPoint(-5.1001,Sine.PI/2+5.1,0.377978);
        testPoint(-5.1002,Sine.PI/2+5.1,0.377978);
    }
    @Test
    public void test5_3() throws Exception {
        testPoint(-5.2,Sine.PI/2+5.2,0.468517);
        testPoint(-5.201,Sine.PI/2+5.2,0.468517);
        testPoint(-5.202,Sine.PI/2+5.2,0.468517);
    }
    @Test
    public void test6_1() throws Exception {
        testPoint(-4.5,Sine.PI/2+4.5,-0.2108);
        testPoint(-4.501,Sine.PI/2+4.5,-0.2108);
        testPoint(-4.502,Sine.PI/2+4.5,-0.2108);
    }
    @Test
    public void test6_2() throws Exception {
        testPoint(-4.0,Sine.PI/2+4,-0.65364);
        testPoint(-4.01,Sine.PI/2+4,-0.65364);
        testPoint(-4.02,Sine.PI/2+4,-0.65364);
    }
    @Test
    public void test6_3() throws Exception {
        testPoint(-4.3,Sine.PI/2+4.3,-0.4008);
        testPoint(-4.301,Sine.PI/2+4.3,-0.4008);
        testPoint(-4.302,Sine.PI/2+4.3,-0.4008);
    }
    @Test
    public void test7_2() throws Exception {
        testPoint(-2.9,Sine.PI/2+2.9,-0.7096);
        testPoint(-2.901,Sine.PI/2+2.9,-0.7096);
        testPoint(-2.902,Sine.PI/2+2.9,-0.7096);
    }
    @Test
    public void test7_3() throws Exception {
        testPoint(-2.95,Sine.PI/2+2.95,-0.9817);
        testPoint(-2.9501,Sine.PI/2+2.95,-0.9817);
        testPoint(-2.9502,Sine.PI/2+2.95,-0.9817);
    }
    @Test
    public void test1(){
        testPoint(-1.5*Math.PI,2*Math.PI,0);
        testPoint(-1.5*Math.PI+0.001,2*Math.PI,0);
        testPoint(-1.5*Math.PI+0.002,2*Math.PI,0);
    }
    @Test
    public void test3(){
        testPoint(-0.5*Math.PI,Math.PI,0);
        testPoint(-0.5*Math.PI+0.001,Math.PI,0);
        testPoint(-0.5*Math.PI+0.002,Math.PI,0);
    }
    @Test
    public void test4(){
        testPoint(0,Math.PI/2,1);
        testPoint(0,Math.PI/2+0.001,1);
        testPoint(0,Math.PI/2+0.002,1);

    }
    @Test
    public void test5(){
        testPoint(Math.PI/2+0.001,0,0);
        testPoint(Math.PI/2+0.002,0,0);
        testPoint(Math.PI/2+0.001,0,0);
    }
    @Test
    public void test6(){
        testPoint(1.5*Math.PI,2*Math.PI,0);
        testPoint(1.5*Math.PI+0.001,2*Math.PI,0);
        testPoint(1.5*Math.PI+0.002,2*Math.PI,0);
    }
}