package Difficult;

import logarithms.Logarithm;
import logarithms.NaturalLogarithm;
import trigo.*;


public class MinusFunc {
    public static double func(double x){
        return Sine.sin(x)+ Tangent.tan(x)+ Secant.sec(x);
    }
}
