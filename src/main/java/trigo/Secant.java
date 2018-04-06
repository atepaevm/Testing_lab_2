package trigo;

public class Secant {
    private static Sine s=new Sine();
    public double sec(double x){
        double res=s.sin(x);
        if(Math.abs(res)<0.0000001)
            return Double.NaN;
        return 1/s.sin(x);
    }
}
