package es.upm.miw.iwvg.doo.Models;

import java.util.ArrayList;

import es.upm.miw.iwvg.doo.Controllers.MoveFromTableauToFoundationController;

public class OptionMoveFromTableauToFoundation extends Option {
	
	MoveFromTableauToFoundationController moveFromTableauToFoundationController;
	private String option;
	
	public OptionMoveFromTableauToFoundation(Game game){
		super(game);
		moveFromTableauToFoundationController = new MoveFromTableauToFoundationController(game);
		option = "5. Mover de escalera a palo";
	}
	

	@Override
	public void getMovement() {
		moveFromTableauToFoundationController.move();
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
