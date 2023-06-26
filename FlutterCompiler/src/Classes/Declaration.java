package Classes;

public class Declaration extends Expression {
    public String ID;
    public String type;
    public Expression value;

    public static final String ANSI_RED = "\u001B[31m";
    public static final String ANSI_YELLOW = "\u001B[33m";
    public static final String ANSI_LIGHT_GREEN = "\u001B[32m";
    public static final String ANSI_BLUE = "\u001B[34m";
    public static final String ANSI_LIGHT_BLUE = "\u001B[36m";
    public static final String ANSI_BURBLE = "\u001B[35m";
    public static final String ANSI_RESET = "\u001B[0m";

    public Declaration(String ID , String type ){
        this.ID = ID;
        this.type = type;
    }

    public Declaration(String ID, String type ,Expression value){
        this.ID = ID;
        this.type = type;
        this.value = value;
    }

    public Declaration(){}

    @Override
    public String toString() {
        return ANSI_RESET + "\n        Declaration{" +
                "ID = ' " + ID + " '" +
                ", type = '" + type + '\'' +
                ", value = " + value +
                '}' + ANSI_RESET;
    }
}
