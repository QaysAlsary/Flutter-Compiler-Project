package Classes;

import java.util.ArrayList;
import java.util.List;

public class ObjectCallFunction extends Expression{
    public String object ;
    public CallFunction callFunction;

    public ObjectCallFunction(){
    }

    @Override
    public String toString() {
        return "\n        ObjectCallFunction{" +
                "object = '" + object + '\'' +
                ", callFunction = " + callFunction +
                '}';
    }
}
