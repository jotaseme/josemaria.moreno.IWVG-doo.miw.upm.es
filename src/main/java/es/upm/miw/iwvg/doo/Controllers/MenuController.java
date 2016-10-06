package es.upm.miw.iwvg.doo.Controllers;

import es.upm.miw.iwvg.doo.Models.Game;
import es.upm.miw.iwvg.doo.Views.MenuView;

public class MenuController extends Controller {

	public MenuController(Game game) {
		super(game);
		// TODO Auto-generated constructor stub
	}

	MenuView menuView = new MenuView();
	
	MoveFromStackToWasteController moveFromStackToWaste = new MoveFromStackToWasteController(this.game); 
	MoveFromWasteToFoundationController moveFromWasteToFoundation = new MoveFromWasteToFoundationController(this.game); 

	public void optionSelector() {
		
		switch (this.menuView.optionSelector()) {
		case 1:
			moveFromStackToWaste.move();
			break;
		case 3:
			moveFromWasteToFoundation.move();
			
		}

	}

	public void renderOptions() {
		menuView.renderMenu();
		this.optionSelector();

	}

}
