package es.upm.miw.iwvg.doo.Views;

import es.upm.miw.iwvg.doo.Models.Card;
import es.upm.miw.iwvg.doo.Utils.IO;

public class CardView {
	
	private Card card;
	
	
	public CardView(Card card) {
		this.card = card;
	}

	public void render(int index) {
		IO io = new IO();
		
		if (!this.card.isHidden()) {
			io.write("[" + this.card.getValue() + "," + this.card.getCardType() + "]\n");
		} else {
			io.write("[");
		}

	}

}
