package Classes;

import java.util.Map;
import java.util.Stack;

public class Symbol {

    public String name, type;
    public Expression value;
    Stack<Map<String, Symbol>> currentScope;

    public void setName(String name) {
        this.name = name;
    }

    public void setType(String type) {
        this.type = type;
    }

    public void setValue(Expression value) {
        this.value = value;
    }

    public void setCurrentScope(Stack<Map<String, Symbol>> currentScope) {
        this.currentScope = currentScope;
    }

    public Symbol(String name, String type, Expression value, Stack<Map<String, Symbol>> currentScope) {
        this.name = name;
        this.type = type;
        this.value = value;
        this.currentScope = currentScope;
    }


    public Symbol(String name, String type, Stack<Map<String, Symbol>> currentScope) {
        this.name = name;
        this.type = type;
        this.currentScope = currentScope;
    }




    public Symbol() {
    }

}
