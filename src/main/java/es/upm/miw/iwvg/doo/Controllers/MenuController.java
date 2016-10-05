package es.upm.miw.iwvg.doo.Controllers;

import es.upm.miw.iwvg.doo.Utils.IO;
import es.upm.miw.iwvg.doo.Views.MenuView;

public class MenuController {

	MenuView menuView = new MenuView();
	InitGameController game = new InitGameController();
	MoveActionController moveAction = new MoveActionController();

	IO io = new IO();

	public void optionSelector(InitGameController initGame) {
		switch (this.menuView.optionSelector()) {
		case 1:
			moveAction.move(initGame);
			// case 2:
			// moveAction.move(game.getWasteStack(), game.getStockStack());
		}

	}

	public void renderOptions() {
		menuView.renderMenu();

	}

}
