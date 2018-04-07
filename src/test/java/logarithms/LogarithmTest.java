package logarithms;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.powermock.core.classloader.annotations.PrepareForTest;
import org.powermock.modules.junit4.PowerMockRunner;
import trigo.Cosine;
import trigo.Sine;

import static org.easymock.EasyMock.anyDouble;
import static org.easymock.EasyMock.expect;
import static org.junit.Assert.*;
import static org.powermock.api.easymock.PowerMock.mockStatic;
import static org.powermock.api.easymock.PowerMock.replayAll;

@RunWith(PowerMockRunner.class)
@PrepareForTest({Logarithm.class, NaturalLogarithm.class})
public class LogarithmTest {
    private final double deltaX=0.01;
    private final double deltaY=0.01;
    private void testPoint(double base,double x,double expectedBase,double expectedX,double expectedY){
        mockStatic(NaturalLogarithm.class);
        expect(NaturalLogarithm.log(base)).andReturn(expectedBase);
        expect(NaturalLogarithm.log(x)).andReturn(expectedX);
        replayAll();
        assertEquals(expectedY,new Logarithm().log(base,x),deltaY);
    }
    @Test
    public void test1_1() throws Exception {
        double base=10;
        testPoint(2,1024,0.693147,6.93147,10.0);
    }
}
