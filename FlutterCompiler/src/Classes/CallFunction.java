package Classes;

import java.util.ArrayList;
import java.util.List;
import java.util.WeakHashMap;

public class CallFunction extends Expression{
    public String ID;
    public List<Expression> arguments;
    public List<Widget> widgets;

    public CallFunction(){
        arguments = new ArrayList<>();
        widgets = new ArrayList<>();
    }

    public void addArgument(Expression e){
        arguments.add(e);
    }
    public void addWidget(Widget w){
        widgets.add(w);
    }

    @Override
    public String toString() {
        return "        CallFunction{" +
                "ID='" + ID + '\'' +
                ", arguments=" + arguments +
                ", widgets=" + widgets +
                '}';
    }
}
