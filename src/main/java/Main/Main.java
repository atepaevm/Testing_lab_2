package Main;

import csvOutput.CSVOutput;
import trigo.*;

import java.io.FileNotFoundException;
import java.lang.reflect.InvocationTargetException;

public class Main {
    public static void main(String[] args) throws NoSuchMethodException, InvocationTargetException, IllegalAccessException, FileNotFoundException {
        //NaturalLogarithm log=new NaturalLogarithm();
        //System.out.println(log.log(-4)==Double.NaN);
        //for(double i=0;i<10;i+=0.1)
        //    System.out.println(new Double(i).toString()+' '+new Double(log.log(i)).toString()+' '+new Double(Math.log(i)).toString());
        //Logarithm log=new Logarithm();
        //System.out.println(log.log(0.34,1245.23231));
        CSVOutput out=new CSVOutput();
        out.output("test.csv",-10,10,0.1,Sine.class.getMethod("sin", double.class),Sine.class.getClass());
    }
}
