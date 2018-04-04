package trigo;

public class Cosecant {
    private static Cosine c=new Cosine();
    public static double cosec(double x){
        double res=c.cos(x);
        if(Math.abs(res)<0.0000001)
            return Double.NaN;
        return 1/c.cos(x);
    }
}
