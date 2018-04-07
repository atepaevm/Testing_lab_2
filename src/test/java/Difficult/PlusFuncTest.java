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
@PrepareForTest({PlusFunc.class,Logarithm.class,NaturalLogarithm.class})
public class PlusFuncTest {
    void mockAll(){
        mockStatic(NaturalLogarithm.class);
        mockStatic(Logarithm.class);
    }
    @Test
    public void test1(){
        mockAll();
        double x=-1.0;
        double delta=0.01;
        expect(NaturalLogarithm.log(x)).andReturn(100.0);
        expect(Logarithm.log(2,x)).andReturn(20.0);
        replayAll();
        assertEquals(120.0,new PlusFunc().func(x),0.01);
    }
}