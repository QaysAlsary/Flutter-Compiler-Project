package Classes;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Method {
    public String ID , returnType;
    public Expression returnValue;
    public Map<String , String> parameters;
    public List<Statment> statments;

    public static final String ANSI_RED = "\u001B[31m";
    public static final String ANSI_YELLOW = "\u001B[33m";
    public static final String ANSI_LIGHT_GREEN = "\u001B[32m";
    public static final String ANSI_BLUE = "\u001B[34m";
    public static final String ANSI_LIGHT_BLUE = "\u001B[36m";
    public static final String ANSI_BURBLE = "\u001B[35m";
    public static final String ANSI_RESET = "\u001B[0m";

    public Method(){
        //this.ID = ID;
        //this.returnType = returnType;
        parameters = new HashMap<>();
        statments = new ArrayList<>();
    }

    public void addParameter(String type , String var){
        parameters.put(type , var);
    }

    public void addStatment(Statment s){
        statments.add(s);
    }

    @Override
    public String toString() {
        return ANSI_LIGHT_GREEN + "\n\nMethod(  " +
                "ID = ' " + ID + " '" +
                " , returnType = '" + returnType + '\'' +
                " , returnValue = " + returnValue + ANSI_LIGHT_GREEN +
                " , parameters = " + parameters +
                " , statments = " + statments.size() +
                "  ){\n" + ANSI_RESET +
                statments + ANSI_LIGHT_GREEN +
                "\n}\n" + ANSI_RESET;
    }
}
