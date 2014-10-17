/* Node:  A class to represent a card
	 * 
	 * 
	 * Suits:      0 = club, 1 = spade, 2 = heart, 3 = diamond
	 * Face Value: 0 = Nine, 1 = Ten, 2 = Jack, 3 = Queen, 4 = King, 5 = Ace
	 * 
	 * Modified code from CMP221 Project 3's Card class
	 */


	public class Card {
		
		//// card definitions ////
		public static final int DUMMY = 9999999;	// a constant indicating a dummy node
		public static final int CLUB = 0;		// clubs
		public static final int SPADE = 1;		// spades
		public static final int HEART = 2;		// hearts
		public static final int DIAMOND = 3;	// diamonds


		//// data members ////
		private int suit;			// the suit  
		private int value;			// the card value, 0=ace, 1=two, 2=3 ... 10=9, Jack=10, Queen=11, King=12
		private String suitName;	// the name of the suit
		private Card next;			// a link to the next node
		
		//// Constructors ////
		public Card() {
			// initialize to be a dummy node by default
			suit = DUMMY;
			value = DUMMY;
			next = null;
			suitName = "";
		}
		
		/**
		 * @return the suitName
		 */
		public String getSuitName() {
			return suitName;
		}

		/**
		 * @param suitName the suitName to set
		 */
		public void setSuitName(int suit) {
			if (suit == 0) {
				suitName = "Clubs";
			}
			else if (suit ==1) {
				suitName = "Spades";
			}
			else if (suit == 2) {
				suitName = "Hearts";
			}
			else if (suit == 3) {
				suitName = "Diamonds";
			}
		}

		/**
		 * @return the suit
		 */
		public int getSuit() {
			return suit;
		}

		/**
		 * @return the card
		 */
		public int getCard() {
			return value;
		}
		
		/**
		 * @return the next
		 */
		public Card getNext() {
			return next;
		}

		/**
		 * @param suit the suit to set
		 */
		public void setSuit(int suit) {
			this.suit = suit;
		}

		/**
		 * @param card the card to set
		 */
		public void setCard(int card) {
			this.value = card;
		}
		
		/**
		 * @param next the next to set
		 */
		public void setNext(Card next) {
			this.next = next;
		}

		//// deepCopy ////
		/* create a duplicate copy of this node */
		public Card deepCopy() {
			Card copy = new Card();  // the duplicate node
			
			// fill contents
			copy.setSuit(suit);  // duplicate the data
			copy.setCard(value);
			// do not need to set the image, since we recalculate it each time
			copy.setNext(null);  // set next to be a null pointer, this node is not in a list
			
			// return the copy
			return copy;
		}

		//// Auto generate toString() using Eclipse ////
		public String toString() {
			return "Node [suit=" + suit + ", card =" + value + ", next=" + next + "]";
		}
		
		//// main() for testing ////
		public static void main(String[] args) {
			
			// create a card:  the 3 of diamonds
			// REMEMBER:  the card # is off-by-one from the face value
			Card firstnode = new Card();
			firstnode.setSuit(Card.DIAMOND);
			firstnode.setCard(2);
			System.out.println("The first node is: " + firstnode);
				
		}// end of main
		
	}// end of class
