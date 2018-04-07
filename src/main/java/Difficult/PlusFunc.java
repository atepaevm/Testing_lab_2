package Difficult;

import logarithms.Logarithm;
import logarithms.NaturalLogarithm;
import trigo.Secant;
import trigo.Sine;
import trigo.Tangent;


public class PlusFunc {
    public static double func(double x){
        return Logarithm.log(2,x)+NaturalLogarithm.log(x);
    }
}
