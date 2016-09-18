package pokerEnums;

public enum eSuit {
	HEART(1),
	SPADE(2),
	ClUB(3),
	DIAMOND(4);
	
	private int suitValue;
	private eSuit(int suitValue){
		this.suitValue= suitValue;
	}
}
