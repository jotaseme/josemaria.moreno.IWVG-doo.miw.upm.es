package es.upm.miw.iwvg.doo.Controllers;

import es.upm.miw.iwvg.doo.Controllers.Interfaces.MoveFromStackToStack;
import es.upm.miw.iwvg.doo.Models.Game;
import es.upm.miw.iwvg.doo.Utils.LimitedIntDialog;
import es.upm.miw.iwvg.doo.Views.ErrorView;
import es.upm.miw.iwvg.doo.Views.MenuView;

public class MoveFromWasteToFoundationController extends Controller implements MoveFromStackToStack {
	MenuView menuView;
	ErrorView errorView = new ErrorView();
	int selector;
	protected MoveFromWasteToFoundationController(Game game) {
		super(game);
	}

	@Override
	public boolean canMove() {
		menuView = new MenuView();	
		selector = menuView.foundationSelector()-1;
		if(game.checkMoveWasteToFundation(game.getWasteStack(), game.getFoundationByIndex(this.selector))){
			return true;
		}else{
			errorView.render();
			return false;
		}
	}

	@Override
	public void move() {
		if(this.canMove()){
			this.game.move(this.game.getWasteStack(), this.game.getFoundationByIndex(this.selector));
		}
		
	}

}
