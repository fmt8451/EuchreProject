



public class EuchrePlayer {

	LinkedListQueue playerHand = new LinkedListQueue();	// a queue to store the cards in the player's hand
	
	private int num_Clubs;
	private int num_Spades;
	private int num_Hearts;
	private int num_Diamonds;
	
	
	public EuchrePlayer() {
		
		playerHand = new LinkedListQueue();
		
		num_Clubs = 0;
		num_Spades = 0;
		num_Hearts = 0;
		num_Diamonds = 0;
	}
	
	
	public void countCards(){
		
		int i;
		Card temp;
		for (i=0; i<5; i++){
			temp = playerHand.dequeue();
			if (temp.getSuit() == Card.CLUB) {
				if (temp.getCard() ==2 ){
					num_Clubs++;
					num_Spades++;
				}
				else{
					num_Clubs++;
				}
			}
			else if (temp.getSuit() == Card.SPADE){
				if (temp.getCard() ==2 ){
					num_Clubs++;
					num_Spades++;
				}
				else{
					num_Spades++;
				}
			}
			else if (temp.getSuit() == Card.HEART) {
				if (temp.getCard() ==2 ){
					num_Hearts++;
					num_Diamonds++;
				}
				else{
					num_Hearts++;
				}
			}
			else if (temp.getSuit() == Card.DIAMOND || temp.getSuit() == Card.HEART && temp.getCard() == 2){
				if (temp.getCard() ==2 ){
					num_Hearts++;
					num_Diamonds++;
				}
				else{
					num_Diamonds++;
				}
			}
			playerHand.enqueue(temp.getCard(), temp.getSuit());
		}
		
		//System.out.println("I have " + num_Clubs + " Clubs, " + num_Spades + " Spades, "
		//+ num_Hearts + " Hearts, and " + num_Diamonds + "Diamonds.");
	}
	
	public Card callTrump(Card faceCard) {
		if (faceCard.getSuit() == Card.CLUB){
			if (num_Clubs > 2) {
				return faceCard;
			}
			else {
				return null;
			}
		}
		else if (faceCard.getSuit() == Card.SPADE) {
			if (num_Spades > 2) {
				return faceCard;
			}
			else {
				return null;
			}
		}
		else if (faceCard.getSuit() == Card.HEART) {
			if (num_Hearts > 2) {
				return faceCard;
			}
			else {
				return null;
			}
		}
		else if (faceCard.getSuit() == Card.DIAMOND) {
			if (num_Diamonds > 2) {
				return faceCard;
			}
			else {
				return null;
			}
		}
		else {
			return null;
		}
	}
	
	



	public static void main(String[] args) {
		

	}

}
