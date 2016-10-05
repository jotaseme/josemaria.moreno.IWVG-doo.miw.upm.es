package es.upm.miw.iwvg.doo.Views;

import es.upm.miw.iwvg.doo.Models.WasteStack;
import es.upm.miw.iwvg.doo.Utils.IO;

public class WasteStackView {
	
	public void renderView(WasteStack wasteStack) {

		IO io = new IO();
		
		if(wasteStack.empty()){
			io.write("Descarte: <vacio>\n");
		}else{
			//System.out.println("YA NO ESTA VACIO");
			io.write("Descarte: ");
			for (int i = 0; i < wasteStack.size(); i++) {
				new CardView(wasteStack.get(i)).render();
			}
			io.write("\n");	
		}
		
	}

}
