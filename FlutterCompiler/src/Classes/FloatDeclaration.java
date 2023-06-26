package Classes;

public class FloatDeclaration extends Declaration {
    public float value;

    public FloatDeclaration(String ID , String type , float value){
        this.ID = ID;
        this.type = type;
        this.value = value;
    }

    @Override
    public String toString() {
        return "\nFloatDeclaration{" +
                "value=" + value +
                ", ID='" + ID + '\'' +
                ", type='" + type + '\'' +
                '}';
    }
}
