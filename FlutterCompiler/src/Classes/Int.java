package Classes;

public class Int extends Expression {
	public int num;

	public Int(int num) {
		this.num = num;
	}

	@Override
	public String toString() {
		return "Int{" +
				"num=" + num +
				'}';
	}
}
