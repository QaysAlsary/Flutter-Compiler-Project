package Classes;

import java.util.*;

public class Class {
    public String ID;
    public List<Declaration> declarations;
    public List<Method> methods;

    public static final String ANSI_RED = "\u001B[31m";
    public static final String ANSI_YELLOW = "\u001B[33m";
    public static final String ANSI_LIGHT_GREEN = "\u001B[32m";
    public static final String ANSI_BLUE = "\u001B[34m";
    public static final String ANSI_LIGHT_BLUE = "\u001B[36m";
    public static final String ANSI_BURBLE = "\u001B[35m";
    public static final String ANSI_RESET = "\u001B[0m";

    public Class() {
        //this.ID = ID;
        methods = new ArrayList<>();
        declarations = new ArrayList<>();
    }
    public void addMethod(Method m){
        methods.add(m);
    }

    public void addDeclaration(Declaration d){
        declarations.add(d);
    }

    @Override
    public String toString() {
        return ANSI_BURBLE + "\nClass( " +
                "ID = ' " + ID + " '" +
                ", declarations = " + declarations.size() +
                ", methods = " + methods.size() +
                " ){\n" + ANSI_RESET +
                methods + ANSI_BURBLE +
                "\n}\n" + ANSI_RESET;
    }
}
