package es.upm.miw.iwvg.doo.Models;

import es.upm.miw.iwvg.doo.Views.MenuView;

public class OptionMoveFromStockToWaste extends Option {
	public OptionMoveFromStockToWaste(MenuView menuView) {
		super();
	}

	@Override
	public void getMovement() {
		
	}

	@Override
	public void getOpcion() {
		System.out.println("LLEGAS");
		menuView.renderOption("1. Mover de baraja a descarte");
	}

}
