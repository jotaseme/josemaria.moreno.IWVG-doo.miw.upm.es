package es.upm.miw.iwvg.doo.Views;

import java.util.ArrayList;

import es.upm.miw.iwvg.doo.Controllers.InitGameController;
import es.upm.miw.iwvg.doo.Models.TableauStack;
import es.upm.miw.iwvg.doo.Utils.IO;

public class TableauStackView {
	//NOFUNCIONA
	public void render(InitGameController initGame) {
		//System.out.prin
        IO io = new IO();
        for (int i = 0; i < initGame.getTableau().size(); i++) {		
			for (int j = 0; j < initGame.getTableau().get(i).size(); j++) {
				io.writeln("Escalera " + i + 1 + ":");
				//new CardView(initGame.getTableau().get(i).get(j)).render();				
			}
		}
       
        
    }
}
