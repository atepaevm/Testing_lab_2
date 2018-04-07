package trigo;

import org.junit.Test;

import static org.easymock.EasyMock.anyDouble;
import static org.easymock.EasyMock.expect;
import static org.junit.Assert.*;
import static org.powermock.api.easymock.PowerMock.mockStatic;
import static org.powermock.api.easymock.PowerMock.replayAll;

public class SineTest {
    private void testPoint(double X,double Y){
        double deltaX=0.0001;
        double deltaY=0.0005;
        assertEquals(Sine.sin(X-deltaX),Y,deltaY);
        assertEquals(Sine.sin(X),Y,deltaY);
        assertEquals(Sine.sin(X+deltaX),Y,deltaY);
    }
    @Test
    public void test1_1() throws Exception {
        testPoint(-4.5,0.97753);
    }
    @Test
    public void test1_2() throws Exception {
        testPoint(-4,0.756802);
    }
    @Test
    public void test1_3() throws Exception {
        testPoint(-4.3,0.916166);
    }
    @Test
    public void test2_1() throws Exception {
        testPoint(-2.8,-0.33499);
    }
    @Test
    public void test2_2() throws Exception {
        testPoint(-2.9,-0.23925);
    }
    @Test
    public void test2_3() throws Exception {
        testPoint(-2.95,-0.1904);
    }
    @Test
    public void test3_1() throws Exception {
        testPoint(-1,-0.84147);
    }
    @Test
    public void test3_2() throws Exception {
        testPoint(-1.01,0-.84683);
    }
    @Test
    public void test3_3() throws Exception {
        testPoint(-1.4,-0.98545);
    }
    @Test
    public void test4_1() throws Exception {
        testPoint(4.5,-0.97753);
    }
    @Test
    public void test4_2() throws Exception {
        testPoint(4,-0.7568);
    }
    @Test
    public void test4_3() throws Exception {
        testPoint(4.3,-0.91617);
    }
    @Test
    public void test5_1() throws Exception {
        testPoint(2.8,0.334988);
    }
    @Test
    public void test5_2() throws Exception {
        testPoint(2.9,0.239249);
    }
    @Test
    public void test5_3() throws Exception {
        testPoint(2.95,0.190423);
    }
    @Test
    public void test6_1() throws Exception {
        testPoint(1.0,0.841471);
    }
    @Test
    public void test6_2() throws Exception {
        testPoint(1.01,0.846832);
    }
    @Test
    public void test6_3() throws Exception {
        testPoint(1.4,0.98545);
    }
    @Test
    public void test7_1() throws Exception {
        testPoint(5.1,-0.92581);
    }
    @Test
    public void test7_2() throws Exception {
        testPoint(5.2,-0.88345);
    }
    @Test
    public void test7_3() throws Exception {
        testPoint(5.3,-0.83227);
    }
    @Test
    public void test8_1() throws Exception {
        testPoint(7.0,0.65697);
    }
    @Test
    public void test8_2() throws Exception {
        testPoint(7.1,0.728969);
    }
    @Test
    public void test8_3() throws Exception {
        testPoint(7.2,0.793668);
    }
    @Test
    public void test1(){
        testPoint(-Math.PI,0);
    }
    @Test
    public void test2(){
        testPoint(-Math.PI/2,-1);
    }
    @Test
    public void test3(){
        testPoint(0,0);
    }
    @Test
    public void test4(){
        testPoint(Math.PI/2,1);
    }
    @Test
    public void test5(){
        testPoint(Math.PI,0);
    }
    @Test
    public void test6(){
        testPoint(3*Math.PI/2,-1);
    }
    @Test
    public void tes7(){
        testPoint(2*Math.PI,0);
    }
}