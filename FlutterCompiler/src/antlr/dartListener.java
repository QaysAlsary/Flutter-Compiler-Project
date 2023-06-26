// Generated from java-escape by ANTLR 4.11.1

    package antlr;

import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link dartParser}.
 */
public interface dartListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by the {@code Program}
	 * labeled alternative in {@link dartParser#prog}.
	 * @param ctx the parse tree
	 */
	void enterProgram(dartParser.ProgramContext ctx);
	/**
	 * Exit a parse tree produced by the {@code Program}
	 * labeled alternative in {@link dartParser#prog}.
	 * @param ctx the parse tree
	 */
	void exitProgram(dartParser.ProgramContext ctx);
	/**
	 * Enter a parse tree produced by the {@code widgetClass}
	 * labeled alternative in {@link dartParser#widget_class}.
	 * @param ctx the parse tree
	 */
	void enterWidgetClass(dartParser.WidgetClassContext ctx);
	/**
	 * Exit a parse tree produced by the {@code widgetClass}
	 * labeled alternative in {@link dartParser#widget_class}.
	 * @param ctx the parse tree
	 */
	void exitWidgetClass(dartParser.WidgetClassContext ctx);
	/**
	 * Enter a parse tree produced by the {@code Classes}
	 * labeled alternative in {@link dartParser#class}.
	 * @param ctx the parse tree
	 */
	void enterClasses(dartParser.ClassesContext ctx);
	/**
	 * Exit a parse tree produced by the {@code Classes}
	 * labeled alternative in {@link dartParser#class}.
	 * @param ctx the parse tree
	 */
	void exitClasses(dartParser.ClassesContext ctx);
	/**
	 * Enter a parse tree produced by the {@code Method}
	 * labeled alternative in {@link dartParser#meth}.
	 * @param ctx the parse tree
	 */
	void enterMethod(dartParser.MethodContext ctx);
	/**
	 * Exit a parse tree produced by the {@code Method}
	 * labeled alternative in {@link dartParser#meth}.
	 * @param ctx the parse tree
	 */
	void exitMethod(dartParser.MethodContext ctx);
	/**
	 * Enter a parse tree produced by the {@code AssignStat}
	 * labeled alternative in {@link dartParser#stat}.
	 * @param ctx the parse tree
	 */
	void enterAssignStat(dartParser.AssignStatContext ctx);
	/**
	 * Exit a parse tree produced by the {@code AssignStat}
	 * labeled alternative in {@link dartParser#stat}.
	 * @param ctx the parse tree
	 */
	void exitAssignStat(dartParser.AssignStatContext ctx);
	/**
	 * Enter a parse tree produced by the {@code DeclareStat}
	 * labeled alternative in {@link dartParser#stat}.
	 * @param ctx the parse tree
	 */
	void enterDeclareStat(dartParser.DeclareStatContext ctx);
	/**
	 * Exit a parse tree produced by the {@code DeclareStat}
	 * labeled alternative in {@link dartParser#stat}.
	 * @param ctx the parse tree
	 */
	void exitDeclareStat(dartParser.DeclareStatContext ctx);
	/**
	 * Enter a parse tree produced by the {@code printOutput}
	 * labeled alternative in {@link dartParser#stat}.
	 * @param ctx the parse tree
	 */
	void enterPrintOutput(dartParser.PrintOutputContext ctx);
	/**
	 * Exit a parse tree produced by the {@code printOutput}
	 * labeled alternative in {@link dartParser#stat}.
	 * @param ctx the parse tree
	 */
	void exitPrintOutput(dartParser.PrintOutputContext ctx);
	/**
	 * Enter a parse tree produced by the {@code IfStat}
	 * labeled alternative in {@link dartParser#stat}.
	 * @param ctx the parse tree
	 */
	void enterIfStat(dartParser.IfStatContext ctx);
	/**
	 * Exit a parse tree produced by the {@code IfStat}
	 * labeled alternative in {@link dartParser#stat}.
	 * @param ctx the parse tree
	 */
	void exitIfStat(dartParser.IfStatContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ForStat}
	 * labeled alternative in {@link dartParser#stat}.
	 * @param ctx the parse tree
	 */
	void enterForStat(dartParser.ForStatContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ForStat}
	 * labeled alternative in {@link dartParser#stat}.
	 * @param ctx the parse tree
	 */
	void exitForStat(dartParser.ForStatContext ctx);
	/**
	 * Enter a parse tree produced by the {@code WhileStat}
	 * labeled alternative in {@link dartParser#stat}.
	 * @param ctx the parse tree
	 */
	void enterWhileStat(dartParser.WhileStatContext ctx);
	/**
	 * Exit a parse tree produced by the {@code WhileStat}
	 * labeled alternative in {@link dartParser#stat}.
	 * @param ctx the parse tree
	 */
	void exitWhileStat(dartParser.WhileStatContext ctx);
	/**
	 * Enter a parse tree produced by the {@code CallingFunctionStat}
	 * labeled alternative in {@link dartParser#stat}.
	 * @param ctx the parse tree
	 */
	void enterCallingFunctionStat(dartParser.CallingFunctionStatContext ctx);
	/**
	 * Exit a parse tree produced by the {@code CallingFunctionStat}
	 * labeled alternative in {@link dartParser#stat}.
	 * @param ctx the parse tree
	 */
	void exitCallingFunctionStat(dartParser.CallingFunctionStatContext ctx);
	/**
	 * Enter a parse tree produced by the {@code CallingFuncitonFromObjectStat}
	 * labeled alternative in {@link dartParser#stat}.
	 * @param ctx the parse tree
	 */
	void enterCallingFuncitonFromObjectStat(dartParser.CallingFuncitonFromObjectStatContext ctx);
	/**
	 * Exit a parse tree produced by the {@code CallingFuncitonFromObjectStat}
	 * labeled alternative in {@link dartParser#stat}.
	 * @param ctx the parse tree
	 */
	void exitCallingFuncitonFromObjectStat(dartParser.CallingFuncitonFromObjectStatContext ctx);
	/**
	 * Enter a parse tree produced by the {@code DeclaringObjectStat}
	 * labeled alternative in {@link dartParser#stat}.
	 * @param ctx the parse tree
	 */
	void enterDeclaringObjectStat(dartParser.DeclaringObjectStatContext ctx);
	/**
	 * Exit a parse tree produced by the {@code DeclaringObjectStat}
	 * labeled alternative in {@link dartParser#stat}.
	 * @param ctx the parse tree
	 */
	void exitDeclaringObjectStat(dartParser.DeclaringObjectStatContext ctx);
	/**
	 * Enter a parse tree produced by the {@code InstantiatingObjectStat}
	 * labeled alternative in {@link dartParser#stat}.
	 * @param ctx the parse tree
	 */
	void enterInstantiatingObjectStat(dartParser.InstantiatingObjectStatContext ctx);
	/**
	 * Exit a parse tree produced by the {@code InstantiatingObjectStat}
	 * labeled alternative in {@link dartParser#stat}.
	 * @param ctx the parse tree
	 */
	void exitInstantiatingObjectStat(dartParser.InstantiatingObjectStatContext ctx);
	/**
	 * Enter a parse tree produced by the {@code Declaration}
	 * labeled alternative in {@link dartParser#decl}.
	 * @param ctx the parse tree
	 */
	void enterDeclaration(dartParser.DeclarationContext ctx);
	/**
	 * Exit a parse tree produced by the {@code Declaration}
	 * labeled alternative in {@link dartParser#decl}.
	 * @param ctx the parse tree
	 */
	void exitDeclaration(dartParser.DeclarationContext ctx);
	/**
	 * Enter a parse tree produced by the {@code Assignment}
	 * labeled alternative in {@link dartParser#assign}.
	 * @param ctx the parse tree
	 */
	void enterAssignment(dartParser.AssignmentContext ctx);
	/**
	 * Exit a parse tree produced by the {@code Assignment}
	 * labeled alternative in {@link dartParser#assign}.
	 * @param ctx the parse tree
	 */
	void exitAssignment(dartParser.AssignmentContext ctx);
	/**
	 * Enter a parse tree produced by the {@code IfCondition}
	 * labeled alternative in {@link dartParser#if}.
	 * @param ctx the parse tree
	 */
	void enterIfCondition(dartParser.IfConditionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code IfCondition}
	 * labeled alternative in {@link dartParser#if}.
	 * @param ctx the parse tree
	 */
	void exitIfCondition(dartParser.IfConditionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ForLoop}
	 * labeled alternative in {@link dartParser#for}.
	 * @param ctx the parse tree
	 */
	void enterForLoop(dartParser.ForLoopContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ForLoop}
	 * labeled alternative in {@link dartParser#for}.
	 * @param ctx the parse tree
	 */
	void exitForLoop(dartParser.ForLoopContext ctx);
	/**
	 * Enter a parse tree produced by the {@code WhileLoop}
	 * labeled alternative in {@link dartParser#while}.
	 * @param ctx the parse tree
	 */
	void enterWhileLoop(dartParser.WhileLoopContext ctx);
	/**
	 * Exit a parse tree produced by the {@code WhileLoop}
	 * labeled alternative in {@link dartParser#while}.
	 * @param ctx the parse tree
	 */
	void exitWhileLoop(dartParser.WhileLoopContext ctx);
	/**
	 * Enter a parse tree produced by the {@code CallingFunction}
	 * labeled alternative in {@link dartParser#functionCall}.
	 * @param ctx the parse tree
	 */
	void enterCallingFunction(dartParser.CallingFunctionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code CallingFunction}
	 * labeled alternative in {@link dartParser#functionCall}.
	 * @param ctx the parse tree
	 */
	void exitCallingFunction(dartParser.CallingFunctionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code CallingFuncitonFromObject}
	 * labeled alternative in {@link dartParser#objectFunctionCall}.
	 * @param ctx the parse tree
	 */
	void enterCallingFuncitonFromObject(dartParser.CallingFuncitonFromObjectContext ctx);
	/**
	 * Exit a parse tree produced by the {@code CallingFuncitonFromObject}
	 * labeled alternative in {@link dartParser#objectFunctionCall}.
	 * @param ctx the parse tree
	 */
	void exitCallingFuncitonFromObject(dartParser.CallingFuncitonFromObjectContext ctx);
	/**
	 * Enter a parse tree produced by the {@code DeclaringObject}
	 * labeled alternative in {@link dartParser#declareObject}.
	 * @param ctx the parse tree
	 */
	void enterDeclaringObject(dartParser.DeclaringObjectContext ctx);
	/**
	 * Exit a parse tree produced by the {@code DeclaringObject}
	 * labeled alternative in {@link dartParser#declareObject}.
	 * @param ctx the parse tree
	 */
	void exitDeclaringObject(dartParser.DeclaringObjectContext ctx);
	/**
	 * Enter a parse tree produced by the {@code InstantiatingObject}
	 * labeled alternative in {@link dartParser#instanObject}.
	 * @param ctx the parse tree
	 */
	void enterInstantiatingObject(dartParser.InstantiatingObjectContext ctx);
	/**
	 * Exit a parse tree produced by the {@code InstantiatingObject}
	 * labeled alternative in {@link dartParser#instanObject}.
	 * @param ctx the parse tree
	 */
	void exitInstantiatingObject(dartParser.InstantiatingObjectContext ctx);
	/**
	 * Enter a parse tree produced by the {@code Condition}
	 * labeled alternative in {@link dartParser#cond}.
	 * @param ctx the parse tree
	 */
	void enterCondition(dartParser.ConditionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code Condition}
	 * labeled alternative in {@link dartParser#cond}.
	 * @param ctx the parse tree
	 */
	void exitCondition(dartParser.ConditionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code identifier}
	 * labeled alternative in {@link dartParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterIdentifier(dartParser.IdentifierContext ctx);
	/**
	 * Exit a parse tree produced by the {@code identifier}
	 * labeled alternative in {@link dartParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitIdentifier(dartParser.IdentifierContext ctx);
	/**
	 * Enter a parse tree produced by the {@code string}
	 * labeled alternative in {@link dartParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterString(dartParser.StringContext ctx);
	/**
	 * Exit a parse tree produced by the {@code string}
	 * labeled alternative in {@link dartParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitString(dartParser.StringContext ctx);
	/**
	 * Enter a parse tree produced by the {@code bool}
	 * labeled alternative in {@link dartParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterBool(dartParser.BoolContext ctx);
	/**
	 * Exit a parse tree produced by the {@code bool}
	 * labeled alternative in {@link dartParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitBool(dartParser.BoolContext ctx);
	/**
	 * Enter a parse tree produced by the {@code subtract}
	 * labeled alternative in {@link dartParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterSubtract(dartParser.SubtractContext ctx);
	/**
	 * Exit a parse tree produced by the {@code subtract}
	 * labeled alternative in {@link dartParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitSubtract(dartParser.SubtractContext ctx);
	/**
	 * Enter a parse tree produced by the {@code divide}
	 * labeled alternative in {@link dartParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterDivide(dartParser.DivideContext ctx);
	/**
	 * Exit a parse tree produced by the {@code divide}
	 * labeled alternative in {@link dartParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitDivide(dartParser.DivideContext ctx);
	/**
	 * Enter a parse tree produced by the {@code parenExpression}
	 * labeled alternative in {@link dartParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterParenExpression(dartParser.ParenExpressionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code parenExpression}
	 * labeled alternative in {@link dartParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitParenExpression(dartParser.ParenExpressionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code integer}
	 * labeled alternative in {@link dartParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterInteger(dartParser.IntegerContext ctx);
	/**
	 * Exit a parse tree produced by the {@code integer}
	 * labeled alternative in {@link dartParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitInteger(dartParser.IntegerContext ctx);
	/**
	 * Enter a parse tree produced by the {@code multiplication}
	 * labeled alternative in {@link dartParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterMultiplication(dartParser.MultiplicationContext ctx);
	/**
	 * Exit a parse tree produced by the {@code multiplication}
	 * labeled alternative in {@link dartParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitMultiplication(dartParser.MultiplicationContext ctx);
	/**
	 * Enter a parse tree produced by the {@code float}
	 * labeled alternative in {@link dartParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterFloat(dartParser.FloatContext ctx);
	/**
	 * Exit a parse tree produced by the {@code float}
	 * labeled alternative in {@link dartParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitFloat(dartParser.FloatContext ctx);
	/**
	 * Enter a parse tree produced by the {@code addition}
	 * labeled alternative in {@link dartParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterAddition(dartParser.AdditionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code addition}
	 * labeled alternative in {@link dartParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitAddition(dartParser.AdditionContext ctx);
	/**
	 * Enter a parse tree produced by {@link dartParser#widget}.
	 * @param ctx the parse tree
	 */
	void enterWidget(dartParser.WidgetContext ctx);
	/**
	 * Exit a parse tree produced by {@link dartParser#widget}.
	 * @param ctx the parse tree
	 */
	void exitWidget(dartParser.WidgetContext ctx);
	/**
	 * Enter a parse tree produced by the {@code navigatorWidget}
	 * labeled alternative in {@link dartParser#navigator}.
	 * @param ctx the parse tree
	 */
	void enterNavigatorWidget(dartParser.NavigatorWidgetContext ctx);
	/**
	 * Exit a parse tree produced by the {@code navigatorWidget}
	 * labeled alternative in {@link dartParser#navigator}.
	 * @param ctx the parse tree
	 */
	void exitNavigatorWidget(dartParser.NavigatorWidgetContext ctx);
	/**
	 * Enter a parse tree produced by the {@code scaffoldWidget}
	 * labeled alternative in {@link dartParser#scaffold}.
	 * @param ctx the parse tree
	 */
	void enterScaffoldWidget(dartParser.ScaffoldWidgetContext ctx);
	/**
	 * Exit a parse tree produced by the {@code scaffoldWidget}
	 * labeled alternative in {@link dartParser#scaffold}.
	 * @param ctx the parse tree
	 */
	void exitScaffoldWidget(dartParser.ScaffoldWidgetContext ctx);
	/**
	 * Enter a parse tree produced by the {@code appBarWidget}
	 * labeled alternative in {@link dartParser#appBar}.
	 * @param ctx the parse tree
	 */
	void enterAppBarWidget(dartParser.AppBarWidgetContext ctx);
	/**
	 * Exit a parse tree produced by the {@code appBarWidget}
	 * labeled alternative in {@link dartParser#appBar}.
	 * @param ctx the parse tree
	 */
	void exitAppBarWidget(dartParser.AppBarWidgetContext ctx);
	/**
	 * Enter a parse tree produced by {@link dartParser#body}.
	 * @param ctx the parse tree
	 */
	void enterBody(dartParser.BodyContext ctx);
	/**
	 * Exit a parse tree produced by {@link dartParser#body}.
	 * @param ctx the parse tree
	 */
	void exitBody(dartParser.BodyContext ctx);
	/**
	 * Enter a parse tree produced by the {@code listViewWidget}
	 * labeled alternative in {@link dartParser#listView}.
	 * @param ctx the parse tree
	 */
	void enterListViewWidget(dartParser.ListViewWidgetContext ctx);
	/**
	 * Exit a parse tree produced by the {@code listViewWidget}
	 * labeled alternative in {@link dartParser#listView}.
	 * @param ctx the parse tree
	 */
	void exitListViewWidget(dartParser.ListViewWidgetContext ctx);
	/**
	 * Enter a parse tree produced by the {@code inkWellWidget}
	 * labeled alternative in {@link dartParser#inkWell}.
	 * @param ctx the parse tree
	 */
	void enterInkWellWidget(dartParser.InkWellWidgetContext ctx);
	/**
	 * Exit a parse tree produced by the {@code inkWellWidget}
	 * labeled alternative in {@link dartParser#inkWell}.
	 * @param ctx the parse tree
	 */
	void exitInkWellWidget(dartParser.InkWellWidgetContext ctx);
	/**
	 * Enter a parse tree produced by the {@code rowWidget}
	 * labeled alternative in {@link dartParser#row}.
	 * @param ctx the parse tree
	 */
	void enterRowWidget(dartParser.RowWidgetContext ctx);
	/**
	 * Exit a parse tree produced by the {@code rowWidget}
	 * labeled alternative in {@link dartParser#row}.
	 * @param ctx the parse tree
	 */
	void exitRowWidget(dartParser.RowWidgetContext ctx);
	/**
	 * Enter a parse tree produced by the {@code columnWidget}
	 * labeled alternative in {@link dartParser#column}.
	 * @param ctx the parse tree
	 */
	void enterColumnWidget(dartParser.ColumnWidgetContext ctx);
	/**
	 * Exit a parse tree produced by the {@code columnWidget}
	 * labeled alternative in {@link dartParser#column}.
	 * @param ctx the parse tree
	 */
	void exitColumnWidget(dartParser.ColumnWidgetContext ctx);
	/**
	 * Enter a parse tree produced by the {@code textWidget}
	 * labeled alternative in {@link dartParser#text}.
	 * @param ctx the parse tree
	 */
	void enterTextWidget(dartParser.TextWidgetContext ctx);
	/**
	 * Exit a parse tree produced by the {@code textWidget}
	 * labeled alternative in {@link dartParser#text}.
	 * @param ctx the parse tree
	 */
	void exitTextWidget(dartParser.TextWidgetContext ctx);
	/**
	 * Enter a parse tree produced by the {@code imageWidget}
	 * labeled alternative in {@link dartParser#image}.
	 * @param ctx the parse tree
	 */
	void enterImageWidget(dartParser.ImageWidgetContext ctx);
	/**
	 * Exit a parse tree produced by the {@code imageWidget}
	 * labeled alternative in {@link dartParser#image}.
	 * @param ctx the parse tree
	 */
	void exitImageWidget(dartParser.ImageWidgetContext ctx);
	/**
	 * Enter a parse tree produced by the {@code separatedListViewWidget}
	 * labeled alternative in {@link dartParser#separatedlistView}.
	 * @param ctx the parse tree
	 */
	void enterSeparatedListViewWidget(dartParser.SeparatedListViewWidgetContext ctx);
	/**
	 * Exit a parse tree produced by the {@code separatedListViewWidget}
	 * labeled alternative in {@link dartParser#separatedlistView}.
	 * @param ctx the parse tree
	 */
	void exitSeparatedListViewWidget(dartParser.SeparatedListViewWidgetContext ctx);
	/**
	 * Enter a parse tree produced by the {@code containerWidget}
	 * labeled alternative in {@link dartParser#container}.
	 * @param ctx the parse tree
	 */
	void enterContainerWidget(dartParser.ContainerWidgetContext ctx);
	/**
	 * Exit a parse tree produced by the {@code containerWidget}
	 * labeled alternative in {@link dartParser#container}.
	 * @param ctx the parse tree
	 */
	void exitContainerWidget(dartParser.ContainerWidgetContext ctx);
	/**
	 * Enter a parse tree produced by the {@code materialWidget}
	 * labeled alternative in {@link dartParser#material}.
	 * @param ctx the parse tree
	 */
	void enterMaterialWidget(dartParser.MaterialWidgetContext ctx);
	/**
	 * Exit a parse tree produced by the {@code materialWidget}
	 * labeled alternative in {@link dartParser#material}.
	 * @param ctx the parse tree
	 */
	void exitMaterialWidget(dartParser.MaterialWidgetContext ctx);
}