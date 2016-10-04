package es.upm.miw.iwvg.doo.Views;

import es.upm.miw.iwvg.doo.Controllers.InitGameController;
import es.upm.miw.iwvg.doo.Controllers.MenuController;
import es.upm.miw.iwvg.doo.Utils.IO;

public class InitGameView {

	TableauStackView tableauStackView = new TableauStackView();
	StockStackView stockStackView = new StockStackView();
	WasteStackView wasteStackView = new WasteStackView();
	MenuController menuController = new MenuController();
	FoundationStackView foundationStackView = new FoundationStackView();

	public void renderView(InitGameController initGame) {

		IO io = new IO();
		io.writeln("===========================");

		stockStackView.renderView();
		wasteStackView.renderView(initGame.getWasteStack());
		foundationStackView.renderView(initGame.getFoundation());
		tableauStackView.renderView(initGame.getTableau());
		
		menuController.renderOptions();
		int selector = menuController.optionSelector();

	}
}
