package Difficult;

import logarithms.Logarithm;
import logarithms.NaturalLogarithm;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import trigo.*;

import static org.junit.Assert.*;
import static org.junit.Assert.*;
import static org.mockito.Matchers.anyDouble;
import static org.mockito.Mockito.doReturn;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;
public class StubFunctionTest {
    private StubFunction stub=new StubFunction();
    private Sine sin=new Sine();
    private Cosine cos=new Cosine();
    private Tangent tan=new Tangent();
    private Cotangent cot=new Cotangent();
    private Secant sec=new Secant();
    private Cosecant cosec=new Cosecant();
    private Logarithm log=new Logarithm();
    private NaturalLogarithm nLog=new NaturalLogarithm();
    @Before
    public void setUp(){
        this.stub=mock(StubFunction.class);
        this.stub.sin=mock(Sine.class);
        this.stub.cos=mock(Cosine.class);
        this.stub.tan=mock(Tangent.class);
        this.stub.cot=mock(Cotangent.class);
        this.stub.sec=mock(Secant.class);
        this.stub.cosec=mock(Cosecant.class);
        this.stub.log=mock(Logarithm.class);
        this.stub.nLog=mock(NaturalLogarithm.class);
    }
    @Test
    public void StubTest() {
        //doReturn(666.0).when(stub.sin).sin(anyDouble());
        when(stub.sin.sin(0.5)).thenReturn(666.0);
        //when(stub.func(anyDouble())).thenReturn(123.0);
        //doReturn(1.0).when(cos).cos(0.0);
        //doReturn(0.123).when(cot).cot(0.0);
        //when(stub.sin.sin(0.0)).thenReturn(1.0);
        //when(1.0).thenReturn(2.0);
       //when(2.0).thenReturn(3.0);
        //when(sin.sin(0.0)).thenReturn(0.0);
        //when(stub.cos.cos(0.0)).thenReturn(1.0);
        //when(stub.cot.cot(0.0)).thenReturn(0.0);
        Double res=stub.func(0.5);
        int x;
        //assertEquals(res,1.0,0.1);
    }
}