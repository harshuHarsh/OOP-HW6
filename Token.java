package hw6;

// Base class for tokens.  Some games use tokens which have names.
// Test of Honor uses Samurai, Peasant and Fate tokens.
// Cruel Seas uses dice, but those dice are just colors to denote
// which side.  So those could be replaced with tokens that indicate 
// navy goes next -- German, British, Russian, Japanese, USA, etc.

public class Token {
	private String description;
	
	public Token(String d) {setDescription(d);}
	public void setDescription(String d) { description = d; }
	public String getDescription() { return description; }
	public String toString() { return getDescription(); }
}
