package hw6;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ThreadLocalRandom;

// This class holds the dice(or tokens) to be drawn.
//
public class DiceBag {
	public List<Token> bag = new ArrayList<Token>();
	
	public void addToken(Token t) {
		bag.add(t);
	}

	public Token drawToken() {
		int upperRange = bag.size();
		Token t = null;
	
		int die = ThreadLocalRandom.current().nextInt(0, upperRange);
		//System.out.println(die);
		if (upperRange > 1 ) {
			t = bag.remove(die);
		}
		
		return t;
	}
	
	public String toString() {
		String ret = " Dice left: " + bag.size() + "\n";
		
		for (Token t:bag) {
			ret += t.toString() + "\n";
		}
		
		return ret;
	}
}
