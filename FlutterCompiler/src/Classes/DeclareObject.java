package Classes;

public class DeclareObject extends Expression{
    public String className , objectName;
    public InstantiatObject instanObject;

    public DeclareObject(String className , String objectName){
        this.className = className;
        this.objectName = objectName;
    }

    public DeclareObject(){}

    @Override
    public String toString() {
        return "\n        DeclareObject{" +
                "className = '" + className + '\'' +
                ", objectName = '" + objectName + '\'' +
                ", instanObject = " + instanObject +
                '}';
    }
}
