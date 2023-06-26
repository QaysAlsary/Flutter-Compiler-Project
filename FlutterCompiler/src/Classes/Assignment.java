package Classes;

public class Assignment extends Expression {
	public String id;
	public Expression value;

	public static final String ANSI_RED = "\u001B[31m";
	public static final String ANSI_YELLOW = "\u001B[33m";
	public static final String ANSI_LIGHT_GREEN = "\u001B[32m";
	public static final String ANSI_BLUE = "\u001B[34m";
	public static final String ANSI_LIGHT_BLUE = "\u001B[36m";
	public static final String ANSI_BURBLE = "\u001B[35m";
	public static final String ANSI_RESET = "\u001B[0m";

	public Assignment(String id, Expression value) {
		this.id = id;
		this.value = value;
	}

	@Override
	public String toString() {
		return ANSI_RESET + "\n        Assignment{" +
				"id = ' " + id + " '" +
				", value = " + value +
				'}' + ANSI_RESET;
	}
}