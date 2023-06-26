package Classes;

public class IntDeclaration extends Declaration {
    public int value;

    public IntDeclaration(int value , String ID , String type){
        this.value = value;
        this.ID = ID;
        this.type = type;
    }

    @Override
    public String toString() {
        return  type + ID + new Integer(value).toString();
    }
}
