package Classes;

import java.util.ArrayList;
import java.util.List;

public class If extends Statment{
    public List<Condition> conditions;
    public List<Statment> statments;
    public List<Statment> elseStatments;

    public static final String ANSI_RED = "\u001B[31m";
    public static final String ANSI_YELLOW = "\u001B[33m";
    public static final String ANSI_LIGHT_GREEN = "\u001B[32m";
    public static final String ANSI_BLUE = "\u001B[34m";
    public static final String ANSI_LIGHT_BLUE = "\u001B[36m";
    public static final String ANSI_BURBLE = "\u001B[35m";
    public static final String ANSI_RESET = "\u001B[0m";

    public If(){
        conditions = new ArrayList<>();
        statments = new ArrayList<>();
        elseStatments = new ArrayList<>();
    }

    public void addCondition(Condition c){
        conditions.add(c);
    }

    public void addStatment(Statment s){
        statments.add(s);
    }

    public void addElseStatment(Statment s){
        elseStatments.add(s);
    }

    @Override
    public String toString() {
        return ANSI_LIGHT_BLUE + "\n\n    If{   " +
                "conditions=" + conditions +
                ", statments=" + statments + ANSI_LIGHT_BLUE+
                "\n    }\n" + elseStatments + ANSI_RESET;
    }
}
