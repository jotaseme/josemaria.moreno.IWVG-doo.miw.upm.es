package es.upm.miw.iwvg.doo.Views;

import java.util.ArrayList;

import es.upm.miw.iwvg.doo.Utils.IO;
import es.upm.miw.iwvg.doo.Utils.LimitedIntDialog;

public class MenuView {
	 IO io = new IO();
	 ArrayList<String> menu = new ArrayList<String>();
		
	
	public int optionSelector() {
		io.writeln("===========================");
        return new LimitedIntDialog("Opcion?", 1,9).read();
    }
	
	public void renderMenu(){
		menu.add("1. Mover de baraja a descarte");
		menu.add("2. Mover de descarte a barajar");
		menu.add("3. Mover de descarte a palo");
		menu.add("4. Mover de descarte a escalera");
		menu.add("5. Mover de escalera a palo");
		menu.add("6. Mover de escalera a escalera");
		menu.add("7. Mover de palo a escalera");
		menu.add("8. Voltear en escalera");
		menu.add("9. Salir");
		
		for(String m:menu){
			io.writeln(m);
		}
	}
	

}
