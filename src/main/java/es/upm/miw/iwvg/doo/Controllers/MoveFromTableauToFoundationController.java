package es.upm.miw.iwvg.doo.Controllers;

import es.upm.miw.iwvg.doo.Controllers.Interfaces.MoveFromStackToStack;
import es.upm.miw.iwvg.doo.Models.Game;
import es.upm.miw.iwvg.doo.Views.ErrorView;
import es.upm.miw.iwvg.doo.Views.MenuView;

public class MoveFromTableauToFoundationController extends Controller implements MoveFromStackToStack {
	
	MenuView menuView;
	ErrorView errorView;
	int tableauIndex;
	int foundationIndex;
	
	
	public MoveFromTableauToFoundationController(Game game) {
		super(game);
		menuView = new MenuView();
	}

	@Override
	public boolean canMove() {
		tableauIndex = menuView.optionSelectorGenerator("Desde qué escalera?", 7)-1;
		foundationIndex = menuView.optionSelectorGenerator("A qué palo?", 4)-1;
		if(game.checkMove(game.getTableauByIndex(tableauIndex), game.getFoundationByIndex(foundationIndex))){
			return true;
		}else{		
			return false;
		}
	}

	@Override
	public void move() {
		if(this.canMove()){
			this.game.move(game.getTableauByIndex(tableauIndex), game.getFoundationByIndex(foundationIndex));
			if(!this.game.getTableauByIndex(tableauIndex).empty()){
				this.game.getTableauByIndex(tableauIndex).peek().setHidden(false);
			}
			
		}
	}

}
