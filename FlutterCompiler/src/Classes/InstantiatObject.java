package Classes;

import java.util.ArrayList;
import java.util.List;

public class InstantiatObject extends Expression{
    public String className;
    public List<Expression> arguments;

    public InstantiatObject(){
        arguments = new ArrayList<>();
    }

    public void addArgument(Expression e){
        arguments.add(e);
    }

    @Override
    public String toString() {
        return "  InstantiatObject{" +
                "className = '" + className + '\'' +
                ", arguments = " + arguments +
                '}';
    }
}
