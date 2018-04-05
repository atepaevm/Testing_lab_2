package csvOutput;

import trigo.Sine;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class CSVOutput {
    public static void output(String path,double left,double right,double step,Method method,Class<?> c) throws InvocationTargetException, IllegalAccessException, FileNotFoundException {
        PrintWriter pw = new PrintWriter(new File(path));
        StringBuilder sb = new StringBuilder();
        for(double i=left;i<=right;i+=step){
            sb.append(i);
            sb.append(",");
            sb.append(method.invoke(c,i));
            sb.append("\n");
        }
        pw.write(sb.toString());
        pw.close();
        //double y=(Double)method.invoke(c,0.5);
        //System.out.println(y);
    }
}
