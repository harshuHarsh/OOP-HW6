package hw6;

import java.util.ArrayList;
import java.util.List;

// Objects from this class will be used to keep track of the 
// OrderDice(Tokens) that the player has drawn so far.
// Other data members added for other anticipated user stories.

public class Player {
	private String name;
	private int maxNumDice;
	private int returnNumDice;
	private List<Token> diceDrawn = new ArrayList<Token>();

	public Player(String name ) {
		this.name = name;
	}
	
	public String getName() { return name; }
	
	public void setMaxDice(int n) {
		maxNumDice = n;
	}
	
	public void setReturnNumDice(int n) {
		returnNumDice = n;
	}
	
	public void returnDiceToDiceBag(DiceBag d) {
		for (int i = 0; i<returnNumDice;i++) {
			d.addToken(diceDrawn.remove(i));
		}	
	}
	
	public void addToken(Token t) {
		diceDrawn.add(t);
	}
}
