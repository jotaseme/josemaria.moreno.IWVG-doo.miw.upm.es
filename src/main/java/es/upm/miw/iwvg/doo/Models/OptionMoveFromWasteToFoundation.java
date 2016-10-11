package es.upm.miw.iwvg.doo.Models;

import es.upm.miw.iwvg.doo.Controllers.MoveFromWasteToFoundationController;

public class OptionMoveFromWasteToFoundation extends Option {
	String option;
	MoveFromWasteToFoundationController moveFromWasteToFoundationController;
	public OptionMoveFromWasteToFoundation(Game game) {
		super(game);
		moveFromWasteToFoundationController = new MoveFromWasteToFoundationController(game);
		option = "3. Mover de descarte a palo";
	}

	@Override
	public void getMovement() {
		moveFromWasteToFoundationController.move();
	}

	@Override
	public String getOpcion() {
		return option;
	}

}
