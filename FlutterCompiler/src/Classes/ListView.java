package Classes;

import java.util.ArrayList;
import java.util.List;

public class ListView extends Widget{
    public List<Widget> children;

    public ListView(){
        children = new ArrayList<>();
    }
    public ListView(ArrayList<Widget> children) {
        this.children = children;
    }

    public void addChild(Widget w){
        children.add(w);
    }

    @Override
    public String toString() {
        return "ListView{" +
                "children=" + children +
                '}';
    }
}
