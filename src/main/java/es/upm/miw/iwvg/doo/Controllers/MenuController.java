package es.upm.miw.iwvg.doo.Controllers;

import es.upm.miw.iwvg.doo.Models.Game;
import es.upm.miw.iwvg.doo.Models.OptionGame;
import es.upm.miw.iwvg.doo.Views.MenuView;


public class MenuController extends Controller {	
	OptionGame optionGame;
	MenuView menuView;
	
	public MenuController(Game game) {
		super(game);
		optionGame = new OptionGame(game);
		menuView = new MenuView();
	}
	
	public void optionSelector() {		
		int selector = this.menuView.optionSelectorGenerator("Opcion?", 9) -1;	
		menuView.renderOption(optionGame.getOptionList().get(selector).getOpcion());
		optionGame.getOptionList().get(selector).getMovement();
	}

	public void renderOptions() {
		menuView.renderMenu(optionGame.getOptionList());
		this.optionSelector();
	}

}
