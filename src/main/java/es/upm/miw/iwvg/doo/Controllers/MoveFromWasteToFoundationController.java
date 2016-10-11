package es.upm.miw.iwvg.doo.Controllers;

import es.upm.miw.iwvg.doo.Controllers.Interfaces.MoveFromStackToStack;
import es.upm.miw.iwvg.doo.Models.Game;

import es.upm.miw.iwvg.doo.Views.ErrorView;
import es.upm.miw.iwvg.doo.Views.MenuView;

public class MoveFromWasteToFoundationController extends Controller implements MoveFromStackToStack {
	MenuView menuView;
	ErrorView errorView;
	int selector;
	public MoveFromWasteToFoundationController(Game game) {
		super(game);	
		errorView = new ErrorView();
		menuView = new MenuView();
	}

	@Override
	public boolean canMove() {		
		selector = menuView.optionSelectorGenerator("Seleccione palo?", 4)-1;
		if(game.checkMoveWasteToFundation(game.getWasteStack(), game.getFoundationByIndex(this.selector))){
			return true;
		}else{		
			return false;
		}
	}

	@Override
	public void move() {
		if(this.canMove()){
			this.game.move(this.game.getWasteStack(), this.game.getFoundationByIndex(this.selector));
		}else{
			errorView.render();
		}
		
	}

}
