
import java.util.Random;


public class LinkedListQueue{

	//// data members ////

	private Card Front;
	private Card Rear;
	private static final int Num_DECK = 24;
	private static final int Num_SUIT = 4;
	private static final int VALUE_SIZE = 6;



	//// Constructor ////
	public LinkedListQueue() {
		// create a dummy node for the list
		Front = new Card();
		Rear = Front;

		// Note that the Node class initializes this to a dummy node
	}

	public boolean enqueue(int newCard, int newSuit) {
		// create a new Node object
		Card newestNode = new Card();
		//System.out.println("I was here");

		// error check -- if we can't get memory, newestNode will be null
		if (newestNode == null) {
			// out of memory
			System.out.println("Out of memory error.");

			return false;

		} else {
			// fill in the data for the newest node
			newestNode.setCard(newCard);
			newestNode.setSuit(newSuit);
			// link the newest node to the old first node
			newestNode.setNext(Rear.getNext());
			// link the first (dummy) node to this newest node
			Rear.setNext(newestNode);
			Rear = newestNode;
			//System.out.println("true");
			return true;
		}
	}

	public Card dequeue(){
		Card temp = new Card();
		temp = Front.getNext();
		Card previous;  // the node before this temp node
		previous = Front;               
		// at the dummy node (one before the first node
		// reset the previous node to skip over this node
		previous.setNext(temp.getNext());
		// set this node's next to be null, so it is not in the list
		temp.setNext(null);
		return temp;
	}

	//////counter for the cards in the deck////
	public int countNodes(){
		int totalNum = 0;  	//Total number of nodes counted that will be returned

		Card temp = Front.getNext();		//Sets a temporary pointer to a the header that will change

		while(temp != null){
			totalNum++;
			temp = temp.getNext();
		}


		return totalNum;
	}

	///////////creates the deck of cards//////
	//////////////////////////////////////////

	public LinkedListQueue createDeck(){
		LinkedListQueue newList = new LinkedListQueue();
		for(int i = 0; i<Num_SUIT; i++){
			for (int j=0; j<VALUE_SIZE; j++){
				newList.enqueue(j, i);
			}//end for loop

		} //end for loop
		return newList;

	} //end create deck


	/////shuffle////
	public void shuffleDeck(){
		
		//sets up our random generator
		Random randomGenerater = new Random();//create the random generater
		Card temp = new Card();//
		LinkedListQueue newQueue = new LinkedListQueue();//creates a new queue


		int lengthOfList =  this.countNodes(); //randomly shuffles the cards
		for(int i= 0; i<lengthOfList; i++){
			int savedNum =  randomGenerater.nextInt(this.countNodes());//saving the random number
			temp = this.fetch(savedNum);
			newQueue.enqueue(temp.getCard(),temp.getSuit());
		}

		Rear = Front;   // reset the original queue
		// copy shuffled cards back into the original queue
		while (newQueue.countNodes() > 0) {
			temp = newQueue.dequeue();
			this.enqueue(temp.getCard(), temp.getSuit());
		}
	}

	//create a fetch so that we can randomly shuffle! 
	public Card fetch(int whichCard){
		int CountMoves = 0;
		Card temp = new Card();
		temp = Front.getNext();
		Card previous;  // the node before this temp node
		previous = Front;               // at the dummy node (one before the first node
		while(CountMoves != whichCard){
			temp = temp.getNext();
			previous = previous.getNext();
			CountMoves++;

		}

		// reset the previous node to skip over this node
		previous.setNext(temp.getNext());
		// set this node's next to be null, so it is not in the list
		temp.setNext(null);
		return temp;
	}



	//// toString ////
	public String toString() {
		String outString = new String("The linked list contains: ");

		// traverse the list
		Card temp;			// temporary pointer to a node

		// start at the beginning
		temp = Front.getNext();		// skip the dummy node

		// run through every node in the list
		while (temp != null) {
			// "visit" each node
			outString = outString + temp.getCard() + "-" + temp.getSuit() + "  ";
			// move temp to the next node
			temp = temp.getNext();
		}

		return outString;
	}



	//// main, for testing ////
	public static void main(String[] args) {

		// create a LinkedList object
		LinkedListQueue list = new LinkedListQueue();
		System.out.println("The empty list looks like this: " + list);

		list = list.createDeck();
		System.out.println("The full list is: " + list);

		list.shuffleDeck();

		System.out.println("Our list is now:  " + list);
		
		System.out.println("Fetching the 5th card: " + list.fetch(5));
		
		Card temp = list.dequeue();
		System.out.println(temp);
		list.enqueue(temp.getCard(), temp.getSuit());
		
		System.out.println("And the list ends as: " + list);


	}

}