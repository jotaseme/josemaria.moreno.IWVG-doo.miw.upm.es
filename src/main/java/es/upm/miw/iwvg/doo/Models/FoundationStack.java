package es.upm.miw.iwvg.doo.Models;


public class FoundationStack extends CardStack {

	private static final long serialVersionUID = 1L;
	private FoundationType foundationType;

	public FoundationStack(FoundationType foundationType) {

		this.foundationType = foundationType;
	}

	public FoundationType getFoundationType() {
		return foundationType;
	}

	@Override
	public boolean checkMove(CardStack fromStack, CardStack toStack) {
		assert fromStack != null;
		assert toStack != null;

		if (!fromStack.isEmpty()) {
			if (!toStack.isEmpty()) {
				if (this.validPush(fromStack.peek(), toStack.peek())) {
					return true;
				} else {
					return false;
				}
			} else {
				if (this.sameFoundationType(fromStack.peek(), toStack) && fromStack.peek().isAce()) {
					return true;
				} else {
					return false;
				}
			}
		} else {

			return false;
		}
		
		

	}
	
	private boolean validPush(Card card1, Card card2) {
		if (this.isSameType(card1, card2) && this.canPush(card1, card2)) {
			return true;
		} else {
			return false;
		}
	}
	
	public boolean sameFoundationType(Card card1, CardStack foundation) {
		if (card1.getCharCardType() == foundation.getFoundationType().toString().charAt(0)) {
			return true;
		} else {
			return false;
		}
	}
	
	public boolean isSameType (Card card1, Card card2){	
		if (card1.getCharCardType()==card2.getCharCardType()) {
			return true;
		}else {
			return false;
		}	
	}
	
	public boolean canPush(Card card1, Card card2){
		if (card1.getValue()-1==card2.getValue()) {
			return true;
		}else {
			return false;
		}
	}
	
	
	
	

}
