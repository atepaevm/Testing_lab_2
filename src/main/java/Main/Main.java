package Main;

import csvOutput.CSVOutput;
import logarithms.Logarithm;
import trigo.*;

import java.io.FileNotFoundException;
import java.lang.reflect.InvocationTargetException;

public class Main {
    public static void main(String[] args) throws NoSuchMethodException, InvocationTargetException, IllegalAccessException, FileNotFoundException {
        //System.out.println(Logarithm.log(2,4));
        //System.out.println(Cosecant.cosec(-4.7));
        CSVOutput out=new CSVOutput();
        out.output("sin.csv",-10,10,0.1,Sine.class.getMethod("sin", double.class),Sine.class.getClass());
        out.output("cos.csv",-10,10,0.1,Cosine.class.getMethod("cos", double.class),Cosine.class.getClass());
        out.output("cosec.csv",-10,10,0.1,Cosecant.class.getMethod("cosec", double.class),Cosecant.class.getClass());
        out.output("tan.csv",-10,10,0.1,Tangent.class.getMethod("tan", double.class),Tangent.class.getClass());
        out.output("cot.csv",-10,10,0.1,Cotangent.class.getMethod("cot", double.class),Cotangent.class.getClass());
    }
}
