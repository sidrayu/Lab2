package pokerBase;

import pokerEnums.eRank;
import pokerEnums.eSuit;

public class Card {
	
	private int icardNbr;
	private eSuit suit;
	private eRank rank;
	
	public Card(int icardNbr, eSuit suit, eRank rank) {
		this.icardNbr = icardNbr;
		this.suit = suit;
		this.rank = rank;
	}
	public int getIcardNbr() {
		return icardNbr;
	}
	public eSuit getSuit() {
		return suit;
	}
	public eRank getRank() {
		return rank;
	}
	
}
