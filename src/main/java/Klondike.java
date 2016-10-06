
import es.upm.miw.iwvg.doo.Models.Game;
import es.upm.miw.iwvg.doo.Views.GameView;

public class Klondike {
	
	public static void main(String[] args) {
		Game game = new Game();
		
	    GameView gameView  = new GameView(game);
	    gameView.renderView(game);
	}

}
