package trigo;

public class Cosecant {
    public static double cosec(double x){
        double res=Cosine.cos(x);
        if(Math.abs(res)<0.0000001)
            return Double.NaN;
        return 1/res;
    }
}
