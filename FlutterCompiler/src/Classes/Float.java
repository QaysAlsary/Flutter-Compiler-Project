package Classes;

public class Float extends Expression{
    public float num;

    public Float(float num){
        this.num = num;
    }

    @Override
    public String toString() {
        return "Float{" +
                "num=" + num +
                '}';
    }
}
