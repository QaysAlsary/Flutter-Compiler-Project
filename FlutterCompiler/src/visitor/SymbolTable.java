package visitor;

import Classes.Symbol;
import Classes.Variable;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Stack;

public class SymbolTable {
    private Stack<Map<String, Symbol>> scopes;

    public SymbolTable(){
        scopes = new Stack<>();
        scopes.push(new HashMap<>());
    }

    public Map enterScope(){
        return scopes.push(new HashMap<>());
    }

    public void exitScope(){
        scopes.pop();
    }

    public void addVariable(String name , Symbol symbol){
        scopes.peek().put(name , symbol);
    }

    public Stack<Map<String , Symbol>> getCurrentScope(){
        return scopes;
    }

    public Symbol getVariable(String name){
        for(int i = scopes.size() - 1 ; i>=0 ; i--){
            Map<String , Symbol> scope = scopes.get(i);
            if(scope.containsKey(name)){
                return scope.get(name);
            }
        }
        return null;
    }
    public boolean varAlreadyDefined(Stack<Map<String , Symbol>> currentScope , String name){
       if(currentScope.size()<=2){
                return false;
        }
        Map<String , Symbol> scope = currentScope.peek();

        if(scope.containsKey(name)){
            return true;
        }
        return false;
    }

}
