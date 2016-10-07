package es.upm.miw.iwvg.doo.Views;

import es.upm.miw.iwvg.doo.Utils.IO;

public class ErrorView {
	
	public void render() {
		IO io = new IO();
		io.write("Movimiento no permitido\n");
	}

}
