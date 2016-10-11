package es.upm.miw.iwvg.doo.Controllers;

import es.upm.miw.iwvg.doo.Controllers.Interfaces.MoveFromStackToStack;
import es.upm.miw.iwvg.doo.Models.Game;
import es.upm.miw.iwvg.doo.Views.ErrorView;
import es.upm.miw.iwvg.doo.Views.MenuView;

public class MoveFromWasteToTableauController extends Controller implements MoveFromStackToStack {
	MenuView menuView;
	ErrorView errorView;
	int selector;
	public MoveFromWasteToTableauController(Game game) {
		super(game);
		menuView = new MenuView();	
		errorView = new ErrorView();
	}

	@Override
	public boolean canMove() {
		selector = menuView.optionSelectorGenerator("A qué escalera?", 7)-1;
		if(game.checkMoveWasteToTableau(game.getWasteStack(), game.getTableauByIndex(this.selector))){
			return true;
		}else{
			return false;
		}
	}

	@Override
	public void move() {
		if(this.canMove()){
			this.game.move(this.game.getWasteStack(), this.game.getTableauByIndex(this.selector));
		}else{
			errorView.render();
		}
	}

}
