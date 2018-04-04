package Main;

import trigo.*;

public class Main {
    public static void main(String[] args){
        //NaturalLogarithm log=new NaturalLogarithm();
        //System.out.println(log.log(-4)==Double.NaN);
        //for(double i=0;i<10;i+=0.1)
        //    System.out.println(new Double(i).toString()+' '+new Double(log.log(i)).toString()+' '+new Double(Math.log(i)).toString());
        //Logarithm log=new Logarithm();
        //System.out.println(log.log(0.34,1245.23231));

        Cosecant cosec=new Cosecant();
        System.out.println(cosec.cosec(Math.PI/2));
        System.out.println(1/Math.cos(Math.PI/2));
        for(double i=-30;i<30;i+=0.00001)
            if(Math.abs(cosec.cosec(i)-1/Math.cos(i))>0.001) {
                System.out.println(i);
                System.out.println(cosec.cosec(i));
                System.out.println(1/Math.cos(i));
                System.out.println();
            }
    }
}
