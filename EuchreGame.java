/**
 * The Control class for the EuchreGame project
 * @author JJ Miller
 * @date 10/16/2013
 * 
 * Purpose: To create a functional Euchre game in Java for CMP 343 - Software Engineering.
 */




import java.util.Scanner;	// Importing the Scanner to recieve user input




public class EuchreGame {

	// The Scanner to gather user input
	
	Scanner keyboard = new Scanner(System.in);
	
	// A hand for the player's cards
	
	private LinkedListQueue playerHand;
	
	// The 3 computer players
	private EuchrePlayer player2;
	private EuchrePlayer player3;
	private EuchrePlayer player4;
	
	 //Variables to determine game status
	private boolean gameOver;
	
	private int team1Score;
	private int team2Score;
	
	// Variables for the playing field
	
	private Card trumpCard;
	private LinkedListQueue inPlay;
	private Card faceCard;
	private Card turnedDown;
	private String playerCall;
	
	// Variables to determine turn order
	
	private int playerTurn = 1;
	private int dealerTurn = 4;
	
	public EuchreGame() {
		
		playerHand = new LinkedListQueue();
		
		player2 = new EuchrePlayer();
		player3 = new EuchrePlayer();
		player4 = new EuchrePlayer();
		
		gameOver = false;
		team1Score = 0;
		team2Score = 0;
		
		trumpCard = new Card();
		inPlay = new LinkedListQueue();
		turnedDown = new Card();
		playerCall = new String();
		faceCard = new Card();
		
	}
	
	public void dealCards(LinkedListQueue deck) {
		
		int i;
		Card temp;
		
		if (dealerTurn == 4) {
			for (i=0; i<3; i++) {
				temp = deck.dequeue();
				playerHand.enqueue(temp.getCard(), temp.getSuit());	
			}
			for (i=0; i<2; i++) {
				temp = deck.dequeue();
				player2.playerHand.enqueue(temp.getCard(), temp.getSuit());	
			}
			for (i=0; i<3; i++) {
				temp = deck.dequeue();
				player3.playerHand.enqueue(temp.getCard(), temp.getSuit());	
			}
			for (i=0; i<2; i++) {
				temp = deck.dequeue();
				player4.playerHand.enqueue(temp.getCard(), temp.getSuit());	
			}
			for (i=0; i<2; i++) {
				temp = deck.dequeue();
				playerHand.enqueue(temp.getCard(), temp.getSuit());	
			}
			for (i=0; i<3; i++) {
				temp = deck.dequeue();
				player2.playerHand.enqueue(temp.getCard(), temp.getSuit());	
			}
			for (i=0; i<2; i++) {
				temp = deck.dequeue();
				player3.playerHand.enqueue(temp.getCard(), temp.getSuit());	
			}
			for (i=0; i<3; i++) {
				temp = deck.dequeue();
				player4.playerHand.enqueue(temp.getCard(), temp.getSuit());	
			}
		}
		
		else if (dealerTurn == 1){
			for (i=0; i<3; i++) {
				temp = deck.dequeue();
				player2.playerHand.enqueue(temp.getCard(), temp.getSuit());	
			}
			for (i=0; i<2; i++) {
				temp = deck.dequeue();
				player3.playerHand.enqueue(temp.getCard(), temp.getSuit());	
			}
			for (i=0; i<3; i++) {
				temp = deck.dequeue();
				player4.playerHand.enqueue(temp.getCard(), temp.getSuit());	
			}
			for (i=0; i<2; i++) {
				temp = deck.dequeue();
				playerHand.enqueue(temp.getCard(), temp.getSuit());	
			}
			for (i=0; i<2; i++) {
				temp = deck.dequeue();
				player2.playerHand.enqueue(temp.getCard(), temp.getSuit());	
			}
			for (i=0; i<3; i++) {
				temp = deck.dequeue();
				player3.playerHand.enqueue(temp.getCard(), temp.getSuit());	
			}
			for (i=0; i<2; i++) {
				temp = deck.dequeue();
				player4.playerHand.enqueue(temp.getCard(), temp.getSuit());	
			}
			for (i=0; i<3; i++) {
				temp = deck.dequeue();
				playerHand.enqueue(temp.getCard(), temp.getSuit());	
			}
		}
		else if (dealerTurn == 2){
			for (i=0; i<3; i++) {
				temp = deck.dequeue();
				player3.playerHand.enqueue(temp.getCard(), temp.getSuit());	
			}
			for (i=0; i<2; i++) {
				temp = deck.dequeue();
				player4.playerHand.enqueue(temp.getCard(), temp.getSuit());	
			}
			for (i=0; i<3; i++) {
				temp = deck.dequeue();
				playerHand.enqueue(temp.getCard(), temp.getSuit());	
			}
			for (i=0; i<2; i++) {
				temp = deck.dequeue();
				player2.playerHand.enqueue(temp.getCard(), temp.getSuit());	
			}
			for (i=0; i<2; i++) {
				temp = deck.dequeue();
				player3.playerHand.enqueue(temp.getCard(), temp.getSuit());	
			}
			for (i=0; i<3; i++) {
				temp = deck.dequeue();
				player4.playerHand.enqueue(temp.getCard(), temp.getSuit());	
			}
			for (i=0; i<2; i++) {
				temp = deck.dequeue();
				playerHand.enqueue(temp.getCard(), temp.getSuit());	
			}
			for (i=0; i<3; i++) {
				temp = deck.dequeue();
				player2.playerHand.enqueue(temp.getCard(), temp.getSuit());	
			}
		}
		else if (dealerTurn == 3){
			for (i=0; i<3; i++) {
				temp = deck.dequeue();
				player4.playerHand.enqueue(temp.getCard(), temp.getSuit());	
			}
			for (i=0; i<2; i++) {
				temp = deck.dequeue();
				playerHand.enqueue(temp.getCard(), temp.getSuit());	
			}
			for (i=0; i<3; i++) {
				temp = deck.dequeue();
				player2.playerHand.enqueue(temp.getCard(), temp.getSuit());	
			}
			for (i=0; i<2; i++) {
				temp = deck.dequeue();
				player3.playerHand.enqueue(temp.getCard(), temp.getSuit());	
			}
			for (i=0; i<2; i++) {
				temp = deck.dequeue();
				player4.playerHand.enqueue(temp.getCard(), temp.getSuit());	
			}
			for (i=0; i<3; i++) {
				temp = deck.dequeue();
				playerHand.enqueue(temp.getCard(), temp.getSuit());	
			}
			for (i=0; i<2; i++) {
				temp = deck.dequeue();
				player2.playerHand.enqueue(temp.getCard(), temp.getSuit());	
			}
			for (i=0; i<3; i++) {
				temp = deck.dequeue();
				player3.playerHand.enqueue(temp.getCard(), temp.getSuit());	
			}
		}
	}
	
	
	
	
	public void callFaceCard() {
		
		if(playerTurn == 1) { // If it's the player's turn to call
			
			if(faceCard != null) { // if there is a facecard
				System.out.println("It's your call, order up or pass? ");
				System.out.println("Enter 'Call' or 'Pass', Enter 'Exit' to exit the game. ");
				playerCall = keyboard.nextLine();
				
				if(playerCall.equals("pass")|| playerCall.equals("Pass") || playerCall.equals("PASS")){ // if the player passes
					if(dealerTurn == playerTurn) {
						turnedDown = faceCard;
						faceCard = null;
						playerTurn = 2;
					}
					else {
						playerTurn = 2;
					}
					
				}
				else if(playerCall.equals("call") || playerCall.equals("Call") || playerCall.equals("CALL")) {  // if the player calls
					trumpCard = faceCard;
				}
				else if(playerCall.equals("exit") || playerCall.equals("Exit") || playerCall.equals("EXIT")) { // if the player exits
					System.exit(0);
				}
				else { // the player screwed up
					System.out.println("You have entered an incorect command");
					System.out.println("Please try again.");
					callFaceCard();
				}
			}
			
			else { // the face card was turned down by all 4 players
				//callOpenTable();
				
			}
			
		}
		else if(playerTurn == 2) {
			if (faceCard != null) {
				
				Card temp;
				temp = player2.callTrump(faceCard);
				if (temp == faceCard) {
					trumpCard = faceCard;
				}
				else {
					
				}
			}
			else {
				// Player chooses a remaining suit
			}
		}
	}
	
	
	public void callOpenTable() {
		// If the dealer is the last one left, we "Screw the Dealer"
		if (playerTurn == dealerTurn) {
			screwTheDealer();
		}
		else {
			if (playerTurn == 1) {
				System.out.println("It's your call, order up or pass? ");
				System.out.println("Enter 'Pass', or a suit that is not ");
				System.out.println("Enter 'Exit' to exit the game. ");
				playerCall = keyboard.nextLine();
				
				if(playerCall == "Pass"){ // if the player passes
					playerTurn = 2;	
				}
				else if(playerCall == turnedDown.getSuitName()) {  // if the player calls what was turned down
					System.out.println("That suit was already turned down!!!");
					System.out.println("Try again!");
					callOpenTable();
				}
				else if(playerCall == "Exit") { // if the player exits
					//End the game
				}
				else { // the player screwed up
					System.out.println("You have entered an incorect command");
					System.out.println("Please try again.");
					callOpenTable();
				}
			}
			else {
				// choose the player who's turn it is and have them pick.
			}
			
		}
	}
	
	public void screwTheDealer() {
		
		System.out.println("Well, Screw the Dealer!");
		System.out.println("You MUST pick a suit, and it cannot be" + turnedDown.getSuit() + ".");
		System.out.println("Pick a suit, type 'Exit' to exit: ");
		playerCall = keyboard.nextLine();			
		//Determine the call			
		if (playerCall == turnedDown.getSuitName()) {
			System.out.println("You picked the suit, that was turned down! ");
			System.out.println("You can't do that! ");
			screwTheDealer();
		}
	}
	
	public void wipeRound() {
		
	}
	
	public static void main(String[] args) {
		
		EuchreGame newGame = new EuchreGame();
		// Start of the game
		System.out.println("Welcome to J.J. Miller's Euchre Game!!!");
		System.out.println("Shall we begin?");
		
		// Play the game
		
		while (newGame.gameOver == false) {
			
			// Create and Shuffle the deck
			
			LinkedListQueue deck = new LinkedListQueue();
			deck = deck.createDeck();
			
			System.out.println("Our deck contains: " + deck);
			
			deck.shuffleDeck();
			
			System.out.println("Our deck is now:" + deck);
			
			// Deal the cards
			newGame.dealCards(deck);
			
			System.out.println("Player 1 has: " + newGame.playerHand);
			System.out.println("Player 2 has: " + newGame.player2.playerHand);
			System.out.println("Player 3 has: " + newGame.player3.playerHand);
			System.out.println("Player 4 has: " + newGame.player4.playerHand);
			newGame.player2.countCards();
			newGame.player3.countCards();
			newGame.player4.countCards();
			
			
			//Reveal the face card
			newGame.faceCard = deck.dequeue();
			
			System.out.println(newGame.faceCard);
			
			// Determine Trump
			newGame.callFaceCard();
			
			//Play hands
			
			//Tally Score
			newGame.gameOver = true;
		}

	}

}
