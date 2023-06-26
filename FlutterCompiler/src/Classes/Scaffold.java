package Classes;

public class Scaffold extends Widget{
    public AppBar bar;
    public Body body;

    public Scaffold(AppBar bar, Body body) {
        this.bar = bar;
        this.body = body;
    }

    public Scaffold() {
    }

    @Override
    public String toString() {
        return "\n            Scaffold{" +
                 bar +
                ",\n                " + body +
                '}';
    }
}
