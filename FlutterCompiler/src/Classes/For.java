package Classes;

import java.util.ArrayList;
import java.util.List;

public class For extends Loop{
    public Expression startValue , endValue , increment;
    public List<Statment> statments;

    public static final String ANSI_RED = "\u001B[31m";
    public static final String ANSI_YELLOW = "\u001B[33m";
    public static final String ANSI_LIGHT_GREEN = "\u001B[32m";
    public static final String ANSI_BLUE = "\u001B[34m";
    public static final String ANSI_LIGHT_BLUE = "\u001B[36m";
    public static final String ANSI_BURBLE = "\u001B[35m";
    public static final String ANSI_RESET = "\u001B[0m";

    public For(){
        statments = new ArrayList<>();
    }

    public For(Expression startValue , Expression endValue , Expression increment){
        this.startValue = startValue;
        this.endValue = endValue;
        this.increment = increment;
        statments = new ArrayList<>();
    }

    public void addStatment(Statment s){
        statments.add(s);
    }

    @Override
    public String toString() {
        return ANSI_LIGHT_BLUE + "\n\n    For{  " +
                "startValue=" + startValue +
                " , endValue=" + endValue +
                " , increment=" + increment +
                " , statments=" + statments + ANSI_LIGHT_BLUE +
                "\n    }\n" + ANSI_RESET;
    }
}
