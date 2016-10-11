package es.upm.miw.iwvg.doo.Views;

import es.upm.miw.iwvg.doo.Utils.IO;

public class ErrorView {
	IO io = new IO();
	
	public void render() {	
		io.write("++++ Movimiento no permitido ++++\n");
	}
	
	public void renderEmptyStock(){
		io.write("++++ No hay mas cartas en el mazo ++++ \n");
	}

}
