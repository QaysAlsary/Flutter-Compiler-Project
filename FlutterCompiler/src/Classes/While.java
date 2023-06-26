package Classes;

import java.util.ArrayList;
import java.util.List;

public class While extends Loop{
    public List<Condition> conditions;
    public List<Statment> statments;

    public static final String ANSI_RED = "\u001B[31m";
    public static final String ANSI_YELLOW = "\u001B[33m";
    public static final String ANSI_LIGHT_GREEN = "\u001B[32m";
    public static final String ANSI_BLUE = "\u001B[34m";
    public static final String ANSI_LIGHT_BLUE = "\u001B[36m";
    public static final String ANSI_BURBLE = "\u001B[35m";
    public static final String ANSI_RESET = "\u001B[0m";

    public While(){
        conditions = new ArrayList<>();
        statments = new ArrayList<>();
    }

    public void addCondition(Condition c){
        conditions.add(c);
    }

    public void addStatment(Statment s){
        statments.add(s);
    }

    @Override
    public String toString() {
        return ANSI_LIGHT_BLUE + "\n\n    While{    " +
                "conditions=" + conditions +
                ", statments=" + statments + ANSI_LIGHT_BLUE +
                "\n    }\n" + ANSI_RESET;
    }
}
