package pokerBase;

import java.util.ArrayList;
import java.util.Random;

import pokerEnums.eRank;
import pokerEnums.eSuit;

public class Deck  {
	private ArrayList<Card> deck= new ArrayList<Card>();

	public Deck() {
		for (eRank rank:eRank.values()){
			for (eSuit suit:eSuit.values()){
				deck.add(new Card(rank.ordinal()*13+suit.ordinal(),suit,rank));
			}
		}	
		shuffle();
	}
	
	private void shuffle(){
		Random r = new Random();
		int x;
		int y;
		for (int i=0;i<100;i++){
			x = r.nextInt(52);
			y = r.nextInt(52);
			Card card1 = deck.get(x); 
			deck.set(x, deck.get(y));
			deck.set(y,card1);		
		}
	}
	
	
	public ArrayList<Card> getDeck() {
		return deck;
	}
	
	public Card Draw(){
		return deck.remove(0);
	}
	
	private int GetDeckSize(){
		return deck.size();
	}

}
