package es.upm.miw.iwvg.doo.Views;

import es.upm.miw.iwvg.doo.Controllers.InitGameController;
import es.upm.miw.iwvg.doo.Utils.IO;

public class InitGameView {
	
	public void render(InitGameController initGame) {
		
		IO io = new IO();
		io.writeln("===========================");

		for (int i = 0; i < initGame.getTableau().size(); i++) {
			
			for (int j = 0; j < initGame.getTableau().get(i).size(); j++) {				
				new CardView(initGame.getTableau().get(i).get(j)).render(i+1);
			}

		}

		// TableauStackView tableausView = new TableauStackView();
		// tableausView.render();

	}
}
