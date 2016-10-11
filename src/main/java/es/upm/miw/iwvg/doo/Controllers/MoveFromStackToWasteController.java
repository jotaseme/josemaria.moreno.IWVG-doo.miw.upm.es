package es.upm.miw.iwvg.doo.Controllers;

import es.upm.miw.iwvg.doo.Controllers.Interfaces.MoveFromStackToStack;
import es.upm.miw.iwvg.doo.Models.Game;
import es.upm.miw.iwvg.doo.Views.ErrorView;

public class MoveFromStackToWasteController extends Controller implements MoveFromStackToStack {
	ErrorView errorView;
	public MoveFromStackToWasteController(Game game) {
		super(game);
		errorView = new ErrorView();
	}

	@Override
	public boolean canMove() {
		if(game.checkMove(game.getStockStack(), game.getWasteStack())){
			return true;
		}else{		
			return false;
		}
	}

	@Override
	public void move() {
		if(this.canMove()){
			this.game.move(this.game.getStockStack(), this.game.getWasteStack());			
		}else{
			errorView.renderEmptyStock();
		}
	}
}
