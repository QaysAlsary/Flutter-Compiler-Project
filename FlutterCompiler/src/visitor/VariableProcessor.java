package visitor;

import Classes.*;
import Classes.Float;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class VariableProcessor {
    public ArrayList<Symbol> vars;
    public HashMap<String , Object> values;

    public VariableProcessor(ArrayList<Symbol> vars){
        this.vars = vars;
        values = new HashMap<>();
    }

    public HashMap<String , Object> getVars(){
        for(Symbol s : vars){
            values.put(s.name , getResult((Expression) s.value)) ;
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
            return  s.str;
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
            return getResult((Expression) values.get(v.id));
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
