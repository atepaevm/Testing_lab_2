package logarithms;

public class Logarithm {
    private static NaturalLogarithm nLog=new NaturalLogarithm();
    public static double log(double base,double x){
        if(base<=0||x<=0||Math.abs(base-1)<0.00001)
            return Double.NaN;
        return nLog.log(x)/nLog.log(base);
    }
}

