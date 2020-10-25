package gameOfWar;

import java.util.ArrayList;
import java.util.Collections;

public class Deck {
	
	//Fields: cards (a list of card)
	private ArrayList<Card> cards;
	
	public Deck() {
		cards = new ArrayList<Card>();
		
		for(int a = 0; a <= 3; a++) {
			for(int b = 0; b<=12; b++) {
				cards.add(new Card(a,b));
			}
		}
	} 
	
	public ArrayList<Card> shuffle() { //CONSISTENT! DEPENDABLE! SHUFFLE! THANKYOU CALEB YOU BRILLIANT MAN!
		Collections.shuffle(cards);
		System.out.println("Shuffling Noises");
		System.out.println("");
		System.out.println("Shuffle Complete");
		return cards;
	}
	
	public Card draw() {
		Card card = cards.get(0);
		cards.toString();
		cards.remove(card);
		return card;
	}
    
}
    


