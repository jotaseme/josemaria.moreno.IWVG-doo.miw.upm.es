package es.upm.miw.iwvg.doo.Models;

import es.upm.miw.iwvg.doo.Views.MenuView;

public class OptionMoveFromWasteToStock extends Option {
	public OptionMoveFromWasteToStock() {
		super();
	}

	@Override
	public void getMovement() {
		
	}

	@Override
	public void getOpcion() {
		MenuView.getMenuView().renderOption("2. Mover de descarte a baraja");
	}

}
