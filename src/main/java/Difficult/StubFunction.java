package Difficult;

import logarithms.Logarithm;
import logarithms.NaturalLogarithm;
//import org.mockito.Mock;
import trigo.*;
import trigo.Cotangent;
public class StubFunction {
    public double func(double x){
        if(x<=0){
            return MinusFunc.func(x);
        } else {
            return PlusFunc.func(x);
        }
    }
}

/*
 public Cosine cos=new Cosine();
    public Tangent tan=new Tangent();
    public Cotangent cot=new Cotangent();
    public Secant sec=new Secant();
    public Cosecant cosec=new Cosecant();
    public Logarithm log=new Logarithm();
    public NaturalLogarithm nLog=new NaturalLogarithm();
 */