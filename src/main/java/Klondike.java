import es.upm.miw.iwvg.doo.Controllers.InitGameController;
import es.upm.miw.iwvg.doo.Views.InitGameView;

public class Klondike {
	
	public static void main(String[] args) {
		InitGameController initGameController = new InitGameController();
	    InitGameView initGameView  = new InitGameView();
	    initGameView.renderView(initGameController);
	

	}

}
