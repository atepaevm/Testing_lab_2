package trigo;

public class Tangent {
    //private static Sine s=new Sine();
    //private static Cosine c=new Cosine();
    public static double tan(double x) {
        double cos=Cosine.cos(x);
        double sin=Sine.sin(x);
        if(Math.abs(cos)<0.000001)
            return Double.NaN;
        return sin/cos;
    }
}
