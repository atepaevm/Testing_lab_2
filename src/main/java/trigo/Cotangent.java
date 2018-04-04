package trigo;

public class Cotangent {
    private static Sine s=new Sine();
    private static Cosine c=new Cosine();
    public static double cot(double x) {
        double sin=s.sin(x);
        if(Math.abs(sin)<0.000001)
            return Double.NaN;
        return c.cos(x)/s.sin(x);
    }
}
