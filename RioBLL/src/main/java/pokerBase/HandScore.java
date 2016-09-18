package pokerBase;

import java.util.ArrayList;

import javax.xml.bind.annotation.XmlElement;

public class HandScore {
	private int HandStrength;
	private int HiHand;
	private int LoHand;
	private ArrayList<Card> kickers = new ArrayList<Card>();
	
	public HandScore() {
		
	}

	public HandScore(int HandStrength,int HiHand,int LoHand,ArrayList<Card> kickers){
		this.HandStrength = HandStrength;
		this.HiHand = HiHand;
		this.LoHand = LoHand;
		this.kickers = kickers;
	}
	
	public int getHandStrength() {
		return HandStrength;
	}

	public void setHandStrength(int handStrength) {
		HandStrength = handStrength;
	}

	public int getHiHand() {
		return HiHand;
	}

	public void setHiHand(int hiHand) {
		HiHand = hiHand;
	}

	public int getLoHand() {
		return LoHand;
	}

	public void setLoHand(int loHand) {
		LoHand = loHand;
	}

	public ArrayList<Card> getKickers() {
		return kickers;
	}

	public void setKickers(ArrayList<Card> kickers) {
		this.kickers = kickers;
	}
	
}
