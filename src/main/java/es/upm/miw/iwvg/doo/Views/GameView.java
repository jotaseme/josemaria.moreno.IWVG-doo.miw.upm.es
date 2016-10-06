package es.upm.miw.iwvg.doo.Views;

import es.upm.miw.iwvg.doo.Controllers.MenuController;
import es.upm.miw.iwvg.doo.Models.Game;
import es.upm.miw.iwvg.doo.Utils.IO;

public class GameView {

	TableauStackView tableauStackView;
	StockStackView stockStackView;
	WasteStackView wasteStackView;
	MenuController menuController;
	FoundationStackView foundationStackView;

	public GameView(Game game) {
		tableauStackView = new TableauStackView();
		stockStackView = new StockStackView();
		wasteStackView = new WasteStackView();
		menuController = new MenuController(game);
		foundationStackView = new FoundationStackView();

	}

	public void renderView(Game game) {
		IO io = new IO();
		boolean ok = true;
		do {
			io.writeln("===========================");
			stockStackView.renderView();
			wasteStackView.renderView(game.getWasteStack());
			foundationStackView.renderView(game.getFoundation());
			tableauStackView.renderView(game.getTableau());
			menuController.renderOptions();

		} while (ok);
	}
}
