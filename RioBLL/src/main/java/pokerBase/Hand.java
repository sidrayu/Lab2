package pokerBase;

import java.util.ArrayList;
import java.util.Collections;
import java.util.UUID;

public class Hand {
	private UUID HandID;
	private boolean bScored;
	private ArrayList<Card> handInCard = new ArrayList<Card>();
	private HandScore handScore;
	
	public Hand() {
		this.HandID = UUID.randomUUID();
		bScored = false;
	}

	private void setHandScore(HandScore handScore){
		this.handScore=handScore;
		bScored = true;
	}
	
	public HandScore getHandScore(){
		return handScore;
	}
	
	private void EvaluateHand(){
		
	}
}