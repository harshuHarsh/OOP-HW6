package hw6;

import static java.lang.System.out;

// This class uses the other classes to produce the desired output
public class GameController {

	public static void main(String[] args) {
		DiceBag d = new DiceBag();
		Player player1 = new Player("Tom");
		Player player2 = new Player("Steve");
		Token t;
		
		addPlayer1Tokens(player1, d);
		addPlayer2Tokens(player2, d);
		
		out.println("Drawing tokens for turn one");
		
		// Handy syntax to assign a value and test in one statement
		while ((t = d.drawToken()) != null) {
			out.println("Token drawn: " + t.toString());
			
			if (t.toString().contains(player1.getName())) {
				player1.addToken(t);
				out.println("Player " + player1.getName() + " gets the token!");
			} else {
				player2.addToken(t);
				out.println("Player " + player2.getName() + " gets the token!");
			}
			out.println("Left in the DiceBag: " + d.toString());
			out.println("Next draw! \n\n\n\n");
		}
		
		out.println("Bye!");

	}

	private static void addPlayer1Tokens(Player p, DiceBag d) {
		for (int i = 0; i < 9; i++) {
			d.addToken(new OrderDie(p.getName(), "red"));
		}
	}

	private static void addPlayer2Tokens(Player p, DiceBag d) {
		for (int i = 0; i < 7; i++) {
			d.addToken(new OrderDie(p.getName(), "red"));
		}
	}
	
}
