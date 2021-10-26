package calculator;

import static java.lang.Math.sqrt;

public class Calculator {
    public double sqr(int a){
        if (a < 0)
            return 0;
        else
            return sqrt(a);
    }

    public double rvs(int a){
        //Todo
        return 1.0 / a;
    }

    public double operate(int a, String opt){
        if(opt.equals("rvs"))
            return rvs(a);
        else if(opt.equals("sqr"))
            return sqr(a);
        throw new RuntimeException("Operator not defined.");
    }
}
