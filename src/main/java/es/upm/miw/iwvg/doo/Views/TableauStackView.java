package es.upm.miw.iwvg.doo.Views;

import java.util.ArrayList;

import es.upm.miw.iwvg.doo.Models.Game;
import es.upm.miw.iwvg.doo.Models.TableauStack;
import es.upm.miw.iwvg.doo.Utils.IO;

public class TableauStackView {

	//REPETIDO
	public void renderView(ArrayList<TableauStack> tableauStack) {
		IO io = new IO();
		for (int i = 0; i < tableauStack.size(); i++) {
			io.write("Escalera " + (int) (i + 1) + ":");
			for (int j = 0; j < tableauStack.get(i).size(); j++) {
				new CardView(tableauStack.get(i).get(j)).render();
			}
			io.write("\n");	
		}

	}
}
