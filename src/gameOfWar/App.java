package gameOfWar;

public class App 
{
    @SuppressWarnings("null")
	public static void main(String[] args)
    {
    	
    	Deck deck= new Deck(); //Just a humorous introduction sequence. Personal Touch.
    	String brkLn = "__________________________";
    		
    	System.out.println("Greetings! Are you prepared to play War? Todays contestants Line up to play!");
    	System.out.println("");
    	System.out.println("...Processing...");
    	System.out.println(" ");
    	System.out.println(brkLn);
    	System.out.println(" ");

    	
    	//Instantiate a deck and two players
    	Player player1=new Player();
   		player1.setMyName("Joshua ");
   		
   		Player player2=new Player();
    		player2.setMyName("Francesca ");
    		
    		System.out.println(brkLn);
    		System.out.println(" ");
    		System.out.println("One moment while I shuffle up to play...");
    		System.out.println("");
    		
		//Call the shuffle method on the deck
		
    		deck.shuffle(); //this took NINE HOURS to figure out. BLEH
    		
    		System.out.println(brkLn);
    		System.out.println(" ");
		 
		
		//traditional for loop, draw 52 times alternating players each iteration.
    		System.out.println("Alright everyone draw a card until the deck is drawn.");
    		System.out.println(" ");
    		
    		for (int i = 0; i < 26; i++) {
    			player1.draw(deck);
    			player2.draw(deck);		
    		}
    		
    		System.out.println(brkLn);
    		System.out.println(" ");
    		
    	//Bonus describe method call to make sure everything works.
    		player1.Describe();
    		
    		System.out.println(brkLn);
    		System.out.println("");
    		
    		player2.Describe();
    		
    		System.out.println(brkLn);
    		System.out.println("");
		
		
		//traditional for loop, iterate 26 times and flip the the card for each player
				//compare values
    		for (int i = 0; i < 26; i++) {
    			player1.flip();
    			player2.flip();
    			System.out.println(brkLn);
    			System.out.println(" ");
    			
    			if(player1.getCardValue() < player2.getCardValue()) {
    				player2.getPoint();
    			} else {
    				player1.getPoint();
    			}
    		}
		//after loop compare final score
    		
    		System.out.println(player1.getMyName() + " Scored " + player1.getMyScore());
    		System.out.println(player2.getMyName() + " Scored " + player2.getMyScore());
    		
    		
    		//print final score for Player 1 > Player 2 > or Draw depending on results
    		
    		
    		if (player1.getMyScore() > player2.getMyScore()) {
    			System.out.println(player1.getMyName() + " wins with " + player1.getMyScore() + " points!");   			
    		} else if (player1.getMyScore() < player2.getMyScore()){
    			System.out.println(player2.getMyName() + " wins with " + player2.getMyScore() + " points!");
    		} else {
    			System.out.println("It was a Draw!");
    		}
    	
		
		
    		
    		
}
    
}
