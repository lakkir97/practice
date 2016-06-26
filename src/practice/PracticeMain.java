package practice;

public class PracticeMain {

	public static void main(String[] args) {
		CreditCard cc = new CreditCard();
		cc.setCardId(7);
		
		System.out.println(cc.getCardId());
		
		
	}
	
	

}

class CreditCard{
	private int cardId =9;

	public int getCardId() {
		return cardId;
	}

	public void setCardId(int cardId) {
		cardId = cardId;
	}
	
	
}
