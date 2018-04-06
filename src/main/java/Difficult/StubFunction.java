package Difficult;

import logarithms.Logarithm;
import logarithms.NaturalLogarithm;
import trigo.*;
import trigo.Cotangent;
public class StubFunction {
    public Sine sin=new Sine();
    public Cosine cos=new Cosine();
    public Tangent tan=new Tangent();
    public Cotangent cot=new Cotangent();
    public Secant sec=new Secant();
    public Cosecant cosec=new Cosecant();
    public Logarithm log=new Logarithm();
    public NaturalLogarithm nLog=new NaturalLogarithm();
    public double func(double x){
        return this.sin.sin(x);
        //if(x<=10)
        //    return this.sin.sin(x)+ this.cos.cos(x)+ this.cot.cot(x);
        //else
        //    return this.log.log(2,x)+this.log.log(5,x)+ this.nLog.log(x);
    }
}
