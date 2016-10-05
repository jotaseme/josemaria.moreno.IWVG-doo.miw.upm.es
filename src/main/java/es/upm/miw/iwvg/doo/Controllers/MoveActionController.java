package es.upm.miw.iwvg.doo.Controllers;

public class MoveActionController {

	public void move(InitGameController game) {
		if (game.getStockStack().empty()) {
			System.out.print("END OF StockStack");
		} else {
			game.getWasteStack().push(game.getStockStack().pop());
			game.getWasteStack().peek().setHidden(false);
		}

	}

}
