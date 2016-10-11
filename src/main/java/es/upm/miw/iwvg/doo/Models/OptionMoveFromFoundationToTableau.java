package es.upm.miw.iwvg.doo.Models;

import java.util.ArrayList;

import es.upm.miw.iwvg.doo.Controllers.MoveFromFoundationToTableauController;

public class OptionMoveFromFoundationToTableau extends Option {
	
	MoveFromFoundationToTableauController moveFromFoundationToTableauController;
	private String option;
	
	public OptionMoveFromFoundationToTableau(Game game){
		super(game);
		moveFromFoundationToTableauController = new MoveFromFoundationToTableauController(game);
		option = "7. Mover de palo a escalera";
	}
	

	@Override
	public void getMovement() {
		moveFromFoundationToTableauController.move();
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
