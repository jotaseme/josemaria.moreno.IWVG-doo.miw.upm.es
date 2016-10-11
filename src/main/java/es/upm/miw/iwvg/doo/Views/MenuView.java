package es.upm.miw.iwvg.doo.Views;

import java.util.ArrayList;

import es.upm.miw.iwvg.doo.Models.Option;
import es.upm.miw.iwvg.doo.Utils.IO;
import es.upm.miw.iwvg.doo.Utils.LimitedIntDialog;


public class MenuView {
	IO io = new IO();
	
	public MenuView(){
	}

	public void renderMenu(ArrayList<Option>optionGame) {
		for (Option o : optionGame) {
			io.writeln(o.getOpcion());
		}
	}
	
	public void renderOption(String option) {
		io.writeln(option);
	}
	
	public int optionSelectorGenerator(String titulo, int max) {
		return (new LimitedIntDialog(titulo, 1, max).read());
	}

}
