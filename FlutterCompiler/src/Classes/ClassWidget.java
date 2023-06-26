package Classes;

import java.util.ArrayList;
import java.util.List;

public class ClassWidget {
    public String ID;
    public List<Declaration> declarations;
    public Widget widget;


    public static final String ANSI_RED = "\u001B[31m";
    public static final String ANSI_YELLOW = "\u001B[33m";
    public static final String ANSI_LIGHT_GREEN = "\u001B[32m";
    public static final String ANSI_BLUE = "\u001B[34m";
    public static final String ANSI_LIGHT_BLUE = "\u001B[36m";
    public static final String ANSI_BURBLE = "\u001B[35m";
    public static final String ANSI_RESET = "\u001B[0m";


    public ClassWidget(){
        declarations = new ArrayList<>();
    }
    public ClassWidget(String ID, Widget widget) {
        this.ID = ID;
        this.widget = widget;
        declarations = new ArrayList<>();
    }

    public void addDeclaration(Declaration d){
        declarations.add(d);
    }

    public void setWidget(Widget widget) {
        this.widget = widget;
    }

    @Override
    public String toString() {
        return ANSI_BURBLE + "\nClass( " +
                "ID = ' " + ID + " '" +
                ", declarations = " + 2 +
                " ){\n" + ANSI_RESET +
                widget + ANSI_BURBLE +
                "\n}\n" + ANSI_RESET;
    }
}
