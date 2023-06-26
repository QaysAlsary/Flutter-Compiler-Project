package visitor;

import Classes.*;
import Classes.Float;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class MethodProcessor {

    public HashMap<String, Object> values;



    public HashMap<String, Object> variablesValues;
    List<Method> list;
    public MethodProcessor(List<Method> list , HashMap<String , Object> variablesValues){
        this.list = list;
        this.variablesValues = variablesValues;
        values = new HashMap<>();
    }

    public HashMap<String,Object> getReturnValues(){
        //System.out.println(list.size()+"--------------");
        for(Method m : list){
            //System.out.println("----------------- " + m.ID + " ----------------");
            values.put(m.ID , getResult(m.returnValue));
        }
        return values;
    }

    public Object getResult(Expression e){
        if(e instanceof Int){
            Int i = (Int) e;
            return i.num;
        }
        else if(e instanceof StringExp){
            StringExp s = (StringExp) e;
            return s.str;
        }
        else if(e instanceof Float){
            Float f = (Float) e;
            return f.num;
        }
        else if(e instanceof Bool){
            Bool b = (Bool) e;
            return b.bool;
        }
        else if (e instanceof ExpressionPar){
            ExpressionPar exp = (ExpressionPar) e;
            return getResult(exp.exp);
        }
        else if(e instanceof Variable){
            Variable v = (Variable) e;
            if(variablesValues.get(v.id) != null)
                return variablesValues.get(v.id);
            else
                return "it has no value";
        }
        else if(e instanceof Addition){
            Addition add = (Addition) e;
            return (Integer)getResult(add.left) + (Integer) getResult(add.right);
        }
        else if(e instanceof Subtract){
            Subtract add = (Subtract) e;
            return (Integer)getResult(add.left) - (Integer) getResult(add.right);
        }
        else if(e instanceof Multiplication){
            Multiplication add = (Multiplication) e;
            return (Integer)getResult(add.left) * (Integer) getResult(add.right);
        }
        else if(e instanceof Divide){
            Divide add = (Divide) e;
            return (Integer)getResult(add.left) / (Integer) getResult(add.right);
        }
        else
            return "Wrong return value";
    }
}
