package es.upm.miw.iwvg.doo.Models;

import java.util.ArrayList;

import es.upm.miw.iwvg.doo.Controllers.MoveFromTableauToTableauController;

public class OptionMoveFromTableauToTableau extends Option {
	
	MoveFromTableauToTableauController moveFromTableauToTableauController;
	private String option;
	
	public OptionMoveFromTableauToTableau(Game game){
		super(game);
		moveFromTableauToTableauController = new MoveFromTableauToTableauController(game);
		option = "6. Mover de escalera a escalera";
	}
	

	@Override
	public void getMovement() {
		moveFromTableauToTableauController.move();
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
