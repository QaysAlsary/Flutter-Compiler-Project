package visitor;

import Classes.*;
import Classes.Class;
import antlr.*;
import org.antlr.v4.gui.TestRig;
import org.antlr.v4.runtime.Token;

import javax.swing.plaf.multi.MultiInternalFrameUI;
import java.awt.event.WindowStateListener;
import java.lang.Float;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class dartVisitor extends dartBaseVisitor{

    public List<String> semanticErrors ;

    public ArrayList<Symbol> vars ;

    public List<Method> methods;//store all the methods in the program

    public HashMap<String , Body> screens;


    SymbolTable symbolTable ;

    public dartVisitor(){
        semanticErrors = new ArrayList<>();
        vars = new ArrayList<>();
        //assignedVars = new HashMap<>();
        methods = new ArrayList<>();
        screens = new HashMap<>();
        symbolTable = new SymbolTable();
    }

    @Override
    public Program visitProgram(dartParser.ProgramContext ctx) {
        Program prog = new Program();
        //symbolTable.enterScope();
        int m = 0,c=0;
        for(int i=0 ; i< ctx.getChildCount() ; i++) {
            if(visit(ctx.getChild(i)) instanceof Class){
                prog.addClass((Class) visit(ctx.getChild(i)));
                c++;
            }
            else if(visit(ctx.getChild(i)) instanceof ClassWidget){
                prog.addClassWidget((ClassWidget) visit(ctx.getChild(i)));
            }
            else{
                prog.addMethod((Method) visit(ctx.getChild(i)));
                m++;
            }
        }
       // symbolTable.exitScope();
        return prog;
    }

    //--------------------------------------------------------------------

    @Override
    public Class visitClasses(dartParser.ClassesContext ctx) {
        symbolTable.enterScope();
        Class class1 = new Class();
        String id = ctx.getChild(1).getText();
        class1.ID = id;
        int i = 3;
        while(!ctx.getChild(i).getText().equals("}")){
            if(visit(ctx.getChild(i)) instanceof Declaration)
                class1.addDeclaration((Declaration) visit(ctx.getChild(i)));
            else
                class1.addMethod((Method) visit(ctx.getChild(i)));
            i++;
        }
        symbolTable.exitScope();
        return class1;
    }

//    @Override
//    public Declaration visitDeclareStat(dartParser.DeclContext ctx) {
////        String type = ctx.getChild(0).getText();
////        String id = ctx.getChild(1).getText();
////        if(ctx.getChildCount()>3){
////            Expression value = (Expression) visit(ctx.getChild(3));
////
////            assignedVars.put(id,value);
////
////            //System.out.println("            visiting decl : " + type + " " + id + " = " + value.toString());
////            return new Declaration(id, type , value);
////        }
////        else{
////            //System.out.println("            visiting decl : " + type + " " + id + ";");
////            return new Declaration(id,type);
////        }
//        return (Declaration)visit(ctx.getChild(0));
//    }


    @Override
    public Method visitMethod(dartParser.MethodContext ctx) {
        symbolTable.enterScope();
        Method method = new Method();
        String type = ctx.getChild(0).getText();
        String id = ctx.getChild(1).getText();
        method.ID = id;
        method.returnType = type;

        int i = 3 ,p=0,s=0;
        while(!ctx.getChild(i).getText().equals(")")){
            p++;

            String paramType = ctx.getChild(i).getText();
            String paramName = ctx.getChild(i+1).getText();

            method.addParameter(paramType,paramName);

            if(ctx.getChild(i+2).getText().equals(","))
                i+=3;
            else
                i+=2;
        }
        i+=2;
        while(!ctx.getChild(i).getText().equals("return")){
            method.addStatment((Statment) visit(ctx.getChild(i)));
            i++;
            s++;
        }

        method.returnValue = (Expression) visit(ctx.getChild(i+1));

        if(!methods.contains(method)){
            methods.add(method);
        }
        symbolTable.exitScope();
        return method;
    }

    @Override
    public If visitIfCondition(dartParser.IfConditionContext ctx) {
        symbolTable.enterScope();
        If ifCond = new If();

        int i = 2,s=0;
        while(!ctx.getChild(i).getText().equals(")")){
            ifCond.addCondition((Condition) visit(ctx.getChild(i)));
            if(ctx.getChild(i+1).getText().equals("&&") || ctx.getChild(i+1).getText().equals("||"))
                i+=2;
            else
                i++;
        }
        i+=2;

        while(!ctx.getChild(i).getText().equals("}")){
                ifCond.addStatment((Statment) visit(ctx.getChild(i)));
                i++;
                s++;
        }
        symbolTable.exitScope();
        return ifCond;
    }

    @Override
    public While visitWhileLoop(dartParser.WhileLoopContext ctx) {
        symbolTable.enterScope();
        While whileLoop = new While();

        int i = 2,s=0;
        while(!ctx.getChild(i).getText().equals(")")){
            whileLoop.addCondition((Condition) visit(ctx.getChild(i)));
            if(ctx.getChild(i+1).getText().equals("&&") || ctx.getChild(i+1).getText().equals("||"))
                i+=2;
            else
                i++;
        }
        i+=2;

        while(!ctx.getChild(i).getText().equals("}")){
            whileLoop.addStatment((Statment) visit(ctx.getChild(i)));
            i++;
            s++;
        }
        symbolTable.exitScope();
        return whileLoop;
    }

    @Override
    public For visitForLoop(dartParser.ForLoopContext ctx) {
        symbolTable.enterScope();
        Expression startValue = (Expression) visit(ctx.getChild(4));
        Expression endValue = (Expression) visit(ctx.getChild(8));
        Expression increment = (Expression) visit(ctx.getChild(12));

        For forLoop = new For(startValue, endValue, increment);

        int i = 15,s=0;
        while(!ctx.getChild(i).getText().equals("}")){
            forLoop.addStatment((Statment) visit(ctx.getChild(i)));
            i++;
            s++;
        }
        symbolTable.exitScope();
        return forLoop;
    }

    @Override
    public ExpressionPar visitParenExpression(dartParser.ParenExpressionContext ctx) {
        Expression exp = (Expression) visit(ctx.getChild(1));
        return new ExpressionPar(exp);
    }

    @Override
    public Condition visitCondition(dartParser.ConditionContext ctx) {
        Expression left = (Expression) visit(ctx.getChild(0));
        Expression right = (Expression) visit(ctx.getChild(2));
        String str = ctx.getChild(1).getText();

        return new Condition(left, right, str);
    }

    @Override
    public Assignment visitAssignment(dartParser.AssignmentContext ctx) {
        String id = ctx.getChild(0).getText();
        Expression value = (Expression) visit(ctx.getChild(2));
        Token idToken = ctx.ID().getSymbol();
        int line = idToken.getLine();
        int column = idToken.getCharPositionInLine() + 1;
        Symbol symbol = symbolTable.getVariable(id);

        if(symbol == null){
            if(!semanticErrors.contains("Error : Undefined variable " + id + " on line " + line + " , column " /* + " in class : " + ctx.getParent().getParent().getChild(1).getText()*/))
                semanticErrors.add("Error : Undefined variable " + id + " on line " + line + " , column " /* + " in class : " + ctx.getParent().getParent().getChild(1).getText()*/);
        }
        if (semanticErrors.contains(id)) {
            semanticErrors.remove(id);
        }

        symbol.setValue(value);
        vars.add(symbol);
//        if (symbol.value == null) {
//            symbol.setValue(value);
//            vars.add(symbol);
//            //assignedVars.put(id, value);
//        } else {
//            symbol.setValue(value);
//            //assignedVars.put(id + " new ", value);
//        }
        return new Assignment(id, value);
    }

    @Override
    public Subtract visitSubtract(dartParser.SubtractContext ctx) {
        Expression left = (Expression) visit(ctx.getChild(0));
        Expression right = (Expression) visit(ctx.getChild(2));

        return new Subtract(left, right);
    }

    @Override
    public Divide visitDivide(dartParser.DivideContext ctx) {
        Expression left = (Expression) visit(ctx.getChild(0));
        Expression right = (Expression) visit(ctx.getChild(2));

        return new Divide(left, right);
    }

    @Override
    public Multiplication visitMultiplication(dartParser.MultiplicationContext ctx) {
        Expression left = (Expression) visit(ctx.getChild(0));
        Expression right = (Expression) visit(ctx.getChild(2));

        return new Multiplication(left, right);
    }

    @Override
    public Addition visitAddition(dartParser.AdditionContext ctx) {
        Expression left = (Expression) visit(ctx.getChild(0));
        Expression right = (Expression) visit(ctx.getChild(2));

        return new Addition(left, right);
    }

    @Override
    public Variable visitIdentifier(dartParser.IdentifierContext ctx) {
        Token idToken = ctx.ID().getSymbol();
        int line = idToken.getLine();
        int column = idToken.getCharPositionInLine() + 1;
        String id = ctx.getChild(0).getText();
        Symbol symbol = symbolTable.getVariable(id);
        if(symbol == null){
            if(!semanticErrors.contains("Error : Undefined variable " + id + " on line " + line + " , column " + column /* + " in class : " + ctx.getParent().getParent().getChild(1).getText()*/))
                semanticErrors.add("Error : Undefined variable " + id + " on line " + line + " , column " + column /* + " in class : " + ctx.getParent().getParent().getChild(1).getText()*/);
        }else{
            if (symbol.value == null) {
                if (!semanticErrors.contains("Error : variable " + id + " does not initialized on line " + line + " , column " + column)) {
                    if (!semanticErrors.contains("Error : variable " + id + " does not have value on line " + line + " , column " + column))
                        semanticErrors.add("Error : variable " + id + " does not have value on line " + line + " , column " + column);
                }
            }
        }

        return new Variable(id);
    }

    @Override
    public StringExp visitString(dartParser.StringContext ctx) {
        String str = ctx.getChild(0).getText();

        return new StringExp(str);
    }

    @Override
    public Bool visitBool(dartParser.BoolContext ctx) {
        String boolText = ctx.getChild(0).getText();
        boolean bool = Boolean.parseBoolean(boolText);

        return new Bool(bool);
    }

    @Override
    public Int visitInteger(dartParser.IntegerContext ctx) {
        String numText = ctx.getChild(0).getText();
        int num = Integer.parseInt(numText);

        return new Int(num);
    }

    @Override
    public Classes.Float visitFloat(dartParser.FloatContext ctx) {
        String numText = ctx.getChild(0).getText();
        float num = Float.parseFloat(numText);

        return new Classes.Float(num);
    }

    @Override
    public Declaration visitDeclaration(dartParser.DeclarationContext ctx) {
        Token idToken = ctx.ID().getSymbol();
        int line = idToken.getLine();
        int column = idToken.getCharPositionInLine() + 1;

        String type = ctx.getChild(0).getText();
        String id = ctx.getChild(1).getText();
        Symbol symbol = new Symbol(id,type,symbolTable.getCurrentScope());



        if(ctx.getChildCount()>3){
            Expression value = (Expression) visit(ctx.getChild(3));
            symbol.setValue(value);
            if(symbolTable.varAlreadyDefined(symbolTable.getCurrentScope(), symbol.name)){
                if(!semanticErrors.contains("Error : Variable " + id + " is already defined on line " + line + " , column " + column ))
                    semanticErrors.add("Error : Variable " + id + " is already defined on line " + line + " , column " + column);
                return null;

            }else{
                symbolTable.addVariable(id, symbol);
                vars.add(symbol);
            }
            return new Declaration(id, type , value);
        }
        else{
            if(symbolTable.varAlreadyDefined(symbolTable.getCurrentScope(), id)){
                if(!semanticErrors.contains("Error : Variable " + id + " is already defined on line " + line + " , column " + column ))
                    semanticErrors.add("Error : Variable " + id + " is already defined on line " + line + " , column " + column);
                return null;
            }else{
                symbolTable.addVariable(id, symbol);
            }
            return new Declaration(id,type);
        }
    }

    @Override
    public Assignment visitAssignStat(dartParser.AssignStatContext ctx) {
        return (Assignment)visit(ctx.getChild(0));
    }

    @Override
    public Declaration visitDeclareStat(dartParser.DeclareStatContext ctx) {
        return (Declaration) visit(ctx.getChild(0));
    }

    @Override
    public If visitIfStat(dartParser.IfStatContext ctx) {
        return (If) visit(ctx.getChild(0));
    }

    @Override
    public For visitForStat(dartParser.ForStatContext ctx) {
        return (For)visit(ctx.getChild(0));
    }

    @Override
    public While visitWhileStat(dartParser.WhileStatContext ctx) {
        return (While)visit(ctx.getChild(0));
    }

    @Override
    public CallFunction visitCallingFunctionStat(dartParser.CallingFunctionStatContext ctx) {
        return (CallFunction) visit(ctx.getChild(0));
    }

    @Override
    public CallFunction visitCallingFunction(dartParser.CallingFunctionContext ctx) {
        CallFunction call = new CallFunction();
        call.ID = ctx.getChild(0).getText();
        int i = 2;
        while(!ctx.getChild(i).getText().equals(")")){
            if(!ctx.getChild(i).getText().equals(",")){
                if(visit(ctx.getChild(i)) instanceof Expression){
                    call.addArgument((Expression) visit(ctx.getChild(i)));
                }
                else{
                    call.addWidget((Widget) visit(ctx.getChild(i)));
                }
            }
            i++;
        }
        return call;
    }

    @Override
    public ObjectCallFunction visitCallingFuncitonFromObjectStat(dartParser.CallingFuncitonFromObjectStatContext ctx) {
        return (ObjectCallFunction) visit(ctx.getChild(0));
    }

    @Override
    public ObjectCallFunction visitCallingFuncitonFromObject(dartParser.CallingFuncitonFromObjectContext ctx) {
        ObjectCallFunction objectCall = new ObjectCallFunction();
        objectCall.object = ctx.getChild(0).getText();
        objectCall.callFunction = (CallFunction)visit(ctx.getChild(2));
        return objectCall;
    }

    @Override
    public Object visitPrintOutput(dartParser.PrintOutputContext ctx) {
        return visit(ctx.getChild(2));
    }

    @Override
    public DeclareObject visitDeclaringObjectStat(dartParser.DeclaringObjectStatContext ctx) {
        return (DeclareObject) visit(ctx.getChild(0));
    }

    @Override
    public InstantiatObject visitInstantiatingObjectStat(dartParser.InstantiatingObjectStatContext ctx) {
        return (InstantiatObject) visit(ctx.getChild(0));
    }

    @Override
    public DeclareObject visitDeclaringObject(dartParser.DeclaringObjectContext ctx) {
        DeclareObject declareObject = new DeclareObject();
        declareObject.className = ctx.getChild(0).getText();
        declareObject.objectName = ctx.getChild(1).getText();

        if(ctx.getChildCount() == 3)
            return declareObject;
        else{
            declareObject.instanObject =(InstantiatObject) visit(ctx.getChild(3));
            return declareObject;
        }
    }

    @Override
    public InstantiatObject visitInstantiatingObject(dartParser.InstantiatingObjectContext ctx) {
        InstantiatObject instantiatObject = new InstantiatObject();
        instantiatObject.className = ctx.getChild(1).getText();
        int i = 3;
        while(!ctx.getChild(i).getText().equals(")")){
            instantiatObject.addArgument((Expression)visit(ctx.getChild(i)));
            i++;
        }
        return instantiatObject;
    }

    /**
     * flutter visitors
     * @param ctx
     * @return
     */


    @Override
    public Widget visitWidget(dartParser.WidgetContext ctx) {
        return (Widget) visit(ctx.getChild(0));
    }

    @Override
    public Scaffold visitMaterialWidget(dartParser.MaterialWidgetContext ctx) {
        return (Scaffold) visit(ctx.getChild(4));
    }

    @Override
    public Scaffold visitScaffoldWidget(dartParser.ScaffoldWidgetContext ctx) {
        Scaffold scaffold = new Scaffold();
        scaffold.bar = (AppBar)visit(ctx.getChild(4));
        scaffold.body = (Body) visit(ctx.getChild(8));

        return scaffold;
    }

    @Override
    public Body visitBody(dartParser.BodyContext ctx) {
        Body body = new Body();
        body.w = (Widget)visit(ctx.getChild(0));
        String name = ctx.getParent().getParent().getParent().getParent().getChild(1).getText();
        screens.put(name , body);
        return body;
    }

    @Override
    public AppBar visitAppBarWidget(dartParser.AppBarWidgetContext ctx) {
        AppBar bar = new AppBar();
        bar.title = (Text)visit(ctx.getChild(4));

        return bar;
    }

    @Override
    public Object visitTextWidget(dartParser.TextWidgetContext ctx) {
        Text text = new Text();
        Expression e = (Expression) visit(ctx.getChild(2));
        if(e instanceof StringExp)
            text.setText(((StringExp) e).str.replaceAll("\"", ""));
        else if(e instanceof Variable)
            text.setIdentifier(((Variable) e));
        if(ctx.getChild(3).getText().equals(",")){
            if(!ctx.getChild(8).getText().equals(")")){
                if(ctx.getChild(8).getText().equals("fontSize")){
                    String text1 = ctx.getChild(10).getText();
                    text.setFontSize(Integer.parseInt(text1));
                }else{
                    String text1 = ctx.getChild(11).getText();
                    text.setColor(text1);
                }
                if(!ctx.getChild(12).getText().equals(")")){
                    if(ctx.getChild(11).getText().equals(",")){
                        String text1 = ctx.getChild(15).getText();
                        text.setColor(text1);
                    }else{
                        String text1 = ctx.getChild(15).getText();
                        text.setFontSize(Integer.parseInt(text1));
                    }
                }
            }

        }
        return text;
    }

    @Override
    public Row visitRowWidget(dartParser.RowWidgetContext ctx) {
        Row row = new Row();
        int i = 5;

        while(!ctx.getChild(i).getText().equals("]")){
            if(!ctx.getChild(i).getText().equals(",")) {
                row.addChild((Widget) visit(ctx.getChild(i)));
            }
            i++;
        }

        return row;
    }

    @Override
    public Column visitColumnWidget(dartParser.ColumnWidgetContext ctx) {
        Column column = new Column();
        int i = 5;

        while(!ctx.getChild(i).getText().equals("]")){
            if(!ctx.getChild(i).getText().equals(",")){
                column.addChild((Widget) visit(ctx.getChild(i)));
            }
            i++;
        }
        return column;
    }

    @Override
    public Image visitImageWidget(dartParser.ImageWidgetContext ctx) {
        Image image = new Image();
        Expression e = (Expression) visit(ctx.getChild(6));
        if(e instanceof StringExp)
            image.setPath(((StringExp) e).str.replaceAll("\"", ""));
        else if(e instanceof Variable)
            image.setIdentifier(((Variable) e));

        if(ctx.getChild(8).getText().equals(",")){
            String text1 = ctx.getChild(11).getText();
            if(ctx.getChild(9).getText().equals("height")){
                image.setHeight(Integer.parseInt(text1));
            }else{
                image.setWidth(Integer.parseInt(text1));
            }
            if(ctx.getChild(12).getText().equals(",")){
                String text = ctx.getChild(15).getText();
                if(ctx.getChild(13).getText().equals("height")){
                    image.setHeight(Integer.parseInt(text));
                }else{
                    image.setWidth(Integer.parseInt(text));
                }
            }
        }
        return image;
    }

    @Override
    public ListView visitListViewWidget(dartParser.ListViewWidgetContext ctx) {
        ListView listView = new ListView();
        int i = 5;

        while(!ctx.getChild(i).getText().equals("]")){
            if(!ctx.getChild(i).getText().equals(",")){
                listView.addChild((Widget) visit(ctx.getChild(i)));
            }
            i++;
        }

        return listView;
    }

    @Override
    public InkWell visitInkWellWidget(dartParser.InkWellWidgetContext ctx) {
        Navigator navigator = (Navigator)visit(ctx.getChild(7)) ;
        Widget widget = (Widget)visit(ctx.getChild(12));
        InkWell inkWell = new InkWell(widget, navigator);

        return inkWell;

    }

    @Override
    public Navigator visitNavigatorWidget(dartParser.NavigatorWidgetContext ctx) {
        Navigator navigator = new Navigator();
        navigator.setDistClass(ctx.getChild(13).getText().replaceAll("\"", ""));
        navigator.setTitle(ctx.getChild(15).getText().replaceAll("\"", ""));
        navigator.setImage(ctx.getChild(17).getText().replaceAll("\"", ""));
        navigator.setDescription(ctx.getChild(19).getText().replaceAll("\"", ""));

        return navigator;
    }

    @Override
    public ClassWidget visitWidgetClass(dartParser.WidgetClassContext ctx) {
        ClassWidget classWidget = new ClassWidget();
        String id = ctx.getChild(1).getText();
        classWidget.ID = id;
        int i = 5;
        while(!ctx.getChild(i).getText().equals("@override")){
            if(visit(ctx.getChild(i)) instanceof Declaration)
                classWidget.addDeclaration((Declaration) visit(ctx.getChild(i)));
            i++;
        }
        classWidget.setWidget((Widget)visit(ctx.getChild(ctx.getChildCount()-4)));
        return classWidget;
    }
}
