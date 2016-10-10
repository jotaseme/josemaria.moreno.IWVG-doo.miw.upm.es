package es.upm.miw.iwvg.doo.Models;

import es.upm.miw.iwvg.doo.Views.MenuView;

public class OptionMoveFromWasteToFoundation extends Option {
	public OptionMoveFromWasteToFoundation() {
		super();
	}

	@Override
	public void getMovement() {
		
	}

	@Override
	public void getOpcion() {
		MenuView.getMenuView().renderOption("3. Mover de descarte a palo");
	}

}
