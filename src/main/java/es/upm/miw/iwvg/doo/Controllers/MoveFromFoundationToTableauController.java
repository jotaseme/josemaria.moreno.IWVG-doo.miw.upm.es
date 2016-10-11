package es.upm.miw.iwvg.doo.Controllers;

import es.upm.miw.iwvg.doo.Controllers.Interfaces.MoveFromStackToStack;
import es.upm.miw.iwvg.doo.Models.Game;
import es.upm.miw.iwvg.doo.Views.ErrorView;
import es.upm.miw.iwvg.doo.Views.MenuView;

public class MoveFromFoundationToTableauController extends Controller implements MoveFromStackToStack {
	
	MenuView menuView;
	ErrorView errorView;
	int foundationIndex;
	int tableauIndex;
	
	
	
	public MoveFromFoundationToTableauController(Game game) {
		super(game);
		menuView = new MenuView();
	}

	@Override
	public boolean canMove() {
		foundationIndex = menuView.optionSelectorGenerator("Desde qué palo?", 4)-1;
		tableauIndex = menuView.optionSelectorGenerator("A qué escalera?", 7)-1;
		if(game.checkMove(game.getFoundationByIndex(foundationIndex), game.getTableauByIndex(tableauIndex))){
			return true;
		}else{		
			return false;
		}
	}

	@Override
	public void move() {
		if(this.canMove()){
			this.game.move(game.getFoundationByIndex(foundationIndex), game.getTableauByIndex(tableauIndex));			
		}
	}

}
