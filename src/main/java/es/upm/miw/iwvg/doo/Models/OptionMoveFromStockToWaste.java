package es.upm.miw.iwvg.doo.Models;

import es.upm.miw.iwvg.doo.Controllers.MoveFromStackToWasteController;
import es.upm.miw.iwvg.doo.Views.MenuView;

public class OptionMoveFromStockToWaste extends Option {
	MoveFromStackToWasteController moveFromStackToWasteController;
	public OptionMoveFromStockToWaste() {
		super();
	}

	@Override
	public void getMovement() {
		this.getOpcion();
		moveFromStackToWasteController.move();
		
	}

	@Override
	public void getOpcion() {
		MenuView.getMenuView().renderOption("1. Mover de baraja a descarte");
	}

}
