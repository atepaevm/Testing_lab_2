package Difficult;


import org.junit.Test;
import org.junit.runner.RunWith;
import org.powermock.core.classloader.annotations.PrepareForTest;
import org.powermock.modules.junit4.PowerMockRunner;

import static org.easymock.EasyMock.expect;
import static org.junit.Assert.*;
import static org.powermock.api.easymock.PowerMock.mockStatic;
import static org.powermock.api.easymock.PowerMock.replayAll;

@RunWith(PowerMockRunner.class)
@PrepareForTest({StubFunction.class,MinusFunc.class,PlusFunc.class})
public class FunctionTest {
    void mockAll(){
        mockStatic(MinusFunc.class);
        mockStatic(PlusFunc.class);
    }

    @Test
    public void FullStabPointOne() {
        double x=-1.0;
        mockAll();
        expect(MinusFunc.func(x)).andReturn(1.0);
        expect(PlusFunc.func(x)).andReturn(Double.NaN);
        replayAll();
        assertEquals(1.0,new StubFunction().func(x),0.01);
    }
}
