package es.upm.miw.iwvg.doo.Controllers;

import es.upm.miw.iwvg.doo.Controllers.Interfaces.MoveFromStackToStack;
import es.upm.miw.iwvg.doo.Models.Game;
import es.upm.miw.iwvg.doo.Views.ErrorView;
import es.upm.miw.iwvg.doo.Views.MenuView;

public class MoveFromTableauToTableauController extends Controller implements MoveFromStackToStack {
	
	MenuView menuView;
	ErrorView errorView;
	int fromTableauIndex;
	int toTableauIndex;
	
	
	public MoveFromTableauToTableauController(Game game) {
		super(game);
		menuView = new MenuView();
		errorView = new ErrorView();
	}

	@Override
	public boolean canMove() {
		fromTableauIndex = menuView.optionSelectorGenerator("Desde qué escalera?", 7)-1;
		toTableauIndex = menuView.optionSelectorGenerator("A qué escalera?", 7)-1;
		if(game.checkMove(game.getTableauByIndex(fromTableauIndex), game.getTableauByIndex(toTableauIndex))){
			return true;
		}else{		
			return false;
		}
	}

	@Override
	public void move() {
		if(this.canMove()){
			this.game.move(game.getTableauByIndex(fromTableauIndex), game.getTableauByIndex(toTableauIndex));
			if(!this.game.getTableauByIndex(fromTableauIndex).empty()){
				this.game.getTableauByIndex(fromTableauIndex).peek().setHidden(false);
			}
			
		}else{
			errorView.render();
		}
	}

}
