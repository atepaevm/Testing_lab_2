package Difficult;

import logarithms.Logarithm;
import logarithms.NaturalLogarithm;
import trigo.Cosine;
import trigo.Cotangent;
import trigo.Sine;

public class StubFunction {
    public static double func(double x){
        if(x<=0)
            return Sine.sin(x)+ Cosine.cos(x)+ Cotangent.cot(x);
        else
            return Logarithm.log(2,x)+Logarithm.log(5,x)+ NaturalLogarithm.log(x);
    }
}
