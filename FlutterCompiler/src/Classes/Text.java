package Classes;

public class Text extends Widget {
    public String text, color="black";
    public Variable identifier;
    public int fontSize = 24;

    public Text(String text){
        this.text = text;
    }

    public Text(){
    }

    public void setText(String text) {
        this.text = text;
    }

    public void setIdentifier(Variable identifier) {
        this.identifier = identifier;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void setFontSize(int fontSize) {
        this.fontSize = fontSize;
    }

    @Override
    public String toString() {
        return " Text{" +
                "text='" + text + '\'' +
                ", color='" + color + '\'' +
                ", fontSize=" + fontSize +
                '}';
    }
}
