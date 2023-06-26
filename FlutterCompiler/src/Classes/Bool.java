package Classes;

public class Bool extends Expression{
    public boolean bool;

    public Bool(boolean bool){
        this.bool = bool;
    }

    @Override
    public String toString() {
        return "Bool{" +
                "bool=" + bool +
                '}';
    }
}
