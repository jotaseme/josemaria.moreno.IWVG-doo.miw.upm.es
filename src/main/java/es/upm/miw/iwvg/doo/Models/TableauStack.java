package es.upm.miw.iwvg.doo.Models;

public class TableauStack extends CardStack {

	private static final long serialVersionUID = 1L;

	public TableauStack() {
		super();
	}

	@Override
	public boolean checkMove(CardStack fromStack, CardStack toStack) {
		if (!fromStack.isEmpty()) {
			if (!toStack.isEmpty()) {
				if (this.validPush(fromStack.peek(), toStack.peek())) {
					return true;
				} else {
					return false;
				}
			} else {
				return true;
			}
		} else {

			return false;
		}
	}

	private boolean validPush(Card card1, Card card2) {
		if (Card.isDifferentType(card1, card2) && Card.canPush(card1, card2)) {
			return true;
		} else {
			return false;
		}
	}
}
