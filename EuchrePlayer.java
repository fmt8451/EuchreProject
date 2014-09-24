



public class EuchrePlayer {

	/**
	 * @param args
	 */
	Card[] playerHand = new Card[4];	// an array to store the cards in the player's hand
	
	// the cards in the player's hand
	Card card1;
	Card card2;
	Card card3;
	Card card4;
	Card card5;
	
	// pointers to various cards in the player's hand, for decision making reasons
	Card lowestClub = null;
	Card highestClub = null;
	
	Card lowestSpade = null;
	Card highestSpade = null;
	
	Card lowestHeart = null;
	Card highestHeart = null;
	
	Card lowestDiamond = null;
	Card highestDiamond = null;
	
	public EuchrePlayer() {
		
		Card[] playerHand = {card1, card2, card3, card4, card5};
	}
	
	
	
	
	/**
	 * @return the playerHand
	 */
	public Card[] getPlayerHand() {
		return playerHand;
	}




	/**
	 * @return the lowestClub
	 */
	public Card getLowestClub() {
		return lowestClub;
	}




	/**
	 * @return the highestClub
	 */
	public Card getHighestClub() {
		return highestClub;
	}




	/**
	 * @return the lowestSpade
	 */
	public Card getLowestSpade() {
		return lowestSpade;
	}




	/**
	 * @return the highestSpade
	 */
	public Card getHighestSpade() {
		return highestSpade;
	}




	/**
	 * @return the lowestHeart
	 */
	public Card getLowestHeart() {
		return lowestHeart;
	}




	/**
	 * @return the highestHeart
	 */
	public Card getHighestHeart() {
		return highestHeart;
	}




	/**
	 * @return the lowestDiamond
	 */
	public Card getLowestDiamond() {
		return lowestDiamond;
	}




	/**
	 * @return the highestDiamond
	 */
	public Card getHighestDiamond() {
		return highestDiamond;
	}




	/**
	 * @param playerHand the playerHand to set
	 */
	public void setPlayerHand(Card[] playerHand) {
		this.playerHand = playerHand;
	}




	/**
	 * @param lowestClub the lowestClub to set
	 */
	public void setLowestClub(Card lowestClub) {
		this.lowestClub = lowestClub;
	}




	/**
	 * @param highestClub the highestClub to set
	 */
	public void setHighestClub(Card highestClub) {
		this.highestClub = highestClub;
	}




	/**
	 * @param lowestSpade the lowestSpade to set
	 */
	public void setLowestSpade(Card lowestSpade) {
		this.lowestSpade = lowestSpade;
	}




	/**
	 * @param highestSpade the highestSpade to set
	 */
	public void setHighestSpade(Card highestSpade) {
		this.highestSpade = highestSpade;
	}




	/**
	 * @param lowestHeart the lowestHeart to set
	 */
	public void setLowestHeart(Card lowestHeart) {
		this.lowestHeart = lowestHeart;
	}




	/**
	 * @param highestHeart the highestHeart to set
	 */
	public void setHighestHeart(Card highestHeart) {
		this.highestHeart = highestHeart;
	}




	/**
	 * @param lowestDiamond the lowestDiamond to set
	 */
	public void setLowestDiamond(Card lowestDiamond) {
		this.lowestDiamond = lowestDiamond;
	}




	/**
	 * @param highestDiamond the highestDiamond to set
	 */
	public void setHighestDiamond(Card highestDiamond) {
		this.highestDiamond = highestDiamond;
	}
	
	public void sortHand(Card[] playerHand) {
		
		int i;
		for (i=0; i<4; i++) {
			Card placeholder = playerHand[i];
			if(placeholder.getSuit() == Card.CLUB) {
				if (highestClub == null) {
					setHighestClub(playerHand[i]);
				}
				else if (placeholder.getCard() > highestClub.getCard()) {
					setHighestClub(playerHand[i]);
				}
				else {
					
				}
				
				if (lowestClub == null) {
					setLowestClub(playerHand[i]);
				}
				else if (placeholder.getCard() < lowestClub.getCard()) {
					setLowestClub(playerHand[i]);
				}
				else {
					
				}
			}
			
			
			else if(placeholder.getSuit() == Card.SPADE) {
				if (highestSpade == null) {
					setHighestSpade(playerHand[i]);
				}
				else if (placeholder.getCard() > highestSpade.getCard()) {
					setHighestSpade(playerHand[i]);
				}
				else {
					
				}
				
				if (lowestSpade == null) {
					setLowestSpade(playerHand[i]);
				}
				else if (placeholder.getCard() < lowestSpade.getCard()) {
					setLowestSpade(playerHand[i]);
				}
				else {
					
				}
			}
			
			else if(placeholder.getSuit() == Card.HEART) {
				if (highestHeart == null) {
					setHighestHeart(playerHand[i]);
				}
				else if (placeholder.getCard() > highestHeart.getCard()) {
					setHighestHeart(playerHand[i]);
				}
				else {
					
				}
				
				if (lowestHeart == null) {
					setLowestHeart(playerHand[i]);
				}
				else if (placeholder.getCard() < lowestHeart.getCard()) {
					setLowestHeart(playerHand[i]);
				}
				else {
					
				}
			}
			
			else if(placeholder.getSuit() == Card.DIAMOND) {
				if (highestDiamond == null) {
					setHighestDiamond(playerHand[i]);
				}
				else if (placeholder.getCard() > highestDiamond.getCard()) {
					setHighestDiamond(playerHand[i]);
				}
				else {
					
				}
				
				if (lowestDiamond == null) {
					setLowestDiamond(playerHand[i]);
				}
				else if (placeholder.getCard() < lowestDiamond.getCard()) {
					setLowestDiamond(playerHand[i]);
				}
				else {
					
				}
			}
		}
	}




	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
