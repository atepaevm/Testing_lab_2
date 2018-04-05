package Difficult;
import static org.mockito.Mockito.*;
public class Stub {
    private static boolean isEqual(double a,double b){
        return Math.abs(a-b)<0.00001;
    }
    /*
    public static double sin(double x){
        (new Double(x)).compareTo(0.0);
        //Stub.isEqual(x,0.0)
        when( 0.5).thenReturn(1.0);
    }
    */
}
