package hw6;

// This represents the order diedrawn from the bag.
// Really, the only thing that matters is the color of the die.
public class OrderDie extends Token {

	private String color;
	
	public OrderDie(String desc, String c) {
		super(desc);
		color = c;
	}

	public String toString() {
		String d = super.toString() + " " + color;
		return super.toString();
	}
	
}
