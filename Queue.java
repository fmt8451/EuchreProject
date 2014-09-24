


import java.util.Random;// random generator

public class Queue {
	
	//Fields//
	
	Card front; // front of queue
	Card rear; // end of queue
	public static final int MAX = 52; //max size of deck 
	public static final int SUIT_SIZE = 13; // the size of each suit
	public static final int SUIT_NUM = 4; // number of suits
	Random randomGenerator = new Random(); // random generator
	
	//Constructor//
	
	public Queue() { // zero constructor
		front = new Card();
		rear = front;
	}// end of constructor
	
	//Methods//
	
	public boolean delete(int card, int suit) {
		Card temp;// holds temp info
		Card prev;// holds previous next
		
		temp = front.getNext(); // starts at first node
		prev = front; // starts one behind temp
		
		while(temp != null) {
			if (temp.getCard() == card && temp.getSuit() == suit) { // if we find, break
				 break;
			}// end of if
			else {
				temp = temp.getNext(); // moves variables to the next item in list
				prev = prev.getNext();
			}// end of else
		}// end of while loop
		
		if(temp != null) {
			prev.setNext(temp.getNext()); // sets the previous nodes next the one past temp
			temp = null; // sets the node null to be deleted by garbage disposal
			return true;
		}// end of if
		else {
			return false;
		}// end of else
	}// end of delete
	
	public Card fetch(int card, int suit) {
		Card temp = front.getNext(); // temp pointer to a node and starts at the beginning
		
		while(temp != null) {
			if (card == temp.getCard() && suit == temp.getSuit()) {
				break;
			}// end of if
			else {
				temp = temp.getNext();
			}// end of else
		}// end of while loop
		if (temp != null) {
			return temp.deepCopy();
		}// end of if
		else {
			return null;
		}// end of else
	}// end of fetch
	
	public void shuffle() { // shuffles the deck
        for (int j=0; j<150; j++) { // cycles through cards -- multiple times
                int randomNum = randomGenerator.nextInt(13); // generates a random number from 0 to 12
                int randomSuit = randomGenerator.nextInt(4); // generates a random number from 0 to 3
        
                delete(randomNum, randomSuit); // delete the card
                enqueue(randomNum, randomSuit); // and put it back on top of the deck

        } // end of for loop
	} // end of shuffle
	
	public void generate() { /// Refinement with assistance of Phil ///
		
		for(int card=0; card<SUIT_NUM; card++) { // for loop for the number of suits
			for(int suit=0; suit<SUIT_SIZE; suit++) { // the number of cards in a suit
				enqueue(card, suit);// cycles through and creates each card
				}// end of for loop
		}// end of for loop
	}// end of generate
	
	public boolean enqueue(int newSuit, int newCard) {
		Card newestCard = new Card();// new node 
		
		if (newestCard == null) {
			System.out.println("Out of Memory Error!");
			return false;
		}// end of if
		else{
			newestCard.setCard(newCard); // sets value for new card
			newestCard.setSuit(newSuit);// sets suit for new node
			newestCard.setNext(rear.getNext());// links the newest with the last
			rear.setNext(newestCard);
			rear = newestCard;// sets rear to the newest node
			return true;
		}// end of else
	}// end of enqueue
	
	public boolean enqueue(Card card) {
		Card newestCard = new Card();// new node 
		
		if (newestCard == null) {
			System.out.println("Out of Memory Error!");
			return false;
		}// end of if
		else{
			newestCard.setCard(card.getCard()); // sets value for new card
			newestCard.setSuit(card.getSuit());// sets suit for new node
			newestCard.setNext(rear.getNext());// links the newest with the last
			rear.setNext(newestCard);
			rear = newestCard;// sets rear to the newest node
			return true;
		}// end of else
	}// end of enqueue
	
	public Card dequeue() {
		Card temp; // temp node
		
		temp = front.getNext();// the first node
		front.setNext(temp.getNext()); // sets the front to the second node in line
		temp.setNext(null); // sets the front node to line
		return temp;
	}// end of dequeue
	
	//toString//
	
	public String toString() {
		String outString = new String("The deck contains: ");
		Card temp = front.getNext(); // temp pointer to a node and starts at the beginning
		
		while(temp != null) {
			outString = outString + temp.getCard() + "," + temp.getSuit() + " ";// goes to each node
			temp = temp.getNext();
		}// end of while loop
		return outString;
	}//end of toString
	
	//Main//
	
	public static void main(String[] args) {
		Queue BMV = new Queue();
		Queue deck = new Queue();
		Queue shuffled = new Queue();
		
		deck.generate();
		System.out.println(deck);
		deck.shuffle();
		System.out.println(deck);
		
	}// end of main
	
}// end of class
