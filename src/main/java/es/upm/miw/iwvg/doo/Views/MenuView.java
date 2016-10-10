package es.upm.miw.iwvg.doo.Views;

import java.util.ArrayList;

import es.upm.miw.iwvg.doo.Models.Option;
import es.upm.miw.iwvg.doo.Models.OptionMoveFromStockToWaste;
import es.upm.miw.iwvg.doo.Models.OptionMoveFromWasteToFoundation;
import es.upm.miw.iwvg.doo.Models.OptionMoveFromWasteToStock;
import es.upm.miw.iwvg.doo.Utils.IO;
import es.upm.miw.iwvg.doo.Utils.LimitedIntDialog;

public class MenuView {
	IO io = new IO();
	public ArrayList<Option> menu = new ArrayList<Option>();
	private static MenuView menuView = null;
	
	private MenuView(){
		
		menu.add(new OptionMoveFromStockToWaste());
		menu.add(new OptionMoveFromWasteToStock());
		menu.add(new OptionMoveFromWasteToFoundation());
		/*
	
		menu.add("4. Mover de descarte a escalera");
		menu.add("5. Mover de escalera a palo");
		menu.add("6. Mover de escalera a escalera");
		menu.add("7. Mover de palo a escalera");
		menu.add("8. Voltear en escalera");
		menu.add("9. Salir");
		
		*/
	}
	
	public static MenuView getMenuView(){
		if(menuView == null){
			menuView = new MenuView();
		}
		return menuView;
	}
	
	public  ArrayList<Option> getMenu(){
		return this.menu;
	}

	

	public void renderMenu() {
		for (Option o : menu) {
			o.getOpcion();
		}
	}
	
	public void renderOption(String option) {
		io.writeln(option);
	}
	
	public Option optionSelectorGenerator(String titulo, int max) {
		return menu.get(new LimitedIntDialog(titulo, 1, max).read()-1);
	}

}
