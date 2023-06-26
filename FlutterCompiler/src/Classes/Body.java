package Classes;

public class Body extends Widget{

    public Widget w;

    public Body(Widget w) {
        this.w = w;
    }

    public Body() {
    }

    @Override
    public String toString() {
        return "Body{\n                    " +
                 w +
                '}';
    }
}
