package trigo;

public class Cosine {
    private static Sine s=new Sine();
    public static double cos(double x){
        double res=s.sin(Sine.PI/2-x);
        if(Math.abs(res)<0.0000000001)
            return 0;
        return res;
    }
}
