// Generated from java-escape by ANTLR 4.11.1

    package antlr;

import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link dartParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface dartVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by the {@code Program}
	 * labeled alternative in {@link dartParser#prog}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitProgram(dartParser.ProgramContext ctx);
	/**
	 * Visit a parse tree produced by the {@code widgetClass}
	 * labeled alternative in {@link dartParser#widget_class}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitWidgetClass(dartParser.WidgetClassContext ctx);
	/**
	 * Visit a parse tree produced by the {@code Classes}
	 * labeled alternative in {@link dartParser#class}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitClasses(dartParser.ClassesContext ctx);
	/**
	 * Visit a parse tree produced by the {@code Method}
	 * labeled alternative in {@link dartParser#meth}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMethod(dartParser.MethodContext ctx);
	/**
	 * Visit a parse tree produced by the {@code AssignStat}
	 * labeled alternative in {@link dartParser#stat}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAssignStat(dartParser.AssignStatContext ctx);
	/**
	 * Visit a parse tree produced by the {@code DeclareStat}
	 * labeled alternative in {@link dartParser#stat}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDeclareStat(dartParser.DeclareStatContext ctx);
	/**
	 * Visit a parse tree produced by the {@code printOutput}
	 * labeled alternative in {@link dartParser#stat}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPrintOutput(dartParser.PrintOutputContext ctx);
	/**
	 * Visit a parse tree produced by the {@code IfStat}
	 * labeled alternative in {@link dartParser#stat}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIfStat(dartParser.IfStatContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ForStat}
	 * labeled alternative in {@link dartParser#stat}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitForStat(dartParser.ForStatContext ctx);
	/**
	 * Visit a parse tree produced by the {@code WhileStat}
	 * labeled alternative in {@link dartParser#stat}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitWhileStat(dartParser.WhileStatContext ctx);
	/**
	 * Visit a parse tree produced by the {@code CallingFunctionStat}
	 * labeled alternative in {@link dartParser#stat}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCallingFunctionStat(dartParser.CallingFunctionStatContext ctx);
	/**
	 * Visit a parse tree produced by the {@code CallingFuncitonFromObjectStat}
	 * labeled alternative in {@link dartParser#stat}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCallingFuncitonFromObjectStat(dartParser.CallingFuncitonFromObjectStatContext ctx);
	/**
	 * Visit a parse tree produced by the {@code DeclaringObjectStat}
	 * labeled alternative in {@link dartParser#stat}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDeclaringObjectStat(dartParser.DeclaringObjectStatContext ctx);
	/**
	 * Visit a parse tree produced by the {@code InstantiatingObjectStat}
	 * labeled alternative in {@link dartParser#stat}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInstantiatingObjectStat(dartParser.InstantiatingObjectStatContext ctx);
	/**
	 * Visit a parse tree produced by the {@code Declaration}
	 * labeled alternative in {@link dartParser#decl}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDeclaration(dartParser.DeclarationContext ctx);
	/**
	 * Visit a parse tree produced by the {@code Assignment}
	 * labeled alternative in {@link dartParser#assign}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAssignment(dartParser.AssignmentContext ctx);
	/**
	 * Visit a parse tree produced by the {@code IfCondition}
	 * labeled alternative in {@link dartParser#if}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIfCondition(dartParser.IfConditionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ForLoop}
	 * labeled alternative in {@link dartParser#for}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitForLoop(dartParser.ForLoopContext ctx);
	/**
	 * Visit a parse tree produced by the {@code WhileLoop}
	 * labeled alternative in {@link dartParser#while}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitWhileLoop(dartParser.WhileLoopContext ctx);
	/**
	 * Visit a parse tree produced by the {@code CallingFunction}
	 * labeled alternative in {@link dartParser#functionCall}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCallingFunction(dartParser.CallingFunctionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code CallingFuncitonFromObject}
	 * labeled alternative in {@link dartParser#objectFunctionCall}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCallingFuncitonFromObject(dartParser.CallingFuncitonFromObjectContext ctx);
	/**
	 * Visit a parse tree produced by the {@code DeclaringObject}
	 * labeled alternative in {@link dartParser#declareObject}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDeclaringObject(dartParser.DeclaringObjectContext ctx);
	/**
	 * Visit a parse tree produced by the {@code InstantiatingObject}
	 * labeled alternative in {@link dartParser#instanObject}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInstantiatingObject(dartParser.InstantiatingObjectContext ctx);
	/**
	 * Visit a parse tree produced by the {@code Condition}
	 * labeled alternative in {@link dartParser#cond}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCondition(dartParser.ConditionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code identifier}
	 * labeled alternative in {@link dartParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIdentifier(dartParser.IdentifierContext ctx);
	/**
	 * Visit a parse tree produced by the {@code string}
	 * labeled alternative in {@link dartParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitString(dartParser.StringContext ctx);
	/**
	 * Visit a parse tree produced by the {@code bool}
	 * labeled alternative in {@link dartParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBool(dartParser.BoolContext ctx);
	/**
	 * Visit a parse tree produced by the {@code subtract}
	 * labeled alternative in {@link dartParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSubtract(dartParser.SubtractContext ctx);
	/**
	 * Visit a parse tree produced by the {@code divide}
	 * labeled alternative in {@link dartParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDivide(dartParser.DivideContext ctx);
	/**
	 * Visit a parse tree produced by the {@code parenExpression}
	 * labeled alternative in {@link dartParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitParenExpression(dartParser.ParenExpressionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code integer}
	 * labeled alternative in {@link dartParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInteger(dartParser.IntegerContext ctx);
	/**
	 * Visit a parse tree produced by the {@code multiplication}
	 * labeled alternative in {@link dartParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMultiplication(dartParser.MultiplicationContext ctx);
	/**
	 * Visit a parse tree produced by the {@code float}
	 * labeled alternative in {@link dartParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFloat(dartParser.FloatContext ctx);
	/**
	 * Visit a parse tree produced by the {@code addition}
	 * labeled alternative in {@link dartParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAddition(dartParser.AdditionContext ctx);
	/**
	 * Visit a parse tree produced by {@link dartParser#widget}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitWidget(dartParser.WidgetContext ctx);
	/**
	 * Visit a parse tree produced by the {@code navigatorWidget}
	 * labeled alternative in {@link dartParser#navigator}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNavigatorWidget(dartParser.NavigatorWidgetContext ctx);
	/**
	 * Visit a parse tree produced by the {@code scaffoldWidget}
	 * labeled alternative in {@link dartParser#scaffold}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitScaffoldWidget(dartParser.ScaffoldWidgetContext ctx);
	/**
	 * Visit a parse tree produced by the {@code appBarWidget}
	 * labeled alternative in {@link dartParser#appBar}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAppBarWidget(dartParser.AppBarWidgetContext ctx);
	/**
	 * Visit a parse tree produced by {@link dartParser#body}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBody(dartParser.BodyContext ctx);
	/**
	 * Visit a parse tree produced by the {@code listViewWidget}
	 * labeled alternative in {@link dartParser#listView}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitListViewWidget(dartParser.ListViewWidgetContext ctx);
	/**
	 * Visit a parse tree produced by the {@code inkWellWidget}
	 * labeled alternative in {@link dartParser#inkWell}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInkWellWidget(dartParser.InkWellWidgetContext ctx);
	/**
	 * Visit a parse tree produced by the {@code rowWidget}
	 * labeled alternative in {@link dartParser#row}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRowWidget(dartParser.RowWidgetContext ctx);
	/**
	 * Visit a parse tree produced by the {@code columnWidget}
	 * labeled alternative in {@link dartParser#column}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitColumnWidget(dartParser.ColumnWidgetContext ctx);
	/**
	 * Visit a parse tree produced by the {@code textWidget}
	 * labeled alternative in {@link dartParser#text}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTextWidget(dartParser.TextWidgetContext ctx);
	/**
	 * Visit a parse tree produced by the {@code imageWidget}
	 * labeled alternative in {@link dartParser#image}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitImageWidget(dartParser.ImageWidgetContext ctx);
	/**
	 * Visit a parse tree produced by the {@code separatedListViewWidget}
	 * labeled alternative in {@link dartParser#separatedlistView}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSeparatedListViewWidget(dartParser.SeparatedListViewWidgetContext ctx);
	/**
	 * Visit a parse tree produced by the {@code containerWidget}
	 * labeled alternative in {@link dartParser#container}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitContainerWidget(dartParser.ContainerWidgetContext ctx);
	/**
	 * Visit a parse tree produced by the {@code materialWidget}
	 * labeled alternative in {@link dartParser#material}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMaterialWidget(dartParser.MaterialWidgetContext ctx);
}