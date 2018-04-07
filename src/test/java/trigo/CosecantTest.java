package trigo;

import Difficult.MinusFunc;
import Difficult.PlusFunc;
import logarithms.Logarithm;
import logarithms.NaturalLogarithm;
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
@PrepareForTest({Cosecant.class, Cosine.class})
public class CosecantTest {
    private final double deltaX=0.01;
    private final double deltaY=0.1;
    private void testPoint(double x,double cosY,double expectedY){
        mockStatic(Cosine.class);
        expect(Cosine.cos(x-deltaX)).andReturn(cosY);
        expect(Cosine.cos(x)).andReturn(cosY);
        expect(Cosine.cos(x+deltaX)).andReturn(cosY);
        replayAll();
        assertEquals(expectedY,new Cosecant().cosec(x-deltaX),deltaY);
        assertEquals(expectedY,new Cosecant().cosec(x),deltaY);
        assertEquals(expectedY,new Cosecant().cosec(x+deltaX),deltaY);
    }
    @Test
    public void test1_1() throws Exception {
        double x=-7.687;
        double cosY=0.166207;
        double expectedY=6.017;
        testPoint(x,cosY,expectedY);
    }
    @Test
    public void test1_2() throws Exception {
        double x=-7.75;
        double cosY=0.103794;
        double expectedY=9.634435;
        testPoint(x,cosY,expectedY);
    }
    @Test
    public void test1_3() throws Exception {
        double x=-7.07;
        double expectedY=1.4162221;
        double cosY=0.706104;
        testPoint(x,cosY,expectedY);
    }
    @Test
    public void test2_1() throws Exception {
        double x=-5.5;
        double expectedY=1.411094;
        double cosY=0.708669774;
        testPoint(x,cosY,expectedY);
    }
    @Test
    public void test2_2() throws Exception {
        double x=-5.6;
        double expectedY=1.289381;
        double cosY=0.775566;
        testPoint(x,cosY,expectedY);
    }
    @Test
    public void test2_3() throws Exception {
        double x=-5.7;
        double expectedY=1.198017;
        double cosY=0.834713;
        testPoint(x,cosY,expectedY);
    }
    @Test
    public void test3_1() throws Exception {
        double x=-4.9;
        double expectedY=5.361575;
        double cosY=0.186512;
        testPoint(x,cosY,expectedY);
    }
    @Test
    public void test3_2() throws Exception {
        double x=-4.8;
        double expectedY=11.4287;
        double cosY=00.087499;
        testPoint(x,cosY,expectedY);
    }
    @Test
    public void test3_3() throws Exception {
        double x=-4.7;
        double expectedY=-80.719;
        double cosY=-0.01239;
        testPoint(x,cosY,expectedY);
    }
    @Test
    public void test4_1() throws Exception {
        double x=-3;
        double expectedY=-1.01011;
        double cosY=-0.988771;
        testPoint(x,cosY,expectedY);
    }
    @Test
    public void test4_2() throws Exception {
        double x=-2.8;
        double expectedY=-1.06132;
        double cosY=-0.94222;
        testPoint(x,cosY,expectedY);
    }
    @Test
    public void test4_3() throws Exception {
        double x=-2;
        double expectedY=-2.403;
        double cosY=-0.41615;
        testPoint(x,cosY,expectedY);
    }
    @Test
    public void test5_1() throws Exception {
        double x=-0.1;
        double expectedY=1.005021;
        double cosY=0.995004;
        testPoint(x,cosY,expectedY);
    }
    @Test
    public void test5_2() throws Exception {
        double x=-0.15;
        double expectedY=1.011356;
        double cosY=0.988771;
        testPoint(x,cosY,expectedY);
    }
    @Test
    public void test5_3() throws Exception {
        double x=-0.2;
        double expectedY=1.020339;
        double cosY=0.980067;
        testPoint(x,cosY,expectedY);
    }
    @Test
    public void test6_1() throws Exception {
        double x=0.2;
        double expectedY=1.020339;
        double cosY=0.980067;
        testPoint(x,cosY,expectedY);
    }
    @Test
    public void test6_2() throws Exception {
        double x=0.15;
        double expectedY=1.011356;
        double cosY=0.988771;
        testPoint(x,cosY,expectedY);
    }
    @Test
    public void test6_3() throws Exception {
        double x=-0.1;
        double expectedY=1.005021;
        double cosY=0.995004;
        testPoint(x,cosY,expectedY);
    }
    @Test
    public void test7_1() throws Exception {
        double x=3;
        double expectedY=-1.01011;
        double cosY=-0.988771;
        testPoint(x,cosY,expectedY);
    }
    @Test
    public void test7_2() throws Exception {
        double x=2.8;
        double expectedY=-1.06132;
        double cosY=-0.94222;
        testPoint(x,cosY,expectedY);
    }
    @Test
    public void test7_3() throws Exception {
        double x=2;
        double expectedY=-2.403;
        double cosY=-0.41615;
        testPoint(x,cosY,expectedY);
    }
    @Test
    public void test8_1() throws Exception {
        double x=-7.687;
        double cosY=0.166207;
        double expectedY=6.017;
        testPoint(x,cosY,expectedY);
    }
    @Test
    public void test8_2() throws Exception {
        double x=-7.75;
        double cosY=0.103794;
        double expectedY=9.634435;
        testPoint(x,cosY,expectedY);
    }
    @Test
    public void test8_3() throws Exception {
        double x=-7.07;
        double expectedY=1.4162221;
        double cosY=0.706104;
        testPoint(x,cosY,expectedY);
    }
    @Test
    public void test9_1() throws Exception {
        double x=-5.5;
        double expectedY=1.411094;
        double cosY=0.708669774;
        testPoint(x,cosY,expectedY);
    }
    @Test
    public void test9_2() throws Exception {
        double x=5.6;
        double expectedY=1.289381;
        double cosY=0.775566;
        testPoint(x,cosY,expectedY);
    }
    @Test
    public void test9_3() throws Exception {
        double x=5.7;
        double expectedY=1.198017;
        double cosY=0.834713;
        testPoint(x,cosY,expectedY);
    }
    @Test
    public void test1(){
        mockStatic(Cosine.class);
        expect(Cosine.cos(anyDouble())).andReturn(1.0);
        replayAll();
        assertEquals(1.0,new Cosecant().cosec(-2*Math.PI),deltaY);
    }
    @Test
    public void test2(){
        mockStatic(Cosine.class);
        expect(Cosine.cos(anyDouble())).andReturn(0.0);
        replayAll();
        assertEquals(Double.NaN,new Cosecant().cosec(-1.5*Math.PI),deltaY);
    }
    @Test
    public void test3(){
        mockStatic(Cosine.class);
        expect(Cosine.cos(anyDouble())).andReturn(1.0);
        replayAll();
        assertEquals(1.0,new Cosecant().cosec(-Math.PI),deltaY);
    }
    @Test
    public void test4(){
        mockStatic(Cosine.class);
        expect(Cosine.cos(anyDouble())).andReturn(0.0);
        replayAll();
        assertEquals(Double.NaN,new Cosecant().cosec(-0.5*Math.PI),deltaY);
    }
    @Test
    public void test5(){
        mockStatic(Cosine.class);
        expect(Cosine.cos(anyDouble())).andReturn(1.0);
        replayAll();
        assertEquals(1.0,new Cosecant().cosec(0*Math.PI),deltaY);
    }
    @Test
    public void test6(){
        mockStatic(Cosine.class);
        expect(Cosine.cos(anyDouble())).andReturn(0.0);
        replayAll();
        assertEquals(Double.NaN,new Cosecant().cosec(0.5*Math.PI),deltaY);
    }
    @Test
    public void test7(){
        mockStatic(Cosine.class);
        expect(Cosine.cos(anyDouble())).andReturn(1.0);
        replayAll();
        assertEquals(1.0,new Cosecant().cosec(1*Math.PI),deltaY);
    }
    @Test
    public void test8(){
        mockStatic(Cosine.class);
        expect(Cosine.cos(anyDouble())).andReturn(0.0);
        replayAll();
        assertEquals(Double.NaN,new Cosecant().cosec(1.5*Math.PI),deltaY);
    }
    @Test
    public void test9(){
        mockStatic(Cosine.class);
        expect(Cosine.cos(anyDouble())).andReturn(1.0);
        replayAll();
        assertEquals(1.0,new Cosecant().cosec(2*Math.PI),deltaY);;
    }
}