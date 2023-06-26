package Classes;

public class InkWell extends Widget{
    public Widget widget;
    public Navigator navigator;

    public InkWell(){}

    public InkWell(Widget widget) {
        this.widget = widget;
    }
    public InkWell(Widget widget, Navigator navigator) {
        this.widget = widget;
        this.navigator = navigator;
    }

    public void setWidget(Widget widget) {
        this.widget = widget;
    }

    public void setNavigator(Navigator navigator) {
        this.navigator = navigator;
    }

    @Override
    public String toString() {
        return "\n                       InkWell{\n" +
                "                           " + navigator +
                " ,\n                           " + widget +
                "\n                       " + '}' + "\n";
    }
}
