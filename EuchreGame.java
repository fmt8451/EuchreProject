




import java.util.Scanner;




public class EuchreGame {

	/**
	 * @param args
	 */
	// The 3 computer players
	EuchrePlayer player2;
	EuchrePlayer player3;
	EuchrePlayer player4;
	
	//Variables to determine game status
	boolean gameOver = false;
	
	int team1Score = 0;
	int team2Score = 0;
	
	// Variables for the playing field
	
	Card trumpCard;
	Card inPlay[];
	Card faceCard;
	
	// Variables to determine turn order
	
	int playerTurn = 1;
	int dealerTurn = 4;
	
	
	
	
	public void callTrump() {
		
		if(playerTurn == 1) {
			
			String playerCall;
			System.out.println("It's your call, order up or pass? ");
			playerCall = keyboard.nextLine();
			
			if(playerCall == "Pass"){
				playerTurn = 2;
				break;
			}
			else if(playerCall == "Call") {
				trumpCard = faceCard;
			}
		}
	}
	
	
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
