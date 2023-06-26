package Classes;

public class StringExp extends Expression{
    public String str;

    public StringExp(String str){
        this.str = str;
    }

    @Override
    public String toString() {
        return "StringExp{" +
                "str = " + str  +
                '}';
    }
}
