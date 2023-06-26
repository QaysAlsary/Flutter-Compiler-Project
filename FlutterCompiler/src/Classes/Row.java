package Classes;

import java.util.ArrayList;

public class Row extends Widget{
    public ArrayList<Widget> children;

    public Row(ArrayList<Widget> children) {
        this.children = children;
    }

    public Row() {
        children = new ArrayList<>();
    }

    public void addChild(Widget w){
        children.add(w);
    }

    @Override
    public String toString() {
        return "\n            children{"+children+"}";
    }
}
