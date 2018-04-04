package trigo;

public class Sine {
    final public static double PI=3.141592653589793;
    public static double sin(double x){
        x%=(2* Sine.PI);
        if(Math.abs(x)<0.0000000001)
            return 0;
        double delta=x;
        double sum=0;
        double step=1;
        while(Math.abs(delta)>0){
            sum+=delta;
            delta=-delta*x*x/(step+1)/(step+2);
            step+=2;
        }
        return sum;
    }
}
