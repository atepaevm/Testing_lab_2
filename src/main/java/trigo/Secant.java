package trigo;

public class Secant {
    public static double sec(double x){
        double res=Sine.sin(x);
        if(Math.abs(res)<0.0000001)
            return Double.NaN;
        return 1/res;
    }
}
