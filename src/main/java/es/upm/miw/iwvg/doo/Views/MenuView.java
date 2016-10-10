package es.upm.miw.iwvg.doo.Views;

import java.util.ArrayList;

import es.upm.miw.iwvg.doo.Models.Option;
import es.upm.miw.iwvg.doo.Models.OptionMoveFromStockToWaste;
import es.upm.miw.iwvg.doo.Utils.IO;
import es.upm.miw.iwvg.doo.Utils.LimitedIntDialog;

public class MenuView {
	IO io = new IO();
	public ArrayList<Option> menu = new ArrayList<Option>();
	private static MenuView menuView = null;
	
	private MenuView(){
		if (menuView == null){
			menuView = new MenuView();
		}
		menu.add(new OptionMoveFromStockToWaste(this));
		
		/*menu.add("2. Mover de descarte a baraja");
		menu.add("3. Mover de descarte a palo");
		menu.add("4. Mover de descarte a escalera");
		menu.add("5. Mover de escalera a palo");
		menu.add("6. Mover de escalera a escalera");
		menu.add("7. Mover de palo a escalera");
		menu.add("8. Voltear en escalera");
		menu.add("9. Salir");*/
	}
	
	public static MenuView getMenuView(){
		return menuView;
	}

	

	public void renderMenu() {
		for (Option o : menu) {
			o.getOpcion();
		}
	}
	
	public void renderOption(String option) {
		System.out.println("LEGAS AQUI");
		io.writeln(option);
	}
	
	public Option optionSelectorGenerator(String titulo, int max) {
		return menu.get(new LimitedIntDialog(titulo, 1, max).read()-1);
	}

}
