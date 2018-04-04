package trigo;

public class Tangent {
    private static Sine s=new Sine();
    private static Cosine c=new Cosine();
    public static double tan(double x) {
        double cos=c.cos(x);
        if(Math.abs(cos)<0.000001)
            return Double.NaN;
        return s.sin(x) / c.cos(x);
    }
}
