package es.upm.miw.iwvg.doo.Models;

import es.upm.miw.iwvg.doo.Controllers.MoveFromStackToWasteController;

public class OptionMoveFromStockToWaste extends Option {
	MoveFromStackToWasteController moveFromStackToWasteController;
	String option;
	public OptionMoveFromStockToWaste(Game game) {
		super(game);
		moveFromStackToWasteController = new MoveFromStackToWasteController(game);
		option = "1. Mover de baraja a descarte";
	}

	@Override
	public void getMovement() {
		moveFromStackToWasteController.move();
		
	}

	@Override
	public String getOpcion() {
		return option;
	}

}
