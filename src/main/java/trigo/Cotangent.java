package trigo;

public class Cotangent {
    //private static Sine s=new Sine();
    //private static Cosine c=new Cosine();
    public static double cot(double x) {
        double sin=Sine.sin(x);
        double cos=Cosine.cos(x);
        if(Math.abs(sin)<0.000001)
            return Double.NaN;
        return cos/sin;
    }

}
