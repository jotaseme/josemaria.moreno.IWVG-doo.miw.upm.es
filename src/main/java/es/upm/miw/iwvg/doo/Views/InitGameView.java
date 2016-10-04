package es.upm.miw.iwvg.doo.Views;

import es.upm.miw.iwvg.doo.Controllers.InitGameController;
import es.upm.miw.iwvg.doo.Utils.IO;

public class InitGameView {
	
	TableauStackView tableauStackView = new TableauStackView();

	public void renderView(InitGameController initGame) {

		IO io = new IO();
		io.writeln("===========================");
		
		tableauStackView.renderView(initGame.getTableau());
		

	}
}
