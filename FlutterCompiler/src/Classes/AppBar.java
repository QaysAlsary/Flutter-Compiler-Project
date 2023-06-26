package Classes;

public class AppBar extends Widget{
    public Text title;

    public AppBar(){}

    public AppBar(Text title){
        this.title = title;
    }

    @Override
    public String toString() {
        return "\n                AppBar{" +
                "title=" + title +
                '}';
    }
}
