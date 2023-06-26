package Classes;

import java.util.ArrayList;

public class Column extends Widget
{
    public ArrayList<Widget> children;

    public Column(){
        children = new ArrayList<>();
    }
    public Column(ArrayList<Widget> children) {
        this.children = children;
    }

    public void addChild(Widget w){
        children.add(w);
    }

    @Override
    public String toString() {
        return " Column : children{\n                                "+children+"\n                           }";
    }
}
