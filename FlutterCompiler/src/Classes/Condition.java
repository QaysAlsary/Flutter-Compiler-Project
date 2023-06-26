package Classes;

public class Condition {
    public Expression left;
    public Expression right;
    public String operator;

    public Condition(Expression left , Expression right , String operator){
        this.left = left;
        this.right = right;
        this.operator = operator;
    }

    @Override
    public String toString() {
        return "Condition{" +
                "left=" + left +
                ", right=" + right +
                ", operator='" + operator + '\'' +
                '}';
    }
}

