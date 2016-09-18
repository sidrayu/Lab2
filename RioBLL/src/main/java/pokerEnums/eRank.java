package pokerEnums;

public enum eRank {
	TWO(2),TREE(3),FOUR(4),FIVE(5),SIX(6),SEVEN(7),EIGHT(8),NINE(9),
	TEN(10),JACK(11),QUEEN(12),KING(13),ACE(14);

	private int rankValue;
	private eRank(int rankValue){
		this.rankValue= rankValue;
	}
}