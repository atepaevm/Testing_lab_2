package logarithms;

public class NaturalLogarithm {
    private final static double  E=2.718281828459045;
    static public double log(double x){
        if(x==0)
            return Double.NEGATIVE_INFINITY;
        if(x<0)
            return Double.NaN;
        int count=1;
        while(x>NaturalLogarithm.E){
            ++count;
            x/=NaturalLogarithm.E;
        }
        return count+NaturalLogarithm.lessLog(x/NaturalLogarithm.E);
    }
    /*
    * log of x in (0;1]
    * */
    static double lessLog(double x){
        if(x<0||x>1)
            return Double.NaN;
        double sum=0;
        double tmp=x-1;
        double step=1;
        double delta=x-1;
        while(Math.abs(delta)>0){
            sum+=delta;
            //System.out.println(delta);
            ++step;
            tmp*=x-1;
            delta=-Math.abs(tmp/step);
        }
        return sum;
    }
}
