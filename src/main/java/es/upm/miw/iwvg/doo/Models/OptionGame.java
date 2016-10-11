package es.upm.miw.iwvg.doo.Models;

import java.util.ArrayList;

public class OptionGame extends Option {
	
	public ArrayList<Option> menu = new ArrayList<Option>();
	public OptionGame(Game game) {
		super(game);
		menu.add(new OptionMoveFromStockToWaste(this.game));
		menu.add(new OptionMoveFromWasteToStock(this.game));
		menu.add(new OptionMoveFromWasteToFoundation(this.game));	
		menu.add(new OptionMoveFromWasteToTableau(this.game));	
	}
	@Override
	public void getMovement() {
		super.getMovement();
	}
	@Override
	public ArrayList<Option> getOptionList() {
		return menu;
	}
	@Override
	public String getOpcion() {
		return super.getOpcion();
	}

}
