package gameOfWar;

import java.util.ArrayList;

public class Player {
	

	/*Fields
	 * 
	 * Hand (list of Card)
	 * 
	 */
	
	
	private ArrayList<Card> hand = new ArrayList<Card>();
	
	/*
	 * score (set to 0 in Constructor)
	 */
	private int myScore= 0;
	
	/* 
	 * name (player name)
	 */
	private String myName= "";
	
	private int cardValue; //I used this to get the numerical VALUE of each card. The value is actually inherited from the Card class
							//I don't know if this is the perfect method but it works.
	
	
//	Methods


 
//	 describe (prints out information about the player and calls the describe for each card in Hand List
	public void Describe() {
		System.out.println("Hello! I am " + myName + ". The cards I drew are: ");
		for (int i = 0; i < 26 ; i++) {
			System.out.println(hand.get(i));
		}
	}
	
//	 flip (removes and returns the top card of the hand)
	
	public Card flip() {
		Card flip = hand.get(0);
		setCardValue(flip.getValue());
		hand.toString();
		System.out.println(myName + " Played a " + hand.get(0) );
		hand.remove(flip);
		return flip;
		

	}
	
//	 draw (takes a Deck as an argument and calls the draw method on the deck, adding the returned Card to the hand Field
		
	//Player draw method
		public void draw(Deck deck) {
			hand.add(deck.draw());
			System.out.println(myName + " Drew one card.");
		
		}
	
	
//	 incrementScore (adds 1 to the player's score field)
		public void getPoint() {
			setMyScore(getMyScore() + 1);
		}

	
	
	
//	Getters and Setters for name... possibly others? 
	public String getMyName() {
		return myName;
	}

	public void setMyName(String myName) {
		this.myName = myName;
		System.out.println(myName + " confirmed!");
	}

	public int getMyScore() {
		return myScore;
	}

	public void setMyScore(int myScore) {
		this.myScore = myScore;
	}

	public int getCardValue() {
		return cardValue;
	}

	public void setCardValue(int cardValue) {
		this.cardValue = cardValue;
	}

}


