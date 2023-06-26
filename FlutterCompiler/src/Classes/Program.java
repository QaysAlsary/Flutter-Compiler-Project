package Classes;

import java.util.ArrayList;
import java.util.List;

public class Program {
    public List<Class> classes;
    public List<ClassWidget> classWidgets;
    public List<Method> methods;

    public Program(){
        classes = new ArrayList<>();
        classWidgets = new ArrayList<>();
        methods = new ArrayList<>();
    }

    public void addMethod(Method m){
        methods.add(m);
    }

    public void addClass(Class c){
        classes.add(c);
    }

    public void addClassWidget(ClassWidget cw){
        classWidgets.add(cw);
    }
    @Override
    public String toString() {
        return "Program{\n" +
                "\n---------- classes ----------" + classes +
                "\n"+
                "\n---------- class widgets ----------" + classWidgets +
                "\n"+
                "\n---------- methods outside class ----------" + methods +
                "\n    ";
    }
}
