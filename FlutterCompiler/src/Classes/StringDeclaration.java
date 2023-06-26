package Classes;

public class StringDeclaration extends Declaration{
    public String value;

    public StringDeclaration(String ID , String type , String value){
        this.ID = ID;
        this.type = type;
        this.value = value;
    }

    @Override
    public String toString() {
        return "\nStringDeclaration{" +
                "value='" + value + '\'' +
                ", ID='" + ID + '\'' +
                ", type='" + type + '\'' +
                '}';
    }
}
