package es.upm.miw.iwvg.doo.Controllers;

import es.upm.miw.iwvg.doo.Models.Game;
import es.upm.miw.iwvg.doo.Views.MenuView;

public class MenuController extends Controller {
	
	MenuView menuView;
	

	public MenuController(Game game) {
		super(game);
		/*moveFromStackToWaste = new MoveFromStackToWasteController(this.game);
		moveFromWasteToFoundation = new MoveFromWasteToFoundationController(this.game); 
		moveFromWasteToTableau = new MoveFromWasteToTableauController(this.game);*/
		menuView = MenuView.getMenuView();
	}

	public void optionSelector() {	
		this.menuView.optionSelectorGenerator("Opcion?", 9).getMovement();
		
		
		
		/*switch (this.menuView.optionSelectorGenerator("Opcion?", 9)) {
			case 1:
				moveFromStackToWaste.move();
				break;
			case 2:
				break;
			case 3:
				moveFromWasteToFoundation.move();
				break;
			case 4:
				moveFromWasteToTableau.move();
				break;			
		}*/
	}

	public void renderOptions() {
		menuView.renderMenu();
		this.optionSelector();

	}

}
