package Classes;

public class ExpressionPar extends Expression{
    public Expression exp;

    public ExpressionPar(Expression exp){
        this.exp = exp;
    }

    @Override
    public String toString() {
        return exp.toString();
    }
}
