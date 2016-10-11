package es.upm.miw.iwvg.doo.Models;

import java.util.ArrayList;

import es.upm.miw.iwvg.doo.Controllers.MoveFromWasteToTableauController;

public class OptionMoveFromWasteToTableau extends Option {
	MoveFromWasteToTableauController moveFromWasteToTableauController;
	String option;

	public OptionMoveFromWasteToTableau(Game game) {
		super(game);
		moveFromWasteToTableauController = new MoveFromWasteToTableauController(game);
		option = "4. Mover de descarte a escalera";
	}

	@Override
	public void getMovement() {
		moveFromWasteToTableauController.move();
	}

	@Override
	public String getOpcion() {
		return option;
	}

	@Override
	public ArrayList<Option> getOptionList() {
		return super.getOptionList();
	}

}
